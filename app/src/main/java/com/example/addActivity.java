package com.example.socialmediaapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class addActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    Button button;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        button=findViewById(R.id.git);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent();
            }
        });
    }

    private void dispatchTakePictureIntent(){
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);}
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        image=findViewById(R.id.photo);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image.setImageBitmap(imageBitmap);
        }
    }
}
