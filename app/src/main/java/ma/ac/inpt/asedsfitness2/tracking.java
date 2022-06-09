package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

public class tracking extends AppCompatActivity {
    TextView textView;
    EditText weight;
    EditText repetition;
    EditText set;
    Button btn;
    ArrayList<NewExercise> trackingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        textView = findViewById(R.id.textView11);
        weight = findViewById(R.id.editText);
        repetition = findViewById(R.id.editTextNumber);
        set = findViewById(R.id.editTextNumber2);
        Intent intent = getIntent();
        ExerciseObject object = (ExerciseObject) intent.getSerializableExtra("obj");
        textView.setText(object.title);
        btn= findViewById(R.id.button);

        loadData();
        Log.d("array", trackingList.size()+"");


      btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calling method to save data in shared prefs.
                trackingList.add(new NewExercise(object.title, object.title,Double.parseDouble(String.valueOf(weight.getText())),Integer.parseInt(String.valueOf(repetition.getText())),Integer.parseInt(String.valueOf(set.getText())), new Date()));
                saveData();
            }
        });
    }
    private void saveData(){


        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(trackingList);
        editor.putString("trackingExercice", json);
        editor.apply();
        Toast.makeText(tracking.this,"data saved",Toast.LENGTH_LONG).show();
    }
    private void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("trackingExercice", null);
        Type type = new TypeToken<ArrayList<NewExercise>>() {}.getType();
        trackingList = gson.fromJson(json, type);
        if (trackingList == null) {
            trackingList = new ArrayList<>();
        }
    }




    }
