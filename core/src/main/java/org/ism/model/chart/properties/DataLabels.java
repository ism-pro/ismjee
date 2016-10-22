/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart.properties;

/**
 * <h1>DataLabels</h1>
 *
 * <h2>Description</h2>
 *
 *
 * <hr />
 *
 * @author r.hendrick
 */
public class DataLabels {

    /**
     * backgroundColor: ColorSince 2.2.1 The background color or gradient for
     * the data label. Defaults to undefined. Try it:
     *
     * Data labels box options
     */
    private String backgroundColor = null;

    /**
     * borderColor: ColorSince 2.2.1 The border color for the data label.
     * Defaults to undefined. Try it:
     *
     * Data labels box options
     */
    private String borderColor = null;

    /**
     * borderRadius: NumberSince 2.2.1 The border radius in pixels for the data
     * label. Defaults to 0. Try it:
     *
     * Data labels box options
     */
    private Integer borderRadius = null;

    /**
     * borderWidth: NumberSince 2.2.1 The border width in pixels for the data
     * label. Defaults to 0. Try it:
     *
     * Data labels box options
     */
    private Integer borderWidth = null;

    /**
     * className: StringSince 5.0.0 A class name for the data label.
     * Particularly in styled mode, this can be used to give each series' or
     * point's data label unique styling. In addition to this option, a default
     * color class name is added so that we can give the labels a contrast text
     * shadow. Try it:
     *
     * Styling by CSS.
     */
    private String className = null;

    /**
     * color: Color The text color for the data labels. Defaults to null. Try
     * it:
     *
     * Red data labels
     */
    private String color = null;

    /**
     * connectorColor: StringSince 2.1 The color of the line connecting the data
     * label to the pie slice. The default color is the same as the point's
     * color.
     *
     * In styled mode, the connector stroke is given in the
     * .highcharts-data-label-connector class.
     *
     * Defaults to {point.color}. Try it:
     *
     * Blue connectors. Styled connectors.
     */
    private String connectorColor = null;

    /**
     * connectorPadding: NumberSince 2.1 The distance from the data label to the
     * connector. Defaults to 5. Try it:
     *
     * No padding
     */
    private Integer connectorPadding = null;

    /**
     * connectorWidth: NumberSince 2.1 The width of the line connecting the data
     * label to the pie slice.
     *
     * In styled mode, the connector stroke width is given in the
     * .highcharts-data-label-connector class.
     *
     * Defaults to 1. Try it:
     *
     * Disable the connector. Styled connectors.
     */
    private Integer connectorWidth = null;

    /**
     * crop: BooleanSince 2.3.3 Whether to hide data labels that are outside the
     * plot area. By default, the data label is moved inside the plot area
     * according to the overflow option. Defaults to true.
     */
    private Boolean crop = null;

    /**
     * defer: BooleanSince 4.0 Whether to defer displaying the data labels until
     * the initial series animation has finished. Defaults to true.
     */
    private Boolean defer = null;

    /**
     * distance: NumberSince 2.1 The distance of the data label from the pie's
     * edge. Negative numbers put the data label on top of the pie slices.
     * Connectors are only shown for data labels outside the pie. Defaults to
     * 30. Try it:
     *
     * Data labels on top of the pie
     */
    private Integer distance = null;

    /**
     * enabled: BooleanSince 2.1 Enable or disable the data labels. Defaults to
     * true.
     */
    private Boolean enabled = null;         //true

    /**
     * format: StringSince 3.0 A format string for the data label. Available
     * variables are the same as for formatter. Defaults to {y}. Try it:
     *
     * Add a unit
     */
    private String format = null;

    // formatter=null;         //undefined
    /**
     * inside: BooleanSince 3.0 For points with an extent, like columns, whether
     * to align the data label inside the box or to the actual value point.
     * Defaults to false in most cases, true in stacked columns.
     */
    private Boolean inside = null;

    /**
     * overflow: StringSince 3.0.6 How to handle data labels that flow outside
     * the plot area. The default is justify, which aligns them inside the plot
     * area. For columns and bars, this means it will be moved inside the bar.
     * To display data labels outside the plot area, set crop to false and
     * overflow to "none". Defaults to justify.
     */
    private String overflow = null;

    /**
     * padding: NumberSince 2.2.1 When either the borderWidth or the
     * backgroundColor is set, this	is the padding within the box. Defaults to
     * 5. Try it:
     *
     * Data labels box options
     */
    private Integer padding = null;

    /**
     * rotation: Number Text rotation in degrees. Note that due to a more
     * complex structure, backgrounds, borders and padding will be lost on a
     * rotated data label. Defaults to 0. Try it:
     *
     * Vertical labels
     */
    private Integer rotation = null;

