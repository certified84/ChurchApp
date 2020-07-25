package com.certified.churchapp.models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String profile_image;
    private String name;
    private String email;

    public User() {
    }

    public User(String profile_image, String name, String email) {
        this.profile_image = profile_image;
        this.name = name;
        this.email = email;
    }

    protected User(Parcel in) {
        profile_image = in.readString();
        name = in.readString();
        email = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(profile_image);
        dest.writeString(name);
        dest.writeString(email);
    }
}
