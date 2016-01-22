package com.example.a00885912.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Mick on 11/30/2015.
 */
public class Gallery extends Fragment {
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_viewpager, container, false);
        ViewPager vp = (ViewPager)myView.findViewById(R.id.pager);
        try {
            DatabaseHelper helper = new DatabaseHelper(getActivity());
            SQLiteDatabase db = helper.getWritableDatabase();
            ArrayList<Card> cards = helper.getAllCards(db);
            SwipeAdapter adapter = new SwipeAdapter(getActivity(),cards);
            vp.setAdapter(adapter);
        } catch(IOException e) {}
        return myView;
    }
}
