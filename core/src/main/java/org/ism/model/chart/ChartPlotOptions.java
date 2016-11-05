/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart;

import java.util.List;
import org.ism.model.chart.properties.DataLabels;
import org.ism.model.chart.properties.Point;
import org.ism.model.chart.properties.Zone;

/**
 * <h1>ChartPlotOptions</h1>
 *
 * <h2>Description</h2>
 * The plotOptions is a wrapper object for config objects for each series type.
 * The config objects for each series can also be overridden for each series
 * item as given in the series array.
 *
 * Configuration options for the series are given in three levels. Options for
 * all series in a chart are given in the plotOptions.series object. Then
 * options for all series of a specific type are given in the plotOptions of
 * that type, for example plotOptions.line. Next, options for one single series
 * are given in the series array.
 *
 *
 * @author r.hendrick
 */
public class ChartPlotOptions {

    /**
     * allowPointSelect: BooleanSince 1.2.0 Allow this series' points to be
     * selected by clicking on the markers, bars or pie slices. Defaults to
     * false. Try it:
     *
     * Line, column, pie
     */
    private Boolean allowPointSelect = null;

    /**
     * Enable or disable the initial animation when a series is displayed. The
     * animation can also be set as a configuration object. Please note that
     * this option only applies to the initial animation of the series itself.
     * For other animations, see chart.animation and the animation parameter
     * under the API methods.	The following properties are supported:
     *
     * duration The duration of the animation in milliseconds. easing A string
     * reference to an easing function set on the Math object. See the easing
     * demo. Due to poor performance, animation is disabled in old IE browsers
     * for column charts and polar charts.
     *
     * Defaults to true. Try it:
     *
     * Animation disabled, slower animation, custom easing function.
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
     * The color of the border surrounding each slice. When null, the border
     * takes the same color as the slice fill. This can be used together with a
     * borderWidth to fill drawing gaps created by antialiazing artefacts in
     * borderless pies.
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
     *
     */
    private Integer borderWidth = null;

    /**
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
     * className: StringSince 5.0.0 A class name to apply to the series'
     * graphical elements.
     */
    private String className = null;

    /**
     * A series specific or series type specific color set to use instead of the
     * global colors. Try it:
     *
     * Set default colors for all pies
     */
    private List<String> colors = null;

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
     *
     */
    private DataLabels dataLabels = null;

    /**
     * depth: NumberSince 4.0 The thickness of a 3D pie. Requires
     * highcharts-3d.js Defaults to 0. Try it:
     *
     * Basic 3D pie chart
     */
    private Integer depth = null;

    /**
     * description: StringSince 5.0.0 Requires Accessibility module
     *
     * A description of the series to add to the screen reader information about
     * the series.
     *
     * Defaults to undefined. Try it:
     *
     * Accessible stock chart
     */
    private String description = null;

    /**
     * enableMouseTracking: Boolean Enable or disable the mouse tracking for a
     * specific series. This includes point tooltips and click events on graphs
     * and points. For large datasets it improves performance. Defaults to true.
     * Try it:
     *
     * No mouse tracking
     */
    private Boolean enableMouseTracking = null;

    /**
     * endAngle: NumberSince 1.3.6 The end angle of the pie in degrees where 0
     * is top and 90 is right. Defaults to startAngle plus 360. Defaults to
     * null. Try it:
     *
     * Semi-circle donut
     */
    private Integer endAngle = null;

    /**
     * getExtremesFromAll: BooleanSince 4.1.6 Whether to use the Y extremes of
     * the total chart width or only the zoomed area when zooming in on parts of
     * the X axis. By default, the Y axis adjusts to the min and max of the
     * visible data. Cartesian series only. Defaults to false.
     */
    private Boolean extremesFromAll = null;

    /**
     * ignoreHiddenPoint: BooleanSince 2.3.0 Equivalent to
     * chart.ignoreHiddenSeries, this option tells whether the series shall be
     * redrawn as if the hidden point were null.
     *
     * The default value changed from false to true with Highcharts 3.0.
     *
     * Defaults to true. Try it:
     *
     * True, the hiddden point is ignored
     */
    private Boolean ignoreHiddenPoint = null;

