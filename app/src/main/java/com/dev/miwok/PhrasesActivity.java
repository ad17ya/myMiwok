package com.dev.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Where are you going?","minto wuksus"));
        words.add(new word("What is your name?","tinna oyaase'na"));
        words.add(new word("My name is...","oyaaset"));
        words.add(new word("How are you feeling?","michaksas?"));
        words.add(new word("I'm feeling good.","kuchi achit"));
        words.add(new word("Are you coming?","aanas'aa?"));
        words.add(new word("Yes, I'm coming.","haa'aanam"));
        words.add(new word("I'm coming.","aanam"));
        words.add(new word("Let's go.","yoowutis"));
        words.add(new word("come here.","anninem"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
