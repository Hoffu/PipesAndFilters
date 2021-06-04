package sample;

import javafx.collections.FXCollections;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import model.*;

import java.util.ArrayList;

public class Controller {
    public LineChart lineChart;

    public void initialize() {
        LinearPipeline pipeline = new LinearPipeline("AND");
        pipeline.addLink(new LoadFileFilter("C:\\Users\\Hoffu\\IdeaProjects\\PipesAndFilters\\asdf.csv"));
        pipeline.addLink(new SummarizeNumbersFilter());
        pipeline.addLink(new MinValueFilter());
        pipeline.addLink(new MaxValueFilter());
        OutputStreamImpl outputStream = new OutputStreamImpl();
        pipeline.process(outputStream);
        System.out.println(outputStream.readResults().toString());

        ArrayList<XYChart.Data<Object, Object>> xyCharts = new ArrayList<>();
        int[] inputNumbers = new ConvertStringToIntArray(outputStream.readInput()).convert();
        for (int i = 0; i < inputNumbers.length; i++) {
            xyCharts.add(new XYChart.Data<>(i + 1, inputNumbers[i]));
        }
        lineChart.getData().add(new XYChart.Series<>(FXCollections.observableArrayList(xyCharts)));
    }
}
