/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ismjee.component.chart.Pie;

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


/**
 *
 * @author r.hendrick
 */
@ManagedBean (name = "pieBasic")
public class PieBasic implements Serializable{
    private ChartModel model;
    
    
    @PostConstruct
    public void init() {
        createLineModels();
    }


    private void createLineModels() {
        model =  new ChartModel();
        model.getChart().setType(ChartType.PIE);
        model.getChart().setPlotBackgroundCorlor(null);
        model.getChart().setPlotBorderWidth(null);
        model.getChart().setPlotShadow(false);
        // Seutp Title
        model.getTitle().setText("Browser market shares January, 2015 to May, 2015");
        // Setup Tooltip
        model.getTooltip().setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        // Setup plotOptions
        model.getPlotOptions().setAllowPointSelect(true);
        model.getPlotOptions().setCursor("pointer");
        model.getPlotOptions().getDataLabels().setEnabled(true);
        model.getPlotOptions().getDataLabels().setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
        model.getPlotOptions().getDataLabels().setStyle("color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'");
        // Setup serie
        ChartSerie sBrands = new ChartSerie("Brands");
        sBrands.setColorByPoint(Boolean.TRUE);
        sBrands.add(new ChartSerieData("Microsoft Internet Explorer", 56.33));
        sBrands.add(new ChartSerieData("Chrome", 24.03, true, true));
        sBrands.add(new ChartSerieData("Firefox",10.38));
        sBrands.add(new ChartSerieData("Safari", 4.77));
        sBrands.add(new ChartSerieData("Opera", 0.91));
        sBrands.add(new ChartSerieData("Proprietary or Undetectable",0.2));
        
        
        model.addSerie(sBrands);
        
       
    }
    
    
     
    public ChartModel getModel() {
        if(model==null){
            createLineModels();
        }
        return model;
    }
}
