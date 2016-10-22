/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart.axis;

import org.ism.model.chart.axis.AxisTitle;

/**
 *
 * @author r.hendrick
 */
public class YAxis {

    /**
     * Titre de l'axe
     */
    private AxisTitle title = null;

    /**
     *
     */
    private PlotLines plotLines = null;

    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;

    /**
     * *
     *
     * @return
     */
    public boolean isUnused() {
        return unused;
    }

    public AxisTitle getTitle() {
        if (title == null) {
            title = new AxisTitle();
        }
        return title;
    }

    public void setTitle(AxisTitle title) {
        getTitle();
        this.title = title;
        unused = title != null;
    }

    public PlotLines getPlotLines() {
        if (plotLines == null) {
            plotLines = new PlotLines();
        }
        return plotLines;
    }

    public void setPlotLines(PlotLines plotLines) {
        this.plotLines = plotLines;
        unused = title != null;
    }

}
