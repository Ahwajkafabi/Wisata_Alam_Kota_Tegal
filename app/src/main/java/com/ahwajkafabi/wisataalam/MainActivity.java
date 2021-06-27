package com.ahwajkafabi.wisataalam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "10 Tempat Wisata";
    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);
        list.addAll(WisataData.getListData());
        setActionBarTitle(title);
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list);

        listWisataAdapter.setOnItemClickCallback(new ListWisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wisata data) {
                showSelectedWisata(data);
            }
        });
        rvWisata.setAdapter(listWisataAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedWisata(Wisata data) {
        Intent intent = new Intent(this, DetailWisata.class);
        intent.putExtra("NAMA", data.getName());
        intent.putExtra("DESC", data.getDesc());
        intent.putExtra("PHOTO", data.getPhoto());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about) {
            Intent aboutIntent = new Intent(this, AboutMe.class);
            startActivity(aboutIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}