    /**
     * innerSize: String|NumberSince 2.0 The size of the inner diameter for the
     * pie. A size greater than 0 renders a donut chart. Can be a percentage or
     * pixel value. Percentages are relative to the pie size. Pixel values are
     * given as integers.
     *
     * Note: in Highcharts < 4.1.2, the percentage was relative to the plot
     * area, not the pie size.
     *
     * Defaults to 0. Try it:
     *
     * 80px inner size, 50% of the plot area, 3D donut.
     */
    private String innerSize = null;

    /**
     * keys: Array<String>Since 4.1.6 An array specifying which option maps to
     * which key in the data point array. This makes it convenient to work with
     * unstructured data arrays from different sources. Try it:
     *
     * An extended data array with keys See also:
     *
     * series.data
     */
    private List<String> keys = null;

    /**
     * linkedTo: StringSince 3.0 The id of another series to link to.
     * Additionally, the value can be ":previous" to link to the previous
     * series. When two series are linked, only the first one appears in the
     * legend. Toggling the visibility of this also toggles the linked series.
     * Try it:
     *
     * Linked series
     */
    private String linkedTo = null;

    /**
     * minSize: NumberSince 3.0 The minimum size for a pie in response to auto
     * margins. The pie will try to shrink to make room for data labels in side
     * the plot area, but only to this size. Defaults to 80.
     */
    private Integer minSize = null;

    /**
     * selected: BooleanSince 1.2.0 Whether to select the series initially. If
     * showCheckbox is true, the checkbox next to the series name will be
     * checked for a selected series. Defaults to false. Try it:
     *
     * One out of two series selected
     */
    private Boolean selected = null;

    /**
     * shadow: Boolean|Object Whether to apply a drop shadow to the graph line.
     * Since 2.3 the shadow can be an object configuration containing color,
     * offsetX, offsetY, opacity and width. Defaults to false. Try it:
     *
     * Shadow enabled
     */
    private Boolean shadow = null;

    /**
     * showInLegend: Boolean Whether to display this particular series or series
     * type in the legend. Since 2.1, pies are not shown in the legend by
     * default. Defaults to false. Try it:
     *
     * One series in the legend, one hidden
     */
    private Boolean showInLegend = null;

    /**
     * size: String|Number The diameter of the pie relative to the plot area.
     * Can be a percentage or pixel value. Pixel values are given as integers.
     * The default behaviour (as of 3.0) is to scale to the plot area and give
     * room for data labels within the plot area. As a consequence, the size of
     * the pie may vary when points are updated and data labels more around. In
     * that case it is best to set a fixed value, for example "75%". Defaults to
     * . Try it:
     *
     * Smaller pie
     */
    private String size = null;

    /**
     * slicedOffset: Number If a point is sliced, moved out from the center, how
     * many pixels should it be moved?. Defaults to 10. Try it:
     *
     * 20px offset
     */
    private Integer slicedOffset = null;

    /**
     * startAngle: NumberSince 2.3.4 The start angle of the pie slices in
     * degrees where 0 is top and 90 right. Defaults to 0. Try it:
     *
     * Start from right
     */
    private Integer startAngle = null;

    /**
     * stickyTracking: Boolean Sticky tracking of mouse events. When true, the
     * mouseOut event on a series isn't triggered until the mouse moves over
     * another series, or out of the plot area. When false, the mouseOut event
     * on a series is triggered when the mouse leaves the area around the
     * series' graph or markers. This also implies the tooltip. When
     * stickyTracking is false and tooltip.shared is false, the tooltip will be
     * hidden when moving the mouse between series. Defaults to false.
     */
    private Boolean stickyTracking = null;

