package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Button button=findViewById(R.id.startButton);
        Button statisticsButton=findViewById(R.id.statisticsButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SplashScreen.this, Activity_exercices_description.class);
                startActivity(intent1);
            }
        });

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SplashScreen.this, statistics.class);
                startActivity(intent1);
            }
        });

    }


}