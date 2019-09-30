package com.ardi.topuniversity;

import android.os.Parcel;
import android.os.Parcelable;

public class University implements Parcelable {
private String namaUniv;
private String detailUniv;
private String websiteUniv;
private String alamatUniv;
private int logoUniv;
private int fotoUniv;

    public String getNamaUniv() {
        return namaUniv;
    }

    public void setNamaUniv(String namaUniv) {
        this.namaUniv = namaUniv;
    }

    public String getDetailUniv() {
        return detailUniv;
    }

    public void setDetailUniv(String detailUniv) {
        this.detailUniv = detailUniv;
    }

    public String getWebsiteUniv() {
        return websiteUniv;
    }

    public void setWebsiteUniv(String websiteUniv) {
        this.websiteUniv = websiteUniv;
    }

    public String getAlamatUniv() {
        return alamatUniv;
    }

    public void setAlamatUniv(String alamatUniv) {
        this.alamatUniv = alamatUniv;
    }

    public int getLogoUniv() {
        return logoUniv;
    }

    public void setLogoUniv(int logoUniv) {
        this.logoUniv = logoUniv;
    }

    public int getFotoUniv() {
        return fotoUniv;
    }

    public void setFotoUniv(int fotoUniv) {
        this.fotoUniv = fotoUniv;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaUniv);
        dest.writeString(this.detailUniv);
        dest.writeString(this.websiteUniv);
        dest.writeString(this.alamatUniv);
        dest.writeInt(this.logoUniv);
        dest.writeInt(this.fotoUniv);
    }

    public University() {
    }

    protected University(Parcel in) {
        this.namaUniv = in.readString();
        this.detailUniv = in.readString();
        this.websiteUniv = in.readString();
        this.alamatUniv = in.readString();
        this.logoUniv = in.readInt();
        this.fotoUniv = in.readInt();
    }

    public static final Parcelable.Creator<University> CREATOR = new Parcelable.Creator<University>() {
        @Override
        public University createFromParcel(Parcel source) {
            return new University(source);
        }

        @Override
        public University[] newArray(int size) {
            return new University[size];
        }
    };
}
