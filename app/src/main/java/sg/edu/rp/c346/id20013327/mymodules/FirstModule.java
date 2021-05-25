package sg.edu.rp.c346.id20013327.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstModule extends AppCompatActivity {

    TextView code;
    TextView name;
    TextView year;
    TextView sem;
    TextView credit;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_module);

        code = findViewById(R.id.code);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        sem = findViewById(R.id.sem);
        credit = findViewById(R.id.credit);
        venue = findViewById(R.id.venue);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("code");
        String moduleName = intentReceived.getStringExtra("name");
        int moduleYear = intentReceived.getIntExtra("year", 2021);
        int moduleSem = intentReceived.getIntExtra("sem", 1);
        int moduleCredit = intentReceived.getIntExtra("credit", 4);
        String moduleVenue = intentReceived.getStringExtra("venue");

        code.setText("Module Code: " + moduleCode);
        name.setText("Module Name: " + moduleName);
        year.setText("Academic Year: " + moduleYear);
        sem.setText("Semester: " + moduleSem);
        credit.setText("Module Credit: " + moduleCredit);
        venue.setText("Venue: " + moduleVenue);
//        finish();

    }
}