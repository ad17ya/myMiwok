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

        words.add(new word("one","lutti", R.drawable.number_one));
        words.add(new word("two","otiiko", R.drawable.number_two));
        words.add(new word("three","tolooksu", R.drawable.number_three));
        words.add(new word("four","oyyisa", R.drawable.number_four));
        words.add(new word("five","massokka", R.drawable.number_five));
        words.add(new word("six","temmokka", R.drawable.number_six));
        words.add(new word("seven","kenekkaku", R.drawable.number_seven));
        words.add(new word("eight","kawinta", R.drawable.number_eight));
        words.add(new word("nine","wo'e", R.drawable.number_nine));
        words.add(new word("ten","na'aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}