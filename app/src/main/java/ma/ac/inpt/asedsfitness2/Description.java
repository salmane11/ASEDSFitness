package ma.ac.inpt.asedsfitness2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Description extends AppCompatActivity {
    TextView textView, textView1;
    ImageView imageView1,imageView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deescription);
        textView = findViewById(R.id.textViewExerciseDescription);
        textView1= findViewById(R.id.textViewTitleOfExercise);
        imageView1 = findViewById(R.id.imageViewExDesc1);
        imageView2 = findViewById(R.id.imageViewExDesc2);

        button = findViewById(R.id.buttonAddExercise);

        Intent intent = getIntent();
        ExerciseObject object = (ExerciseObject) intent.getSerializableExtra("ex");
        textView.setText(object.description);
        textView1.setText(object.title);
        imageView1.setImageResource(object.descImage1);
        imageView2.setImageResource(object.descImage2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Description.this, tracking.class);
                if (object!=null) intent1.putExtra("obj",object);
                startActivity(intent1);
            }
        });

    }

}
