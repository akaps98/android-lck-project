package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment1.model.Team;

public class DetailActivity extends AppCompatActivity {
    Team team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // receive intent from previous activity (team)
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

        // set all the required materials
        smallLogo.setImageResource(team.getLogo());
        teamName.setText(team.getName());
        teamMember.setImageResource(team.getPlayers_pic());
        year.append(team.getSince());
        top.append(team.getPlayers().get("top"));
        jug.append(team.getPlayers().get("jug"));
        mid.append(team.getPlayers().get("mid"));
        adc.append(team.getPlayers().get("adc"));
        sup.append(team.getPlayers().get("sup"));

        // if the user clicks team logo, it connects to team Youtube.
        smallLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (team.getName()) {
                    case "KT Rolster":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@ktRolster_VOD"));
                        break;
                    case "T1":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@SKTT1"));
                        break;
                    case "Gen.G":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@gengesports"));
                        break;
                    case "Dplus KIA":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@DplusKIA_LOL"));
                        break;
                    case "Hanwha Life Esports":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@HanwhaLifeEsports"));
                        break;
                    case "Liiv Sandbox":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@LiivSANDBOX"));
                        break;
                    case "DRX":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@DRXGlobal"));
                        break;
                    case "Kwangdong Freecs":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@kwangdongfreecs"));
                        break;
                    case "Brion":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@BRIONESPORTS"));
                        break;
                    case "Nongshim RedForce":
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@NSRedForce"));
                        break;
                    default:
                        intent = new Intent();
                        break;
                }
                startActivity(intent);
            }
        });

        Intent teamTitle = new Intent();
        teamTitle.putExtra("teamTitle", team.getName());

        // give back team name to ListActivity
        setResult(RESULT_OK, teamTitle);
    }
}