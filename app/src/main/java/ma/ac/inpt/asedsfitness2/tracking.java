package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class tracking extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        //textView = findViewById(R.id.textView11);
        //Intent intent = getIntent();
       // ExerciseObject object = (ExerciseObject) intent.getSerializableExtra("obj");
        //textView.setText(object.title);
    }
}