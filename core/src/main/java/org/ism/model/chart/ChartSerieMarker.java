/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author r.hendrick
 */
public class ChartSerieMarker {

    /**
     * Enable or disable the point marker. If null, the markers are hidden when
     * the data is dense, and shown for more widespread data points. Defaults to
     * null. Try it:
     *
     * Disabled markers, disabled in normal state but enabled on hover
     */
    private Boolean enable = null;
    /**
     * The fill color of the point marker. When null, the series' or point's
     * color is used. Try it:
     *
     * White fill
     */
    private String fillColor = null;
    /**
     * Image markers only. Set the image width explicitly. When using this
     * option, a width must also be set. Defaults to null. Try it:
     *
     * Fixed width and height
     */
    private Integer height = null;
    /**
     * The color of the point marker's outline. When null, the series' or
     * point's color is used. Defaults to #ffffff. Try it:
     *
     * Inherit from series color (null)
     */
    private String lineColor = "#ffffff";
    /**
     *
     */
    private Integer lineWidth = 0;
    /**
     * radius: Number The radius of the point marker. Defaults to 4. Try it:
     *
     * Bigger markers
     */
    private Integer radius = 4;
    /**
     * A predefined shape or symbol for the marker. When null, the symbol is
     * pulled from options.symbols. Other possible values are "circle",
     * "square", "diamond", "triangle" and "triangle-down".
     *
     * Additionally, the URL to a graphic can be given on this form:
     * "url(graphic.png)". Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     *
     * Custom callbacks for symbol path generation can also be added to
     * Highcharts.SVGRenderer.prototype.symbols. The callback is then used by
     * its method name, as shown in the demo.
     *
     * Try it:
     *
     * Predefined, graphic and custom markers
     */
    private String symbol = null;
    
    public List<String> symbols = Arrays.asList("circle","square", "diamond", "triangle", "triangle-down");
    /**
     * Image markers only. Set the image width explicitly. When using this
     * option, a height must also be set. Defaults to null. Try it:
     *
     * Fixed width and height
     */
    private Integer width = null;

    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;

    /**
     *
     * <
     * h1>isUnused</h1>
     * Standard method to describe if class was used by set or get method
     *
     * @return unused to know if change was made
     */
    public boolean isUnused() {
        return unused;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
        unused = enable != null;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
        unused = fillColor != null;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
        unused = height != null;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
        unused = lineColor != null;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        unused = lineWidth != null;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
        unused = radius != null;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        unused = symbol != null;
    }

    public List<String> getSymbols() {
        return symbols;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
        unused = width != null;
    }

}