    /**
     * shadow: Boolean|ObjectSince 2.2.1 The shadow of the box. Works best with
     * borderWidth or backgroundColor. Since 2.3 the shadow can be an object
     * configuration containing color, offsetX, offsetY, opacity and width.
     * Defaults to false. Try it:
     *
     * Data labels box options
     */
    private Boolean shadow = null;

    /**
     * shape: StringSince 4.1.2 The name of a symbol to use for the border
     * around the label. Symbols are predefined functions on the Renderer
     * object. Defaults to square. Try it:
     *
     * A callout for annotations
     */
    private String shape = null;

    /**
     * softConnector: BooleanSince 2.1.7 Whether to render the connector as a
     * soft arc or a line with sharp break. Defaults to true. Try it:
     *
     * Soft, non soft connectors.
     */
    private Boolean softConnector = null;

    /**
     * style: CSSObjectSince 4.1.0 Styles for the label. Defaults to {"color":
     * "contrast", "fontSize": "11px", "fontWeight": "bold", "textShadow": "1px
     * 1px contrast, -1px -1px contrast, -1px 1px contrast, 1px -1px contrast"
     * }. Try it:
     *
     * Bold labels
     */
    private String style = null;

    /**
     * useHTML: Boolean Whether to use HTML to render the labels. Defaults to
     * false.
     */
    private Boolean useHTML = null;

    /**
     * verticalAlign: StringSince 2.3.3 The vertical alignment of a data label.
     * Can be one of top, middle or bottom. The default value depends on the
     * data, for instance in a column chart, the label is above positive values
     * and below negative values.
     */
    private Align verticalAlign = null;

    /**
     * x: Number The x position offset of the label relative to the point.
     * Defaults to 0. Try it:
     *
     * Vertical and positioned
     */
    private Integer x = null;

    /**
     * The y position offset of the label relative to the point. Defaults to -6.
     * Try it:
     *
     * Vertical and positioned
     */
    private Integer y = null;

    /**
     * zIndex: NumberSince 2.3.5 The Z index of the data labels. The default Z
     * index puts it above the series. Use a Z index of 2 to display it behind
     * the series. Defaults to 6.
     */
    private Integer zIndex = null;

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

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        unused = backgroundColor != null;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        unused = borderColor != null;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        unused = borderRadius != null;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        unused = borderWidth != null;
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

    public String getConnectorColor() {
        return connectorColor;
    }

    public void setConnectorColor(String connectorColor) {
        this.connectorColor = connectorColor;
        unused = connectorColor != null;
    }

    public Integer getConnectorPadding() {
        return connectorPadding;
    }

    public void setConnectorPadding(Integer connectorPadding) {
        this.connectorPadding = connectorPadding;
        unused = connectorPadding != null;
    }

    public Integer getConnectorWidth() {
        return connectorWidth;
    }

    public void setConnectorWidth(Integer connectorWidth) {
        this.connectorWidth = connectorWidth;
        unused = connectorWidth != null;
    }

    public Boolean getCrop() {
        return crop;
    }

    public void setCrop(Boolean crop) {
        this.crop = crop;
        unused = crop != null;
    }

    public Boolean getDefer() {
        return defer;
    }

    public void setDefer(Boolean defer) {
        this.defer = defer;
        unused = defer != null;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
        unused = distance != null;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
        unused = enabled != null;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
        unused = format != null;
    }

    public Boolean getInside() {
        return inside;
    }

    public void setInside(Boolean inside) {
        this.inside = inside;
        unused = inside != null;
    }

    public String getOverflow() {
        return overflow;
    }

    public void setOverflow(String overflow) {
        this.overflow = overflow;
        unused = overflow != null;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
        unused = padding != null;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
        unused = rotation != null;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
        unused = shadow != null;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
        unused = shape != null;
    }

    public Boolean getSoftConnector() {
        return softConnector;
    }

    public void setSoftConnector(Boolean softConnector) {
        this.softConnector = softConnector;
        unused = softConnector != null;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
        unused = style != null;
    }

    public Boolean getUseHTML() {
        return useHTML;
    }

    public void setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        unused = useHTML != null;
    }

    public Align getVerticalAlign() {
        return verticalAlign;
    }

    public void setVerticalAlign(Align verticalAlign) {
        this.verticalAlign = verticalAlign;
        unused = verticalAlign != null;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
        unused = x != null;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
        unused = y != null;
    }

    public Integer getzIndex() {
        return zIndex;
    }

    public void setzIndex(Integer zIndex) {
        this.zIndex = zIndex;
        unused = zIndex != null;
    }

}
