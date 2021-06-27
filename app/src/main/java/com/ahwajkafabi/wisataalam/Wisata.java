package com.ahwajkafabi.wisataalam;

import android.os.Parcel;
import android.os.Parcelable;

public class Wisata implements Parcelable {
    private String name;
    private String desc;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.desc);
        dest.writeString(this.photo);
    }

    Wisata() {

    }

    private Wisata(Parcel in) {
        this.name = in.readString();
        this.desc = in.readString();
        this.photo = in.readString();
    }

    public static final Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public com.ahwajkafabi.wisataalam.Wisata createFromParcel(Parcel source) {
            return new com.ahwajkafabi.wisataalam.Wisata(source);
        }

        @Override
        public com.ahwajkafabi.wisataalam.Wisata[] newArray(int size) {
            return new com.ahwajkafabi.wisataalam.Wisata[size];
        }
    };
}
