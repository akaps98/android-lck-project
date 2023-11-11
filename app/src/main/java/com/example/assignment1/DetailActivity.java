package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment1.model.Team;

public class DetailActivity extends AppCompatActivity {
    Team team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        team = (Team) intent.getSerializableExtra("team");

        ImageView smallLogo = (ImageView) findViewById(R.id.smallLogo);
        TextView teamName = (TextView) findViewById(R.id.teamName);
        ImageView teamMember = (ImageView) findViewById(R.id.teamMember);
        TextView year = (TextView) findViewById(R.id.year);
        TextView top = (TextView) findViewById(R.id.topPlayer);
        TextView jug = (TextView) findViewById(R.id.jugPlayer);
        TextView mid = (TextView) findViewById(R.id.midPlayer);
        TextView adc = (TextView) findViewById(R.id.adcPlayer);
        TextView sup = (TextView) findViewById(R.id.supPlayer);

        smallLogo.setImageResource(team.getLogo());
        teamName.setText(team.getName());
        teamMember.setImageResource(team.getPlayers_pic());
        year.append(team.getSince());
        top.append(team.getPlayers().get("top"));
        jug.append(team.getPlayers().get("jug"));
        mid.append(team.getPlayers().get("mid"));
        adc.append(team.getPlayers().get("adc"));
        sup.append(team.getPlayers().get("sup"));
    }
}