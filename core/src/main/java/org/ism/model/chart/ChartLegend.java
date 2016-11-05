/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart;

import org.ism.model.chart.properties.Align;

/**
 * <h1>ChartLegend</h1>
 *
 * The legend is a box containing a symbol and name for each series item or
 * point item in the chart. Each series (or points in case of pie charts) is
 * represented by a symbol and its name in the legend.
 *
 * It is also possible to override the symbol creator function and create custom
 * legend symbols.
 *
 * @author r.hendrick
 */
public class ChartLegend {

    /**
     * The horizontal alignment of the legend box within the chart area. Valid
     * values are left, center and right.
     *
     * In the case that the legend is aligned in a corner position, the layout
     * option will determine whether to place it above/below or on the side of
     * the plot area.
     *
     * Defaults to center. Try it:
     *
     * Legend at the right of the chart
     *
     */
    private Align align = Align.CENTER;

    /**
     * The background color of the legend. Try it:
     *
     * Yellowish background See also:
     *
     * In styled mode, the legend background fill can be applied with the
     * .highcharts-legend-box class.
     */
    private String backgroundColor = null;

    /**
     * The color of the drawn border around the legend. Defaults to #999999. Try
     * it:
     *
     * Brown border See also:
     *
     * In styled mode, the legend border stroke can be applied with the
     * .highcharts-legend-box class.
     */
    private String borderColor = "#999999";

    /**
     * The border corner radius of the legend. Defaults to 0. Try it:
     *
     * Square by default, 5px rounded
     *
     */
    private Integer borderRadius = 0;

    /**
     * The width of the drawn border around the legend. Defaults to 0. Try it:
     *
     * 2px border width See also:
     *
     * In styled mode, the legend border stroke width can be applied with the
     * .highcharts-legend-box class.
     *
     */
    private Integer borderWidth = 0;

    /**
     * Enable or disable the legend. Defaults to true. Try it:
     *
     * Legend disabled
     *
     */
    private Boolean enabled = true;

    /**
     * When the legend is floating, the plot area ignores it and is allowed to
     * be placed below it. Defaults to false. Try it:
     *
     * False by default, true.
     */
    private Boolean floating = false;

    /**
     * In a legend with horizontal layout, the itemDistance defines the pixel
     * distance between each item. Defaults to 20. Try it:
     *
     * 50px item distance
     */
    private Integer itemDistance = 20;

    /**
     * CSS styles for each legend item when the corresponding series or point is
     * hidden. Only a subset of CSS is supported, notably those options related
     * to text. Properties are inherited from style unless overridden here.
     * Defaults to { "color": "#cccccc" }. Try it:
     *
     * Darker gray color See also:
     *
     * In styled mode, the hidden legend items can be styled with the
     * .highcharts-legend-item-hidden class.
     */
    private String itemHiddenStyle = "color: #cccccc";

    /**
     * CSS styles for each legend item in hover mode. Only a subset of CSS is
     * supported, notably those options related to text. Properties are
     * inherited from style unless overridden here. Defaults to { "color":
     * "#000000" }. Try it:
     *
     * Red on hover See also:
     *
     * In styled mode, the hovered legend items can be styled with the
     * .highcharts-legend-item:hover pesudo-class.
     */
    private String itemHoverStyle = "color: #000000";

    /**
     * The pixel bottom margin for each legend item. Defaults to 0. Try it:
     *
     * Padding and item margins demonstrated
     */
    private Integer itemMarginBottom = 0;

    /**
     * The pixel top margin for each legend item. Defaults to 0. Try it:
     *
     * Padding and item margins demonstrated
     */
    private Integer itemMarginTop = 0;

    /**
     * CSS styles for each legend item. Only a subset of CSS is supported,
     * notably those options related to text. Defaults to { "color": "#333333",
     * "cursor": "pointer", "fontSize": "12px", "fontWeight": "bold" }. Try it:
     *
     * Bold black text See also:
     *
     * In styled mode, the legend items can be styled with the
     * .highcharts-legend-item class.
     */
    private String itemStyle = "\"color\": \"#333333\", \"cursor\": \"pointer\", \"fontSize\": \"12px\", \"fontWeight\": \"bold\"";

