package com.dev.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<word> words = new ArrayList<>();

        words.add(new word("father","epe", R.drawable.family_father, R.raw.family_father));
        words.add(new word("mother","eta", R.drawable.family_mother, R.raw.family_mother));
        words.add(new word("son","angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new word("daughter","tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new word("older brother","taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new word("younger brother","chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new word("older sister","tete", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new word("younger sister","kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new word("grandmother","ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new word("grandfather","paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,words, R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word Word = words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this,Word.getmAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}