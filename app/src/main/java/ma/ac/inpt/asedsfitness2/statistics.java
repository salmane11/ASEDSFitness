package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.Column3d;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Pie;
import com.anychart.anychart.ValueDataEntry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class statistics extends AppCompatActivity {

    //List<String> muscles=new ArrayList<String>();
    //List<Long> exercises=new ArrayList<Long>();

    TextView totalExercises,totalRepititions,totalCalories,totalWorkouts;

    List<NewExercise> exercicesList=new ArrayList<NewExercise>();
    List<String>categories=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        //date format
        /**DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String todaysdate = dateFormat.format(date);*/

        /**NewExercise firstExercise=new NewExercise("crunches","abs",20.00,20,3,date);
        NewExercise secondExercise=new NewExercise("bench press","chest",20.00,20,3,date);
        NewExercise thirdExercise=new NewExercise("squat","legs",20.00,20,3,date);
        NewExercise fourthExercise=new NewExercise("shoulders press","shoulder",20.00,20,3,date);
        NewExercise fifthExercise=new NewExercise("crunches","abs",20.00,20,3,date);*/


        /**exercicesList.add(firstExercise);
        exercicesList.add(secondExercise);
        exercicesList.add(thirdExercise);
        exercicesList.add(fourthExercise);
        exercicesList.add(fifthExercise);*/

        totalExercises=findViewById(R.id.exercises_number);
        totalRepititions=findViewById(R.id.repetitions_number);
        totalCalories=findViewById(R.id.calories_counter);
        totalWorkouts=findViewById(R.id.workouts_number);

        //first chart (pie chart)
        Pie pie = AnyChart.pie();

        List<DataEntry> pieData = new ArrayList<>();

        /**int repitionsCounter=0;
        for(int i=0;i<exercicesList.size();i++){

            //increment repitions counter
            repitionsCounter+=exercicesList.get(i).getRepetitions();

            int counter=0;
            String category=exercicesList.get(i).getCategory();
            if(categories.contains(category)){
                break;
            }
            categories.add(category);
            for(int j=0;j<exercicesList.size();j++){
                if(exercicesList.get(j).getCategory().equals(category)){
                    counter++;
                }
            }
            pieData.add(new ValueDataEntry(category, counter));
        }
        //set repitionsCounter to total repitions text
        totalRepititions.setText(repitionsCounter);
        totalExercises.setText(exercicesList.size());
        totalCalories.setText(repitionsCounter*10);*/

        pieData.add(new ValueDataEntry("Chest", 2));
        pieData.add(new ValueDataEntry("Shoulders", 3));
        pieData.add(new ValueDataEntry("Back", 1));
        pieData.add(new ValueDataEntry("legs", 5));
        pieData.add(new ValueDataEntry("ABS", 1));
        pie.data(pieData);
        AnyChartView touchedBodyParts = (AnyChartView) findViewById(R.id.body_parts_pie);
        touchedBodyParts.setChart(pie);



        //second chart (bars chart)
        AnyChartView anyChartView = findViewById(R.id.exercises_per_day_chart);
        //anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian3d cartesian = AnyChart.column3d();

        List<DataEntry> data = new ArrayList<>();

        /**for(int i=0;i<exercicesList.size();i++){
            int counter=0;
            Date exerciseDate=exercicesList.get(i).getExerciseDate();
            for(int j=0;j<exercicesList.size();j++){
                if(exercicesList.get(j).getExerciseDate().equals(exerciseDate)){
                    counter++;
                }
            }
            data.add(new ValueDataEntry(exerciseDate.toString(), counter));
        }
        totalWorkouts.setText(data.size());*/

        data.add(new ValueDataEntry("monday", 80540));
        data.add(new ValueDataEntry("Thursday", 94190));
        data.add(new ValueDataEntry("Wednesday", 102610));
        data.add(new ValueDataEntry("tuesday", 110430));
        data.add(new ValueDataEntry("Friday", 128000));
        data.add(new ValueDataEntry("saturday", 143760));
        data.add(new ValueDataEntry("sunday", 170670));

        Column3d column = cartesian.column(data);

        /**column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(EnumsAnchor.CENTER_BOTTOM)
                .offsetX(0d)
                .offsetY(5d)
                .format("${%Value}{groupsSeparator: }");

        cartesian.animation(true);
        cartesian.title("Top 10 Cosmetic Products by Revenue");

        cartesian.yScale().minimum(0d);

        cartesian.yAxis(0).labels().format("${%Value}{groupsSeparator: }");

        cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
        cartesian.interactivity().hoverMode(HoverMode.BY_X);

        cartesian.xAxis(0).title("Product");
        cartesian.yAxis(0).title("Revenue");**/

        anyChartView.setChart(cartesian);

    }
}