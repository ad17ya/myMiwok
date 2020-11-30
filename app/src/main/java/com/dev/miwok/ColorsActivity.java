package com.dev.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("red","wetetti"));
        words.add(new word("green","chokokki"));
        words.add(new word("brown","takaakki"));
        words.add(new word("grey","topoppi"));
        words.add(new word("black","kululli"));
        words.add(new word("white","kelelli"));
        words.add(new word("dusty yellow","topiisa"));
        words.add(new word("mustard yellow","chiwiita"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}