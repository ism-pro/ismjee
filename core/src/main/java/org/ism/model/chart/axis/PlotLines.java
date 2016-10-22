/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart.axis;

import org.ism.model.chart.properties.DashStyle;

/**
 *
 * An array of objects representing plot lines on the X axis
 *
 * @author r.hendrick
 */
public class PlotLines {

    /**
     * className: StringSince 5.0.0 A custom class name, in addition to the
     * default highcharts-plot-line, to apply to each individual line.
     */
    private String className = null;

    /**
     * color: Color The color of the line. Try it:
     *
     * A red line from X axis
     */
    private String color = null;

    /**
     * dashStyle: StringSince 1.2 The dashing or dot style for the plot line.
     * For possible values see this overview. Defaults to Solid. Try it:
     *
     * Dash and dot pattern
     */
    private DashStyle dashStyle = DashStyle.SOLID;

    // Event
    /**
     * id: String An id used for identifying the plot line in
     * Axis.removePlotLine. Try it:
     *
     * Remove plot line by id
     */
    private String id = null;

    // label
    /**
     * value: Number The position of the line in axis units. Try it:
     *
     * Between two categories on X axis
     */
    private Integer value = null;

    /**
     * width: Number The width or thickness of the plot line. Try it:
     *
     * 2px wide line from X axis
     */
    private Integer width = null;

    /**
     * zIndex: NumberSince 1.2 The z index of the plot line within the chart.
     * Try it:
     *
     * Behind plot lines by default, above plot lines, above plot lines and
     * series.
     */
    private Integer zIndex = null;

    
    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;
    
    /***
     * 
     * @return 
     */
    public boolean isUnused() {
        return unused;
    }
    
    
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
        unused = className != null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        unused = color != null;
    }

    public DashStyle getDashStyle() {
        return dashStyle;
    }

    public void setDashStyle(DashStyle dashStyle) {
        this.dashStyle = dashStyle;
        unused = dashStyle != null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        unused = id != null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
        unused = value != null;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
        unused = width != null;
    }

    public Integer getzIndex() {
        return zIndex;
    }

    public void setzIndex(Integer zIndex) {
        this.zIndex = zIndex;
        unused = zIndex != null;
    }


}
