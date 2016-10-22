/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.ism.model.chart.properties.ChartType;
import org.ism.model.chart.properties.DashStyle;
import org.ism.model.chart.properties.Point;

/**
 *
 * @author r.hendrick
 */
public class ChartSerie {

    /**
     * A line series. If the type option is not specified, it is inherited from
     * chart.type.
     *
     * For options that apply to multiple series, it is recommended to add them
     * to the pointOptions.series options structure. To apply to all series of
     * this specific type, apply it to plotOptions.line.
     */
    private ChartType type = null;
    /**
     * Allow this series' points to be selected by clicking on the markers, bars
     * or pie slices. Defaults to false. Try it:
     *
     * Line, column, pie
     */
    private Boolean allowPointSelect = null;
    /**
     * Enable or disable the initial animation when a series is displayed. The
     * animation can also be set as a configuration object. Please note that
     * this option only applies to the initial animation of the series itself.
     * For other animations, see chart.animation and the animation parameter
     * under the API methods.	The following properties are supported:duration
     * The duration of the animation in milliseconds. easing A string reference
     * to an easing function set on the Math object. See the easing demo. Due to
     * poor performance, animation is disabled in old IE browsers for column
     * charts and polar charts.
     *
     * Defaults to true.
     */
    private Boolean animation = null;
    /**
     * For some series, there is a limit that shuts down initial animation by
     * default when the total number of points in the chart is too high. For
     * example, for a column chart and its derivatives, animation doesn't run if
     * there is more than 250 points totally. To disable this cap, set
     * animationLimit to Infinity.
     */
    private Integer animationLimit = null;

    /**
     * borderColor: Color The color of the border surrounding each slice. When
     * null, the border takes the same color as the slice fill. This can be used
     * together with a borderWidth to fill drawing gaps created by antialiazing
     * artefacts in borderless pies.
     *
     * In styled mode, the border stroke is given in the .highcharts-point
     * class.
     *
     * Defaults to #ffffff. Try it:
     *
     * Black border. Styled mode.
     */
    private String borderColor = null;

    /**
     * borderWidth: Number The width of the border surrounding each slice.
     *
     * When setting the border width to 0, there may be small gaps between the
     * slices due to SVG antialiasing artefacts. To work around this, keep the
     * border width at 0.5 or 1, but set the borderColor to null instead.
     *
     * In styled mode, the border stroke width is given in the .highcharts-point
     * class.
     *
     * Defaults to 1. Try it:
     *
     * 3px border. Styled mode.
     */
    private Integer borderWidth = null;

    /**
     * center: Array<String|Number>
     * The center of the pie chart relative to the plot area. Can be percentages
     * or pixel values. The default behaviour (as of 3.0) is to center the pie
     * so that all slices and data labels are within the plot area. As a
     * consequence, the pie may actually jump around in a chart with dynamic
     * values, as the data labels move. In that case, the center should be
     * explicitly set, for example to ["50%", "50%"]. Defaults to [null, null].
     * Try it:
     *
     * Centered at 100, 100
     */
    private Point center = null;

    /**
     * A class name to apply to the series' graphical elements.
     */
    private String className = null;

    /**
     * colors: Array<Color>Since 3.0 A series specific or series type specific
     * color set to use instead of the global colors. Try it:
     *
     * Set default colors for all pies
     */
    private List<String> colors = null;

    /**
     * colorByPoint: BooleanSince 2.0 When using automatic point colors pulled
     * from the options.colors collection, this option determines whether the
     * chart should receive one color per series or one color per point.
     * Defaults to false. Try it:
     *
     * False by default, true See also:
     *
     * series colors
     */
    private Boolean colorByPoint = null;

    /**
     * cursor: String You can set the cursor to "pointer" if you have click
     * events attached to the series, to signal to the user that the points and
     * lines can be clicked. Try it:
     *
     * Pointer cursor on line graph, on columns, on scatter markers See also:
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     */
    private String cursor = null;

    /**
     * series<line>.data An array of data points for the series. For the line
     * series type, points can be given in the following ways: An array of
     * numerical values. In this case, the numerical values will be interpreted
     * as y options. The x values will be automatically calculated, either
     * starting at 0 and incremented by 1, or from pointStart and pointInterval
     * given in the series options. If the axis has categories, these will be
     * used. Example: data: [0, 5, 3, 5] An array of arrays with 2 values. In
     * this case, the values correspond to x,y. If the first value is a string,
     * it is applied as the name of the point, and the x value is inferred.
     *
     * data: [ [0, 1], [1, 2], [2, 8] ] An array of objects with named values.
     * The objects are point configuration objects as seen below. If the total
     * number of data points exceeds the series' turboThreshold, this option is
     * not available.
     *
     * data: [{ x: 1, y: 10, name: "Point2", color: "#00FF00" }, { x: 1, y: 6,
     * name: "Point1", color: "#FF00FF" }] Try it:
     *
     * Numerical values Arrays of numeric x and y Arrays of datetime x and y
     * Arrays of point.name and y Config objects
     */
    private List<ChartSerieData> datas = null;

    /**
     * A name for the dash style to use for the graph. Applies only to series
     * type having a graph, like line, spline, area and scatter in case it has a
     * lineWidth. The value for the dashStyle include: Solid ShortDash ShortDot
     * ShortDashDot ShortDashDotDot Dot Dash LongDash DashDot LongDashDot
     * LongDashDotDot Defaults to Solid. Try it:
     *
     * Possible values demonstrated, chart suitable for printing in black and
     * white See also:
     *
     * In styled mode, the stroke dash-array can be set with the same classes as
     * listed under series.color.
     */
    private DashStyle dashStyle = null;

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

    private List<Double> data = new ArrayList<Double>();

    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;

    /**
     *
     */
    public ChartSerie() {
    }

    /**
     *
     * @param serieName
     */
    public ChartSerie(String serieName) {
        this.name = serieName;
    }

    /**
     * *
     *
     * @return
     */
    public boolean isUnused() {
        return unused;
    }

   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        unused = name != null;
    }

    public List<Double> getData() {
        return data;
    }

    public ChartType getType() {
        return type;
    }

    public void setType(ChartType type) {
        this.type = type;
        unused = type != null;
    }

    public Boolean getAllowPointSelect() {
        return allowPointSelect;
    }

    public void setAllowPointSelect(Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        unused = allowPointSelect != null;
    }

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
        unused = animation != null;
    }

    public Integer getAnimationLimit() {
        return animationLimit;
    }

    public void setAnimationLimit(Integer animationLimit) {
        this.animationLimit = animationLimit;
        unused = animationLimit != null;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        unused = borderColor != null;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        unused = borderWidth != null;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
        unused = center != null;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
        unused = className != null;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
        unused = colors != null;
    }

    public Boolean getColorByPoint() {
        return colorByPoint;
    }

    public void setColorByPoint(Boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        unused = colorByPoint != null;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
        unused = cursor != null;
    }

    public List<ChartSerieData> getDatas() {
        return datas;
    }

    public void setDatas(List<ChartSerieData> datas) {
        this.datas = datas;
        unused = datas != null;
    }

    public DashStyle getDashStyle() {
        return dashStyle;
    }

    public void setDashStyle(DashStyle dashStyle) {
        this.dashStyle = dashStyle;
        unused = dashStyle != null;
    }

    public void setData(List<Double> data) {
        this.data = data;
        unused = data != null;
    }

    public void add(ChartSerieData chartSerieData) {
        if (datas == null) {
            datas = new ArrayList<ChartSerieData>();
        }
        datas.add(chartSerieData);
        unused = chartSerieData != null;
    }

}
