package ma.ac.inpt.asedsfitness2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.Column3d;
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

        //first chart (pie chart)
        Pie pie = AnyChart.pie();

        List<DataEntry> pieData = new ArrayList<>();
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