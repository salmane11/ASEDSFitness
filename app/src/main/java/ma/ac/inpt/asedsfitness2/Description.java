package ma.ac.inpt.asedsfitness2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Description extends AppCompatActivity {
    TextView textView, textView1;
    ImageView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        textView = findViewById(R.id.textViewExerciseDescription);
        textView1= findViewById(R.id.textViewTitleOfExercise);
        imageView1 = findViewById(R.id.imageViewExDesc1);
        imageView2 = findViewById(R.id.imageViewExDesc2);
        Intent intent = getIntent();
        ExerciseObject object = (ExerciseObject) intent.getSerializableExtra("ex");
        textView.setText(object.description);
        textView1.setText(object.title);
        imageView1.setImageResource(object.descImage1);
        imageView2.setImageResource(object.descImage2);

    }
}
