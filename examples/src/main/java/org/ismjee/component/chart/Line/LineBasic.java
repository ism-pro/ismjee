/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ismjee.component.chart.Line;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.ism.model.chart.ChartSerie;
import org.ism.model.chart.properties.ChartType;
import org.ism.model.chart.ChartModel;
import org.ism.model.chart.ChartSerieData;
import org.ism.model.chart.properties.Align;

/**
 *
 * @author r.hendrick
 */
@ManagedBean(name = "lineBasic")
public class LineBasic implements Serializable {

    private ChartModel model;
    private String serieName="";

    @PostConstruct
    public void init() {
        createLineModels();
    }

    private void createLineModels() {
        model = new ChartModel();
        model.getChart().setType(ChartType.LINE);
        // Seutp Title
        model.getTitle().setText("Monthly Average Temperature");
        model.getTitle().setX(-20);
        // Setup SubTitle
        model.getSubTitle().setText("Source: WorldClimate.com");
        model.getSubTitle().setX(-20);
        // Setup xAxis
        List<String> xAxis = new ArrayList<String>();
        Collections.addAll(xAxis, "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        model.getxAxis().setCategories(xAxis);
        // Setup yAxis
        model.getyAxis().getTitle().setText("Temperature (°C)");
        model.getyAxis().getPlotLines().setValue(0);
        model.getyAxis().getPlotLines().setWidth(1);
        model.getyAxis().getPlotLines().setColor("#808080");
        // Setup Tooltip
        model.getTooltip().setValueSuffix("°C");
        // Setup Legend
        model.getLegend().setLayout(Align.VERTICAL);
        model.getLegend().setAlign(Align.RIGHT);
        model.getLegend().setVerticalAlign(Align.MIDDLE);
        model.getLegend().setBorderWidth(0);

        List<Double> lTokyo = new ArrayList<Double>();
        Collections.addAll(lTokyo, 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6);
        ChartSerie sTokyo = new ChartSerie("Tokyo");
        sTokyo.add(new ChartSerieData(lTokyo));
        model.addSerie(sTokyo);

        List<Double> lNewYorck = new ArrayList<Double>();
        Collections.addAll(lNewYorck, -0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5);
        ChartSerie sNewYorck = new ChartSerie("New York");
        sNewYorck.add(new ChartSerieData(lNewYorck));
        model.addSerie(sNewYorck);

        List<Double> lBerlin = new ArrayList<Double>();
        Collections.addAll(lBerlin, -0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0);
        ChartSerie sBerlin = new ChartSerie("Berlin");
        sBerlin.add(new ChartSerieData(lBerlin));
        model.addSerie(sBerlin);

        List<Double> lLondon = new ArrayList<Double>();
        Collections.addAll(lLondon, 3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8);
        ChartSerie sLondon = new ChartSerie("London");
        sLondon.add(new ChartSerieData(lLondon));
        model.addSerie(sLondon);
    }

    public void handlerMarkerApplyTo() {
        model.markerApplyTo(serieName);
    }

    public void handlerMarkerApply() {
        model.markerApply();
    }

    public ChartModel getModel() {
        if (model == null) {
            createLineModels();
        }
        return model;
    }

    public String getSerieName() {
        return serieName;
    }

    public void setSerieName(String serieName) {
        this.serieName = serieName;
    }
    
    
    
}