    /**
     * The width for each legend item. This is useful in a horizontal layout
     * with many items when you want the items to align vertically. . Try it:
     *
     * Null by default, 80 for aligned legend items
     */
    private Integer itemWidth = null;

    /**
     * A format string for each legend label. Available variables relates to
     * properties on the series, or the point in case of pies. Defaults to
     * {name}.
     */
    private String labelFormat = "name";

    //private String labelFormatter = 
    /**
     * Line height for the legend items. Deprecated as of 2.1. Instead, the line
     * height for each item can be set using itemStyle.lineHeight, and the
     * padding between items using itemMarginTop and itemMarginBottom. Defaults
     * to 16. Try it:
     *
     * Setting padding.
     */
    private Align layout = Align.HORIZONTAL;

    /**
     * Line height for the legend items. Deprecated as of 2.1. Instead, the line
     * height for each item can be set using itemStyle.lineHeight, and the
     * padding between items using itemMarginTop and itemMarginBottom. Defaults
     * to 16. Try it:
     *
     * Setting padding.
     */
    private Integer lineHeight = 16;

    /**
     * If the plot area sized is calculated automatically and the legend is not
     * floating, the legend margin is the space between the legend and the axis
     * labels or plot area. Defaults to 12. Try it:
     *
     * 12 pixels by default, 30 pixels.
     */
    private Integer margin = 12;

    /**
     * Maximum pixel height for the legend. When the maximum height is extended,
     * navigation will show.
     */
    private Integer maxHeight = null;

    /**
     * The inner padding of the legend box. Defaults to 8. Try it:
     *
     * Padding and item margins demonstrated
     */
    private Integer padding = 8;

    /**
     * Whether to reverse the order of the legend items compared to the order of
     * the series or points as defined in the configuration object. Defaults to
     * false. Try it:
     *
     * Stacked bar with reversed legend See also:
     *
     * yAxis.reversedStacks, series.legendIndex
     */
    private Boolean reversed = false;

    /**
     * Whether to show the symbol on the right side of the text rather than the
     * left side. This is common in Arabic and Hebraic. Defaults to false. Try
     * it:
     *
     * Symbol to the right
     */
    private Boolean rtl = false;

    /**
     * Whether to apply a drop shadow to the legend. A backgroundColor also
     * needs to be applied for this to take effect. Since 2.3 the shadow can be
     * an object configuration containing color, offsetX, offsetY, opacity and
     * width. Defaults to false. Try it:
     *
     * White background and drop shadow
     */
    private Boolean shadow = false;

    /**
     * The pixel height of the symbol for series types that use a rectangle in
     * the legend. Defaults to the font size of legend items.
     */
    private Integer symbolHeight = null;

    /**
     * The pixel padding between the legend item symbol and the legend item
     * text. Defaults to 5. Try it:
     *
     * Greater symbol width and padding
     */
    private Integer symbolPadding = 5;

    /**
     * The border radius of the symbol for series types that use a rectangle in
     * the legend. Defaults to 0. Try it:
     *
     * Round symbols
     */
    private Integer symbolRadius = 0;

    /**
     * The pixel width of the legend item symbol. Defaults to 16. Try it:
     *
     * Greater symbol width and padding
     */
    private Integer symbolWidth = 16;

    /**
     * A title to be added on top of the legend. Try it:
     *
     * Legend title
     *
     * Generic CSS styles for the legend title. Defaults to
     * {"fontWeight":"bold"}. See also:
     *
     * In styled mode, the legend title is styled with the
     * .highcharts-legend-title class.
     */
    private String titleStyle = "fontWeight: bold";

    /**
     * A title to be added on top of the legend. Try it:
     *
     * Legend title
     *
     * A text or HTML string for the title. Defaults to null.
     */
    private String titleText = null;

    /**
     * useHTML: Boolean Whether to use HTML to render the legend item texts.
     * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
     *
     * Defaults to false.
     */
    private Boolean useHTML = false;

    /**
     * The vertical alignment of the legend box. Can be one of top, middle or
     * bottom. Vertical position can be further determined by the y option.
     *
     * In the case that the legend is aligned in a corner position, the layout
     * option will determine whether to place it above/below or on the side of
     * the plot area.
     *
     * Defaults to bottom. Try it:
     *
     * Legend 100px from the top of the chart
     */
    private Align verticalAlign = Align.BOTTOM;