    /**
     * tooltip: ObjectSince 2.3 A configuration object for the tooltip rendering
     * of each single series. Properties are inherited from tooltip, but only
     * the following properties can be defined on a series level.
     */
    private ChartToolTip tooltip = null;

    /**
     * visible: Boolean Set the initial visibility of the series. Defaults to
     * true. Try it:
     *
     * Two series, one hidden and one visible
     */
    private Boolean visible = null;

    /**
     * zoneAxis: StringSince 4.1.0 Defines the Axis on which the zones are
     * applied. Defaults to y. Try it:
     *
     * Zones on the X-Axis See also:
     *
     * zones
     */
    private String zoneAxis = null;

    /**
     * An array defining zones within a series. Zones can be applied to the X
     * axis, Y axis or Z axis for bubbles, according to the zoneAxis option.
     *
     * In styled mode, the color zones are styled with the .highcharts-zone-{n}
     * class, or custom classed from the className option (view live demo).
     *
     * Try it:
     *
     * Color zones
     */
    private Zone zone = null;

    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;

    /***
     * <h1>isUnused</h1>
     * Standard method to describe if class was used by set or get method
     * 
     * @return unused to know if change was made
     */
    public boolean isUnused() {
        return unused;
    }

    public Boolean getAllowPointSelect() {
        return allowPointSelect;
    }

    public void setAllowPointSelect(Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        unused = allowPointSelect != null;
    }

    public Boolean getAnaimation() {
        return animation;
    }

    public void setAnaimation(Boolean animation) {
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

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
        unused = cursor != null;
    }

    public DataLabels getDataLabels() {
        if (dataLabels == null) {
            dataLabels = new DataLabels();
        }
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        getDataLabels();
        this.dataLabels = dataLabels;
        unused = dataLabels != null;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
        unused = depth != null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        unused = description != null;
    }

    public Boolean getEnableMouseTracking() {
        return enableMouseTracking;
    }

    public void setEnableMouseTracking(Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        unused = enableMouseTracking != null;
    }

    public Integer getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(Integer endAngle) {
        this.endAngle = endAngle;
        unused = endAngle != null;
    }

    public Boolean getExtremesFromAll() {
        return extremesFromAll;
    }

    public void setExtremesFromAll(Boolean extremesFromAll) {
        this.extremesFromAll = extremesFromAll;
        unused = extremesFromAll != null;
    }

    public Boolean getIgnoreHiddenPoint() {
        return ignoreHiddenPoint;
    }

    public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
        this.ignoreHiddenPoint = ignoreHiddenPoint;
        unused = ignoreHiddenPoint != null;
    }

    public String getInnerSize() {
        return innerSize;
    }

    public void setInnerSize(String innerSize) {
        this.innerSize = innerSize;
        unused = innerSize != null;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
        unused = keys != null;
    }

    public String getLinkedTo() {
        return linkedTo;
    }

    public void setLinkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        unused = linkedTo != null;
    }

    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
        unused = minSize != null;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
        unused = selected != null;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
        unused = shadow != null;
    }

    public Boolean getShowInLegend() {
        return showInLegend;
    }

    public void setShowInLegend(Boolean showInLegend) {
        this.showInLegend = showInLegend;
        unused = showInLegend != null;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        unused = size != null;
    }

    public Integer getSlicedOffset() {
        return slicedOffset;
    }

    public void setSlicedOffset(Integer slicedOffset) {
        this.slicedOffset = slicedOffset;
        unused = slicedOffset != null;
    }

    public Integer getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
        unused = startAngle != null;
    }

    public Boolean getStickyTracking() {
        return stickyTracking;
    }

    public void setStickyTracking(Boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        unused = stickyTracking != null;
    }

    public ChartToolTip getTooltip() {
        return tooltip;
    }

    public void setTooltip(ChartToolTip tooltip) {
        this.tooltip = tooltip;
        unused = tooltip != null;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
        unused = visible != null;
    }

    public String getZoneAxis() {
        return zoneAxis;
    }

    public void setZoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        unused = zoneAxis != null;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
        unused = zone != null;
    }

}
