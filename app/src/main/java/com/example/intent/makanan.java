package com.example.intent;

import android.os.Parcel;
import android.os.Parcelable;

public class makanan implements Parcelable {
    private String namaMakanan;
    private String asalMakanan;
    private String bahanUtama;

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getAsalMakanan() {
        return asalMakanan;
    }

    public void setAsalMakanan(String asalMakanan) {
        this.asalMakanan = asalMakanan;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public void setBahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaMakanan);
        dest.writeString(this.asalMakanan);
        dest.writeString(this.bahanUtama);
    }

    public makanan() {
    }

    protected makanan(Parcel in) {
        this.namaMakanan = in.readString();
        this.asalMakanan = in.readString();
        this.bahanUtama = in.readString();
    }

    public static final Parcelable.Creator<makanan> CREATOR = new Parcelable.Creator<makanan>() {
        @Override
        public makanan createFromParcel(Parcel source) {
            return new makanan(source);
        }

        @Override
        public makanan[] newArray(int size) {
            return new makanan[size];
        }
    };
}