    /**
     * The width of the legend box. Try it:
     *
     * Aligned to the plot area
     */
    private Integer width = null;

    /**
     * The x offset of the legend relative to its horizontal alignment align
     * within chart.spacingLeft and chart.spacingRight. Negative x moves it to
     * the left, positive x moves it to the right. Defaults to 0. Try it:
     *
     * Aligned to the plot area
     */
    private Integer x = 0;

    /**
     * The vertical offset of the legend relative to it's vertical alignment
     * verticalAlign within chart.spacingTop and chart.spacingBottom. Negative y
     * moves it up, positive y moves it down. Defaults to 0. Try it:
     *
     * Legend 100px from the top of the chart
     */
    private Integer y = 0;

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

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
        unused = align != null;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
        unused = enabled != null;
    }

    public Boolean getFloating() {
        return floating;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
        unused = floating != null;
    }

    public Integer getItemDistance() {
        return itemDistance;
    }

    public void setItemDistance(Integer itemDistance) {
        this.itemDistance = itemDistance;
        unused = itemDistance != null;
    }

    public String getItemHiddenStyle() {
        return itemHiddenStyle;
    }

    public void setItemHiddenStyle(String itemHiddenStyle) {
        this.itemHiddenStyle = itemHiddenStyle;
        unused = itemHiddenStyle != null;
    }

    public String getItemHoverStyle() {
        return itemHoverStyle;
    }

    public void setItemHoverStyle(String itemHoverStyle) {
        this.itemHoverStyle = itemHoverStyle;
        unused = itemHoverStyle != null;
    }

    public Integer getItemMarginBottom() {
        return itemMarginBottom;
    }

    public void setItemMarginBottom(Integer itemMarginBottom) {
        this.itemMarginBottom = itemMarginBottom;
        unused = itemMarginBottom != null;
    }

    public Integer getItemMarginTop() {
        return itemMarginTop;
    }

    public void setItemMarginTop(Integer itemMarginTop) {
        this.itemMarginTop = itemMarginTop;
        unused = itemMarginTop != null;
    }

    public String getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(String itemStyle) {
        this.itemStyle = itemStyle;
        unused = itemStyle != null;
    }

    public Integer getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        unused = itemWidth != null;
    }

    public String getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
        unused = labelFormat != null;
    }

    public Align getLayout() {
        return layout;
    }

    public void setLayout(Align layout) {
        this.layout = layout;
        unused = layout != null;
    }

    public Integer getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(Integer lineHeight) {
        this.lineHeight = lineHeight;
        unused = lineHeight != null;
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
        unused = margin != null;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        unused = maxHeight != null;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
        unused = padding != null;
    }

    public Boolean getReversed() {
        return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
        unused = reversed != null;
    }

    public Boolean getRtl() {
        return rtl;
    }

    public void setRtl(Boolean rtl) {
        this.rtl = rtl;
        unused = rtl != null;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
        unused = shadow != null;
    }

    public Integer getSymbolHeight() {
        return symbolHeight;
    }

    public void setSymbolHeight(Integer symbolHeight) {
        this.symbolHeight = symbolHeight;
        unused = symbolHeight != null;
    }

    public Integer getSymbolPadding() {
        return symbolPadding;
    }

    public void setSymbolPadding(Integer symbolPadding) {
        this.symbolPadding = symbolPadding;
        unused = symbolPadding != null;
    }

    public Integer getSymbolRadius() {
        return symbolRadius;
    }

    public void setSymbolRadius(Integer symbolRadius) {
        this.symbolRadius = symbolRadius;
        unused = symbolRadius != null;
    }

    public Integer getSymbolWidth() {
        return symbolWidth;
    }

    public void setSymbolWidth(Integer symbolWidth) {
        this.symbolWidth = symbolWidth;
        unused = symbolWidth != null;
    }

    public String getTitleStyle() {
        return titleStyle;
    }

    public void setTitleStyle(String titleStyle) {
        this.titleStyle = titleStyle;
        unused = titleStyle != null;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
        unused = titleText != null;
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

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
        unused = width != null;
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
    

}
