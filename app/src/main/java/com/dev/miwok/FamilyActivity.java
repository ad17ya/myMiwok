package com.dev.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("father","epe"));
        words.add(new word("mother","eta"));
        words.add(new word("son","angsi"));
        words.add(new word("daughter","tune"));
        words.add(new word("older brother","taachi"));
        words.add(new word("younger brother","chalitti"));
        words.add(new word("older sister","tete"));
        words.add(new word("younger sister","kolliti"));
        words.add(new word("grandmother","ama"));
        words.add(new word("grandfather","paapa"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}