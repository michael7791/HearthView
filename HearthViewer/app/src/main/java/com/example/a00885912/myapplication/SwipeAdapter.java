package com.example.a00885912.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mick on 11/30/2015.
 */
public class SwipeAdapter extends PagerAdapter{
    private ArrayList<Card> arr;
    private Context c;
    private LayoutInflater inflater;

    public SwipeAdapter(Context c, ArrayList<Card> arr) {
        this.arr = arr;
        this.c = c;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View Itemview = inflater.inflate(R.layout.fragment_gallery,container,false);
        TextView flavor = (TextView)Itemview.findViewById(R.id.flavorText);
        ImageView img = (ImageView)Itemview.findViewById(R.id.imageView);
        flavor.setText(arr.get(position).getFlavorText());
        img.setImageResource(arr.get(position).getImgSrc());
        container.addView(Itemview);
        return Itemview;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (RelativeLayout)object);
    }
}
