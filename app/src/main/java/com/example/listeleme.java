package com.example.socialmediaapplication;

import android.support.annotation.DrawableRes;

public class listeleme {
    public String title;
    @DrawableRes public int image;
    public int nextActivity;



    listeleme(String title, int image, int nextActivity){
        this.title=title;
        this.image=image;
        this.nextActivity=nextActivity;

    }
}
