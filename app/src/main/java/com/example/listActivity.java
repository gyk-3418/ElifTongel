package com.example.socialmediaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listActivity extends AppCompatActivity {
    ListView listView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=findViewById(R.id.liste);

        button=findViewById(R.id.listeleme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);
            }
        });
        Adapter adapter=new Adapter() ;
        adapter.context=this;
        adapter.itemList=createListele();
        listView.setAdapter(adapter);
    }

    public ArrayList<listeleme> createListele(){
        ArrayList<listeleme> itemModelArraylist=new ArrayList<>();
        listeleme itemModel=new listeleme("Perfect",R.drawable.common_full_open_on_phone,0);
        listeleme itemModel1=new listeleme("Perfect",R.drawable.common_full_open_on_phone,0);
        listeleme itemModel2=new listeleme("Perfect",R.drawable.common_full_open_on_phone,0);
        listeleme itemModel3=new listeleme("Perfect",R.drawable.common_full_open_on_phone,0);

        itemModelArraylist.add(itemModel);
        itemModelArraylist.add(itemModel1);
        itemModelArraylist.add(itemModel2);
        itemModelArraylist.add(itemModel3);

        return itemModelArraylist;

    }
}
