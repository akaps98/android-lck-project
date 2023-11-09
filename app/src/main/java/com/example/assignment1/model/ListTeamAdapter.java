package com.example.assignment1.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment1.R;

import java.util.ArrayList;

public class ListTeamAdapter extends BaseAdapter {
    ArrayList<Team> teams = new ArrayList<>();
    Context context;

    @Override
    public int getCount() {
        return teams.size();
    }

    @Override
    public Object getItem(int position) {
        return teams.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context = parent.getContext();
        Team team = teams.get(position);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_team, parent,false);
        }

        TextView name = convertView.findViewById(R.id.name);
        TextView since = convertView.findViewById(R.id.since);
        ImageView logo = convertView.findViewById(R.id.logoView);

        name.setText(team.name);
        since.setText(team.since);
        logo.setImageResource(R.drawable.kt_logo);

        return convertView;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }
}
