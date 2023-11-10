package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.assignment1.model.ListTeamAdapter;
import com.example.assignment1.model.Team;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    ListTeamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listView);
        adapter = new ListTeamAdapter();

        adapter.addTeam(new Team("KT Rolster", "2012", "kt_logo.png"));
        adapter.addTeam(new Team("T1", "2013", "kt_logo.png"));
        adapter.addTeam(new Team("Gen.G", "2013", "kt_logo.png"));
        adapter.addTeam(new Team("Dplus KIA", "2019", "kt_logo.png"));
        adapter.addTeam(new Team("Hanwha Life Esports", "2015", "kt_logo.png"));
        adapter.addTeam(new Team("Livv Sandbox", "2019", "kt_logo.png"));
        adapter.addTeam(new Team("DRX", "2012", "kt_logo.png"));
        adapter.addTeam(new Team("Kwangdong Freecs", "2015", "kt_logo.png"));
        adapter.addTeam(new Team("Brion", "2012", "kt_logo.png"));
        adapter.addTeam(new Team("Nongshim RedForce", "2020", "kt_logo.png"));

        listView.setAdapter(adapter);
    }
}