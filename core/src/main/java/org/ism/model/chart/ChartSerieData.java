/**
 *
 * series<pie>.data An array of data points for the series. For the pie series
 * type, points can be given in the following ways: An array of numerical
 * values. In this case, the numerical values will be interpreted as y options.
 * Example: data: [0, 5, 3, 5] An array of objects with named values. The
 * objects are point configuration objects as seen below. If the total number of
 * data points exceeds the series' turboThreshold, this option is not available.
 *
 * data: [{ y: 1, name: "Point2", color: "#00FF00" }, { y: 7, name: "Point1",
 * color: "#FF00FF" }] Try it:
 *
 * The demos use a line series, but the principle is the same for all types.
 *
 * Numerical values Arrays of numeric x and y Arrays of datetime x and y Arrays
 * of point.name and y Config objects
 */
package org.ism.model.chart;

import java.util.List;

/**
 *
 * @author r.hendrick
 */
public class ChartSerieData {

    /**
     * An additional, individual class name for the data point's graphic
     * representation.
     */
    private String className = null;

    /**
     * Individual color for the point. By default the color is pulled from the
     * global colors array. Defaults to undefined. Try it:
     *
     * Mark the highest point
     */
    private String color = null;

    /**
     * Styled mode only. A specific color index to use for the point, so its
     * graphic representations are given the class name highcharts-color-{n}.
     */
    private Integer colorIndex = null;

    /**
     * Individual data label for each point. The options are the same as the
     * ones for plotOptions.series.dataLabels Try it:
     *
     * Show a label for the last value
     */
    private Object dataLabels = null;

    /**
     * Requires Accessibility module
     *
     * A description of the point to add to the screen reader information about
     * the point.
     *
     * Defaults to undefined. Try it:
     *
     * Accessible map
     */
    private String description = null;

    /**
     * The id of a series in the drilldown.series array to use for a drilldown
     * for this point. Try it:
     *
     * Basic drilldown
     */
    private String drilldow = null;

    /**
     * An id for the point. This can be used after render time to get a pointer
     * to the point object through chart.get(). Try it:
     *
     * Remove an id'd point
     */
    private String id = null;

    /**
     * The rank for this point's data label in case of collision. If two data
     * labels are about to overlap, only the one with the highest labelrank will
     * be drawn.
     */
    private Integer labelrank = null;

    /**
     * legendIndex: Number The sequential index of the data point in the legend.
     */
    private Integer legendIndex = null;

    /**
     * series<line>.data.marker
     */
    private ChartSerieMarker marker = null;

    /**
     * The name of the point as shown in the legend, tooltip, dataLabel etc.
     *
     * If the xAxis.type is set to category, and no categories option exists,
     * the category will be pulled from the point.name of the last series
     * defined. For multiple series, best practice however is to define
     * xAxis.categories.
     *
     * Try it:
     *
     * Point names
     */
    private String name = null;

    /**
     * Whether the data point is selected initially. Defaults to false.
     */
    private Boolean selected = null;

    /**
     * sliced: Boolean Whether to display a slice offset from the center.
     * Defaults to false. Try it:
     *
     * One sliced point
     */
    private Boolean sliced = null;

    /**
     * The x value of the point. For datetime axes, the X value is the timestamp
     * in milliseconds since 1970.
     */
    private Double x = null;
    /**
     * y: Number The y value of the point.
     */
    private Double y = null;
    
    /**
     * This is util when using multiple serie
     */
    private List<Double> ys = null;

    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;

    public ChartSerieData() {
    }

    public ChartSerieData(String name, Double y){
        this.name = name;
        this.y = y;
        unused = false;
    }
    
    public ChartSerieData(String name, List<Double> ys){
        this.name = name;
        this.ys = ys;
        unused = false;
    }
    
    public ChartSerieData(String name, Double y, Boolean sliced, Boolean selected){
        this.name = name;
        this.y = y;
        this.sliced = sliced;
        this.selected = selected;
        unused = false;
    }

    public ChartSerieData(List<Double> ys) {
       this.ys = ys;
        unused = false;
    }

    
    
    
    
    /**
     * *
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

    public Integer getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(Integer colorIndex) {
        this.colorIndex = colorIndex;
        unused = colorIndex != null;
    }

    public Object getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(Object dataLabels) {
        this.dataLabels = dataLabels;
        unused = dataLabels != null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        unused = description != null;
    }

    public String getDrilldow() {
        return drilldow;
    }

    public void setDrilldow(String drilldow) {
        this.drilldow = drilldow;
        unused = drilldow != null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        unused = id != null;
    }

    public Integer getLabelrank() {
        return labelrank;
    }

    public void setLabelrank(Integer labelrank) {
        this.labelrank = labelrank;
        unused = labelrank != null;
    }

    public Integer getLegendIndex() {
        return legendIndex;
    }

    public void setLegendIndex(Integer legendIndex) {
        this.legendIndex = legendIndex;
        unused = legendIndex != null;
    }

    public ChartSerieMarker getMarker() {
        return marker;
    }

    public void setMarker(ChartSerieMarker marker) {
        this.marker = marker;
        unused = marker != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        unused = name != null;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean Selected) {
        this.selected = Selected;
        unused = Selected != null;
    }

    public Boolean getSliced() {
        return sliced;
    }

    public void setSliced(Boolean sliced) {
        this.sliced = sliced;
        unused = sliced != null;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
        unused = x != null;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
        unused = y != null;
    } 

    public List<Double> getYs() {
        return ys;
    }

    public void setYs(List<Double> ys) {
        this.ys = ys;
        unused = ys != null;
    }
    
    
}
