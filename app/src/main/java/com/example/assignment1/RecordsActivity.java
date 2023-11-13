package com.example.assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.Toast;

public class RecordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        TableRow most_champion = (TableRow) findViewById(R.id.most_champion);
        TableRow best_game_record = (TableRow) findViewById(R.id.best_game_record);
        TableRow best_match_record = (TableRow) findViewById(R.id.best_match_record);
        TableRow worst_record = (TableRow) findViewById(R.id.worst_record);
        TableRow longest_win_streak = (TableRow) findViewById(R.id.longest_win_streak);
        TableRow longest_lose_streak = (TableRow) findViewById(R.id.longest_lose_streak);

        most_champion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(RecordsActivity.this);
                dlg.setTitle("Most Championships");
                dlg.setMessage("T1; 10 times");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RecordsActivity.this, "Most championships", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        best_game_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(RecordsActivity.this);
                dlg.setTitle("Best Game Record");
                dlg.setMessage("Gen.G; 2022 SUMMER (35 kills - 5 deaths; 87.5%)");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RecordsActivity.this, "Best game record", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        best_match_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(RecordsActivity.this);
                dlg.setTitle("Best Match Record");
                dlg.setMessage("T1; 2022 Spring (18 wins - 0 lose; 100%)");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RecordsActivity.this, "Best match record", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        worst_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(RecordsActivity.this);
                dlg.setTitle("Worst Record");
                dlg.setMessage("Brion; 2019 Spring (3 kills - 35 deaths; 7.9%)");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RecordsActivity.this, "Worst record", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        longest_win_streak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(RecordsActivity.this);
                dlg.setTitle("Longest Winning Streak");
                dlg.setMessage("T1; 2022 Spring - 2022 Summer (24 matches winning streak)");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RecordsActivity.this, "Longest winning streak", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });

        longest_lose_streak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(RecordsActivity.this);
                dlg.setTitle("Longest Losing Streak");
                dlg.setMessage("Brion; 2019 Spring - 2019 Summer (22 matches losing streak)");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RecordsActivity.this, "Longest losing streak", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });
    }
}