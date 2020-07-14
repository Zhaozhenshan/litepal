package com.example.litepal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
public class SongAdapter extends ArrayAdapter<Song> {
    private int resourceId;
    public SongAdapter(Context context, int textViewResourceId, List<Song> Objects) {
        super(context, textViewResourceId, Objects);
        resourceId = textViewResourceId;
    }
        public View getView(int position,View convertView , ViewGroup parent)
        {
             Song song = getItem(position);
             View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
             TextView songname=view.findViewById(R.id.song_name);
             songname.setText(song.getName());
             return view;
        }
}
