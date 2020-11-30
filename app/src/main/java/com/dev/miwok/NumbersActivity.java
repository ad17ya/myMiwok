package com.dev.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one","lutti"));
        words.add(new word("two","otiiko"));
        words.add(new word("three","tolooksu"));
        words.add(new word("four","oyyisa"));
        words.add(new word("five","massokka"));
        words.add(new word("six","temmokka"));
        words.add(new word("seven","kenekkaku"));
        words.add(new word("eight","kawinta"));
        words.add(new word("nine","wo'e"));
        words.add(new word("ten","na'aacha"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}