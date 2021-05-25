package sg.edu.rp.c346.id20013327.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Step 1
    TextView tvmonday, tvtuesday, tvwednesday, tvthursday, tvfriday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2
        tvmonday = findViewById(R.id.C203);
        tvtuesday = findViewById(R.id.C346);
        tvwednesday = findViewById(R.id.C235);
        tvthursday = findViewById(R.id.C206);
        tvfriday = findViewById(R.id.C218);

        tvmonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web application developement in php");
                intent.putExtra("year", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67N");
                startActivity(intent);

            }
        });

        tvtuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development or Android Programming");
                intent.putExtra("year", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E62E");
                startActivity(intent);

            }
        });

        tvwednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("code", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67N");
                startActivity(intent);

            }
        });

        tvthursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67N");
                startActivity(intent);

            }
        });

        tvfriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64G");
                startActivity(intent);

            }
        });


    }
}