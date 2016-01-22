package com.example.a00885912.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DeckBuilder extends AppCompatActivity {
    private DatabaseHelper helper;
    private SQLiteDatabase db;
    ArrayList<Card> allCards;
    HashMap<Integer,Card> deckCards = new HashMap<Integer,Card>();
    int deckCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_builder);
        handleList();
    }

    public void handleList() {
        final ListView lv = (ListView)findViewById(R.id.cards);
        final ListView lv2 = (ListView)findViewById(R.id.decks);
        allCards = new ArrayList<>();
        try{
            helper = new DatabaseHelper(this);
            db = helper.getReadableDatabase();
        } catch(IOException e) {}
        allCards = helper.getAllCards(db);
        ListAdapter adapter = new ListAdapter(this,R.layout.list_view,allCards.toArray(new Card[allCards.size()]));
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> av, View v, int i, long a) {
                if(deckCount < 30) {
                    Toast.makeText(DeckBuilder.this, "Added Card", Toast.LENGTH_LONG).show();
                    Card temp = (Card) av.getAdapter().getItem(i);
                    deckCards.put(deckCount++, temp);
                    ListAdapter list2adapter = new ListAdapter(DeckBuilder.this, R.layout.list_view,deckCards.values().toArray(new Card[deckCards.size()]));
                    lv2.setAdapter(list2adapter);
                } else {
                    Toast.makeText(DeckBuilder.this, "Too many cards", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    //need to add onclicklistener to items

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_deck_builder, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
