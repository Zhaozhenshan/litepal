package com.example.litepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import org.litepal.LitePal;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  List<Song>  SongList= LitePal.findAll(Song.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button adddata = findViewById(R.id.add_data);
        adddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Song song1 = new Song();
                song1.setName("First");
                song1.setDuration(320);
                song1.save();

                Song song2 = new Song();
                song2.setName("Second");
                song2.setDuration(356);
                song2.save();

                Song song3 = new Song();
                song3.setName("Third");
                song3.setDuration(400);
                song3.save();

                Song song4 = new Song();
                song4.setName("Four");
                song4.setDuration(400);
                song4.save();

                Song song5 = new Song();
                song5.setName("Five");
                song5.setDuration(400);
                song5.save();
            }
        });
        Button lookdata = findViewById(R.id.query_data);
        lookdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Song> allSongs = LitePal.findAll(Song.class);
                for(Song song:allSongs){
                   System.out.println("name:"+song.getName()+"  duration:"+song.getDuration());
                }
            }
        });
        Button deletedata = findViewById(R.id.delete_data);
        deletedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 LitePal.deleteAll(Song.class);

            }
        });
        Button update = findViewById(R.id.update_data);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Song newsong = new Song();
                  newsong.setDuration(999);
                  newsong.updateAll("name = ?","Five");
            }
        });

        SongAdapter adapter = new SongAdapter(MainActivity.this,R.layout.song_item,SongList);
        ListView listview = findViewById(R.id.list_view);
        listview.setAdapter(adapter);


    }
}