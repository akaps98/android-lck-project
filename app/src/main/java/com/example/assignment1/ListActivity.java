package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import java.util.HashMap;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    ListTeamAdapter adapter;
    Team team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listView);
        adapter = new ListTeamAdapter();

        HashMap<String, String> kt_players = new HashMap<>();
        kt_players.put("top", "Kiin");
        kt_players.put("jug", "Cuzz");
        kt_players.put("mid", "BDD");
        kt_players.put("adc", "Aiming");
        kt_players.put("sup", "Kiin");

        HashMap<String, String> t1_players = new HashMap<>();
        t1_players.put("top", "Zeus");
        t1_players.put("jug", "Oner");
        t1_players.put("mid", "Faker");
        t1_players.put("adc", "Gumayusi");
        t1_players.put("sup", "Keria");

        HashMap<String, String> geng_players = new HashMap<>();
        geng_players.put("top", "Doran");
        geng_players.put("jug", "Peanut");
        geng_players.put("mid", "Chovy");
        geng_players.put("adc", "Peyz");
        geng_players.put("sup", "Delight");

        HashMap<String, String> dplus_players = new HashMap<>();
        dplus_players.put("top", "Canna");
        dplus_players.put("jug", "Canyon");
        dplus_players.put("mid", "ShowMaker");
        dplus_players.put("adc", "Deft");
        dplus_players.put("sup", "Kellin");

        HashMap<String, String> hanwha_players = new HashMap<>();
        hanwha_players.put("top", "Kingen");
        hanwha_players.put("jug", "Grizzly");
        hanwha_players.put("mid", "Zeka");
        hanwha_players.put("adc", "Viper");
        hanwha_players.put("sup", "Life");

        HashMap<String, String> liiv_players = new HashMap<>();
        liiv_players.put("top", "Burdol");
        liiv_players.put("jug", "Willer");
        liiv_players.put("mid", "Clozer");
        liiv_players.put("adc", "Teddy");
        liiv_players.put("sup", "Kael");

        HashMap<String, String> drx_players = new HashMap<>();
        drx_players.put("top", "Rascal");
        drx_players.put("jug", "Croco");
        drx_players.put("mid", "FATE");
        drx_players.put("adc", "Paduck");
        drx_players.put("sup", "BeryL");

        HashMap<String, String> freecs_players = new HashMap<>();
        freecs_players.put("top", "DuDu");
        freecs_players.put("jug", "YoungJae");
        freecs_players.put("mid", "BuLLDoG");
        freecs_players.put("adc", "Taeyoon");
        freecs_players.put("sup", "Jun");

        HashMap<String, String> brion_players = new HashMap<>();
        brion_players.put("top", "Morgan");
        brion_players.put("jug", "UmTi");
        brion_players.put("mid", "Karis");
        brion_players.put("adc", "Hena");
        brion_players.put("sup", "Effort");

        HashMap<String, String> nongshim_players = new HashMap<>();
        nongshim_players.put("top", "DnDn");
        nongshim_players.put("jug", "Sylvie");
        nongshim_players.put("mid", "FIESTA");
        nongshim_players.put("adc", "vital");
        nongshim_players.put("sup", "Peter");


        adapter.addTeam(new Team("KT Rolster", "2012", R.drawable.kt_logo, R.drawable.kt_members, kt_players));
        adapter.addTeam(new Team("T1", "2013", R.drawable.t1_logo, R.drawable.t1_members, t1_players));
        adapter.addTeam(new Team("Gen.G", "2013", R.drawable.geng_logo, R.drawable.geng_members, geng_players));
        adapter.addTeam(new Team("Dplus KIA", "2019", R.drawable.dplus_logo, R.drawable.dplus_members, dplus_players));
        adapter.addTeam(new Team("Hanwha Life Esports", "2015", R.drawable.hanwha_logo, R.drawable.hanwha_members, hanwha_players));
        adapter.addTeam(new Team("Liiv Sandbox", "2019", R.drawable.liiv_logo, R.drawable.liiv_members, liiv_players));
        adapter.addTeam(new Team("DRX", "2012", R.drawable.drx_logo, R.drawable.drx_members, drx_players));
        adapter.addTeam(new Team("Kwangdong Freecs", "2015", R.drawable.freecs_logo, R.drawable.freecs_members, freecs_players));
        adapter.addTeam(new Team("Brion", "2012", R.drawable.brion_logo, R.drawable.brion_members, brion_players));
        adapter.addTeam(new Team("Nongshim RedForce", "2020", R.drawable.nongshim_logo, R.drawable.nongshim_members, nongshim_players));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Team team = (Team) adapter.getItem(position);
//                team = new Team("DRX", "2012", R.drawable.drx_logo);
                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                ListView listView = (ListView) parent;
                intent.putExtra("team", adapter.getItem(position));
                startActivityForResult(intent, 200);
            }
        });
    }
}