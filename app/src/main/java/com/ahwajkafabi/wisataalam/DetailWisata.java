package com.ahwajkafabi.wisataalam;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailWisata extends AppCompatActivity {

    public static final String EXTRA_NAME = "NAMA";
    public static final String EXTRA_DESC = "DESC";
    public static final String EXTRA_PHOTO = "PHOTO";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wisata_detail);

        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDesc = findViewById(R.id.tv_item_desc);
        ImageView ivPhoto = findViewById(R.id.img_item_photo);

        setActionBarTitle("Detail Wisata");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        tvName.setText(name);
        tvDesc.setText(desc);
        Glide.with(getApplicationContext())
                .load(photo)
                .into(ivPhoto);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
