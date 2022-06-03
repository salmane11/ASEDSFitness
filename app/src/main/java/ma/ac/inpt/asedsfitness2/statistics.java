package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Pie;
import com.anychart.anychart.ValueDataEntry;

import java.util.ArrayList;
import java.util.List;

public class statistics extends AppCompatActivity {

    //List<String> muscles=new ArrayList<String>();
    //List<Long> exercises=new ArrayList<Long>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        Pie pie = AnyChart.pie();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Chest", 2));
        data.add(new ValueDataEntry("Shoulders", 3));
        data.add(new ValueDataEntry("Back", 1));
        data.add(new ValueDataEntry("legs", 5));
        data.add(new ValueDataEntry("ABS", 1));
        pie.data(data);
        AnyChartView touchedBodyParts = (AnyChartView) findViewById(R.id.body_parts_pie);
        touchedBodyParts.setChart(pie);
    }
}