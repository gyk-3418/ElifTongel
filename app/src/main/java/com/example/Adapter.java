package com.example.socialmediaapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    public ArrayList<listeleme> itemList=new ArrayList<>();
    public Context context;


    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View view=View.inflate(context,R.layout.listeleme_item,null);

        ImageView image=view.findViewById(R.id.listImage);
        TextView title=view.findViewById(R.id.listTitle);

        image.setImageResource(itemList.get(position).image);
        title.setText(itemList.get(position).title);

        return view;
    }
}
