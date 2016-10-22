/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart;

import java.util.ArrayList;
import org.ism.model.chart.axis.XAxis;
import java.util.Iterator;
import java.util.List;
import org.ism.model.chart.axis.AxisTitle;
import org.ism.model.chart.axis.YAxis;
import org.ism.model.chart.properties.ChartType;
import org.ism.model.chart.properties.DashStyle;
import org.ism.model.chart.properties.DataLabels;

/**
 *
 * @author r.hendrick
 */
public class ChartModel {

    private ChartSet chart = new ChartSet();
    private ChartTitle title = null;
    private ChartTitle subTitle = null;
    private ChartToolTip tooltip = null;
    private ChartLegend legend = null;
    private ChartPlotOptions plotOptions = null;
    private List<ChartSerie> series = new ArrayList<ChartSerie>();
    private XAxis xAxis = null;
    private YAxis yAxis = null;

    /**
     * Allow to add new serie to
     *
     * @param serie
     */
    public void addSerie(ChartSerie serie) {
        series.add(serie);
    }

    /**
     * <h3>renderChartSet</h3>
     *
     * @return
     */
    public String renderChartSet() {
        String strChartSet = "";
        if (!chart.isUnused()) {
            return strChartSet;
        }

        strChartSet = ",chart:{";
        if (chart.getRenderTo() != null) {
            strChartSet += "renderTo:'" + chart.getRenderTo() + "',";
        }
        if (chart.getType() != null) {
            strChartSet += "type:'" + chart.getType().toString() + "',";
        }
        if (chart.getPlotBackgroundCorlor() == null) {
            strChartSet += "plotBackgroundColor:null,";
        } else if (!chart.getPlotBackgroundCorlor().isEmpty()) {
            strChartSet += "plotBackgroundColor:'" + chart.getPlotBackgroundCorlor() + "',";
        }
        if (chart.getPlotBorderWidth() == null) {
            strChartSet += "plotBorderWidth:null,";
        } else if (chart.getPlotBorderWidth() != 0) {
            strChartSet += "plotBorderWidth:" + chart.getPlotBorderWidth().toString() + ",";
        }
        if (chart.getPlotShadow() != null) {
            strChartSet += "plotShadow:" + chart.getPlotShadow().toString() + ",";
        }
        // Remove last ","
        strChartSet = strChartSet.substring(0, strChartSet.length() - 1);
        // close
        strChartSet += "}";

        return strChartSet;
    }

    /**
     * <h3>renderTitle</h3>
     *
     * Allow to convert Title object to highchart formated Note start with
     * ",Title"
     *
     * @return
     */
    public String renderTitle() {
        String strTitle = "";
        if (title == null) {
            return "";
        }
        if (!title.isUnused()) {
            return "";
        }

        strTitle = ",title:{";
        if (title.getAlign() != null) {
            strTitle += "align:" + title.getAlign().name() + ",";
        }
        if (title.getFloating() != null) {
            strTitle += "floating:" + title.getAlign().name() + ",";
        }
        if (title.getMargin() != null) {
            strTitle += "margin:" + title.getMargin().toString() + ",";
        }
        if (title.getStyle() != null) {
            strTitle += "style:" + title.getStyle() + ",";
        }
        if (title.getText() != null) {
            strTitle += "text:'" + title.getText() + "',";
        }
        if (title.getUseHTML() != null) {
            strTitle += "useHTML:" + title.getUseHTML().toString() + ",";
        }
        if (title.getVerticalAlign() != null) {
            strTitle += "verticalAlign:" + title.getVerticalAlign().name() + ",";
        }
        if (title.getWidthAdjust() != null) {
            strTitle += "widthAdjust:" + title.getWidthAdjust().toString() + ",";
        }
        if (title.getX() != null) {
            strTitle += "x:" + title.getX().toString() + ",";
        }
        if (title.getY() != null) {
            strTitle += "y:" + title.getY().toString() + ",";
        }

        // Remove last ","
        strTitle = strTitle.substring(0, strTitle.length() - 1);
        // close
        strTitle += "}";

        return strTitle;
    }

    /**
     * <h3>renderSubTitle</h3>
     *
     * Allow to convert Title object to highchart formated Note start with
     * ",subtitle"
     *
     * @return
     */
    public String renderSubTitle() {
        String strSubTitle = "";
        if (subTitle == null) {
            return "";
        }
        if (!subTitle.isUnused()) {
            return "";
        }

        strSubTitle = ",subtitle:{";
        if (subTitle.getAlign() != null) {
            strSubTitle += "align:" + subTitle.getAlign().name() + ",";
        }
        if (subTitle.getFloating() != null) {
            strSubTitle += "floating:" + subTitle.getAlign().name() + ",";
        }
        if (subTitle.getMargin() != null) {
            strSubTitle += "margin:" + subTitle.getMargin().toString() + ",";
        }
        if (subTitle.getStyle() != null) {
            strSubTitle += "style:" + subTitle.getStyle() + ",";
        }
        if (subTitle.getText() != null) {
            strSubTitle += "text:'" + subTitle.getText() + "',";
        }
        if (subTitle.getUseHTML() != null) {
            strSubTitle += "useHTML:" + subTitle.getUseHTML().toString() + ",";
        }
        if (subTitle.getVerticalAlign() != null) {
            strSubTitle += "verticalAlign:" + subTitle.getVerticalAlign().name() + ",";
        }
        if (subTitle.getWidthAdjust() != null) {
            strSubTitle += "widthAdjust:" + subTitle.getWidthAdjust().toString() + ",";
        }
        if (subTitle.getX() != null) {
            strSubTitle += "x:" + subTitle.getX().toString() + ",";
        }
        if (subTitle.getY() != null) {
            strSubTitle += "y:" + subTitle.getY().toString() + ",";
        }

        // Remove last ","
        strSubTitle = strSubTitle.substring(0, strSubTitle.length() - 1);
        // close
        strSubTitle += "}";

        return strSubTitle;
    }

    /**
     * <h3>renderXAxis</h3>
     *
     * Allow to convert xAxis to highchart formated Note start with ,xAxis: ...
     *
     * @return
     */
    public String renderXAxis() {
        String strAxis = "";
        if (xAxis == null) {
            return "";
        }
        if (!xAxis.isUnused()) {
            return "";
        }

        if (xAxis.getCategories().isEmpty()) {
            return strAxis;
        }

        strAxis = ",xAxis:{"
                + "categories:[";
        for (int i = 0; i < xAxis.getCategories().size(); i++) {
            if (i != 0) {
                strAxis += ",";
            }
            strAxis += "'" + xAxis.getCategories().get(i) + "'";
        }
        strAxis += "]}";
        return strAxis;
    }

    /**
     *
     * @return
     */
    public String renderYAxis() {
        if (yAxis == null) {
            return "";
        }
        if (!yAxis.isUnused()) {
            return "";
        }
        // Create Title       
        String strTitle = "";
        if (!yAxis.getTitle().isUnused()) {
            String strColor = "color:\'#666666\'";
            strTitle += "title:{";
            if (!yAxis.getTitle().getAlign().matches(AxisTitle.HIGH)) {
                strTitle += "align:'" + yAxis.getTitle().getAlign() + "',";
            }
            if (yAxis.getTitle().getMargin() != null) {
                strTitle += "margin:" + yAxis.getTitle().getMargin().toString() + ",";
            }
            if (yAxis.getTitle().getOffset() != null) {
                strTitle += "offset:" + yAxis.getTitle().getOffset().toString() + ",";
            }
            if (yAxis.getTitle().getRotation() != null) {
                strTitle += "rotation:" + yAxis.getTitle().getRotation().toString() + ",";
            }
            if (!yAxis.getTitle().getStyle().matches(strColor)) {
                strTitle += "style:'" + yAxis.getTitle().getStyle() + "',";
            }
            if (yAxis.getTitle().getText() != null) {
                strTitle += "text:'" + yAxis.getTitle().getText() + "',";
            }
            if (yAxis.getTitle().getX() != null) {
                strTitle += "x:" + yAxis.getTitle().getX().toString() + ",";
            }
            if (yAxis.getTitle().getY() != null) {
                strTitle += "y:" + yAxis.getTitle().getY().toString() + ",";
            }

            // Remove last ","
            if (strTitle.length() > 1) {
                strTitle = strTitle.substring(0, strTitle.length() - 1);
                // Close 
                strTitle += "}";
            }
        }

        // Create PlotLine
        String strPlotLine = "";
        if (!yAxis.getPlotLines().isUnused()) {
            strPlotLine = "plotLines:[{";
            if (yAxis.getPlotLines().getColor() != null) {
                strPlotLine += "color:'" + yAxis.getPlotLines().getColor() + "',";
            }
            if (yAxis.getPlotLines().getDashStyle() != DashStyle.SOLID) {
                strPlotLine += "dashStyle:'" + yAxis.getPlotLines().getDashStyle().toString() + "',";
            }
            if (yAxis.getPlotLines().getValue() != null) {
                strPlotLine += "value:" + yAxis.getPlotLines().getValue().toString() + ",";
            }
            if (yAxis.getPlotLines().getWidth() != null) {
                strPlotLine += "width:" + yAxis.getPlotLines().getWidth().toString() + ",";
            }
            // Remove last ","
            if (strPlotLine.length() > 1) {
                strPlotLine = strPlotLine.substring(0, strPlotLine.length() - 1);
                // Close 
                strPlotLine += "}]";
            }

        }

        // Finalize yAxis
        String strAxis = "";
        if (!yAxis.getTitle().isUnused() || !yAxis.getPlotLines().isUnused()) {
            strAxis += ",yAxis:{";
            if (!yAxis.getTitle().isUnused()) {
                strAxis += strTitle;
                if (!yAxis.getPlotLines().isUnused()) {
                    strAxis += ",";
                }
            }
            if (!yAxis.getPlotLines().isUnused()) {
                strAxis += strPlotLine;
            }

            strAxis += "}";
        }

        return strAxis;
    }

    /**
     * <h3>renderTooltip</h3>
     *
     * Render the tooltip fonction . actualy manage only pointFormat,
     * valuePrefix, valueSuffix
     *
     * @return script for render
     */
    public String renderTooltip() {
        String strTooltip = "";
        if (tooltip == null) {
            return strTooltip;
        }
        if (!tooltip.isUnused()) {
            return strTooltip;
        }

        strTooltip = ",tooltip:{";
        if (tooltip.getValuePrefix() != null) {
            strTooltip += "valuePrefix:'" + tooltip.getValuePrefix() + "',";
        }
        if (tooltip.getValueSuffix() != null) {
            strTooltip += "valueSuffix:'" + tooltip.getValueSuffix() + "',";
        }
        if (tooltip.getPointFormat() != null) {
            strTooltip += "pointFormat:'" + tooltip.getPointFormat() + "',";
        }
        // Remove last ","
        strTooltip = strTooltip.substring(0, strTooltip.length() - 1);
        // close
        strTooltip += "}";

        return strTooltip;
    }

    /**
     * <h3>renderPlotOptions</h3>
     *
     * Render the plotOptions fonction . actualy manage only allowPointSelect,
     * cursor, dataLabels
     *
     * @return script for render
     */
    public String renderPlotOptions() {
        String strPlotOptions = "";
        if (plotOptions == null) {
            return strPlotOptions;
        }
        if (!plotOptions.isUnused()) {
            return strPlotOptions;
        }

        strPlotOptions = ",plotOptions:{";
        strPlotOptions += chart.getType().toString() + ":{";
        if (plotOptions.getAllowPointSelect()!= null) {
            strPlotOptions += "allowPointSelect:" + plotOptions.getAllowPointSelect().toString() + ",";
        }
        if (plotOptions.getCursor()!= null) {
            strPlotOptions += "cursor:'" + plotOptions.getCursor() + "',";
        }
        if (plotOptions.getDataLabels()!= null) {
            strPlotOptions += renderPlotOptionsDataLabels(plotOptions.getDataLabels());
        }
        // Remove last ","
        strPlotOptions = strPlotOptions.substring(0, strPlotOptions.length() - 1);
        // close
        strPlotOptions += "}"; // Close chart type
        strPlotOptions += "}"; // Close plot options

        return strPlotOptions;
    }
    
        /**
     * <h3>renderPlotOptionsDataLabels</h3>
     *
     * Render the renderPlotOptionsDataLabels fonction . actualy manage only a
     *
     * @return script for render
     */
    private String renderPlotOptionsDataLabels(DataLabels dataLabels){
        String strDataLabels = "";
        if (dataLabels == null) {
            return strDataLabels;
        }
        if (!dataLabels.isUnused()) {
            return strDataLabels;
        }
        
        strDataLabels = "dataLabels:{";
        if (dataLabels.getEnabled()!= null) {
            strDataLabels += "enabled:" + dataLabels.getEnabled().toString() + ",";
        }
        if (dataLabels.getFormat()!= null) {
            strDataLabels += "format:'" + dataLabels.getFormat() + "',";
        }
        if (dataLabels.getStyle()!= null) {
            strDataLabels += "style:{" + dataLabels.getStyle() + "},";
        }
        strDataLabels = strDataLabels.substring(0, strDataLabels.length() - 1);
        strDataLabels += "},";
        return strDataLabels;
    }

    /**
     * <h3>renderLegend</h3>
     *
     * Render the legend fonction . actualy manage layout, align, verticalAlign,
     * borderWidth
     *
     * @return script for render
     */
    public String renderLegend() {
        String strLegend = "";
        if (legend == null) {
            return strLegend;
        }
        if (!legend.isUnused()) {
            return strLegend;
        }

        strLegend = ",legend:{";
        if (legend.getLayout() != null) {
            strLegend += "layout:'" + legend.getLayout().toString() + "',";
        }
        if (legend.getAlign() != null) {
            strLegend += "align:'" + legend.getAlign().toString() + "',";
        }
        if (legend.getVerticalAlign() != null) {
            strLegend += "verticalAlign:'" + legend.getVerticalAlign().toString() + "',";
        }
        if (legend.getBorderWidth() != null) {
            strLegend += "borderWidth:" + legend.getBorderWidth().toString() + ",";
        }
        // Remove last ","
        strLegend = strLegend.substring(0, strLegend.length() - 1);
        // close
        strLegend += "}";

        return strLegend;
    }

    /**
     * <h3>renderSerie</h3>
     *
     * Allow to convert serie to highchart formated. Note starte with ,serie:
     * ...
     *
     * @return
     */
    public String renderSerie() {
        String strSeries = "";
        if (this.getSeries().isEmpty()) {
            return strSeries;
        }

        List<ChartSerie> series = this.getSeries();

        Iterator<ChartSerie> itrSerie = series.iterator();
        Boolean firstSerie = true;
        strSeries += ",series:[";
        while (itrSerie.hasNext()) {
            ChartSerie serie = itrSerie.next();
            strSeries += "{";
            if (serie.getName() != null) {
                strSeries += "name:'" + serie.getName() + "',";
            }
            if (serie.getColorByPoint() != null) {
                strSeries += "colorByPoint:" + serie.getColorByPoint().toString() + ",";
            }
            if (serie.getDatas() != null) {
                strSeries += "data:[";
                // Insertion de donnée
                List<ChartSerieData> datas = serie.getDatas();
                Iterator<ChartSerieData> itrData = datas.iterator();
                while (itrData.hasNext()) {
                    ChartSerieData data = itrData.next();
                    strSeries += "{";
                    if (data.getName() != null) {
                        strSeries += "name:'" + data.getName() + "',";
                    }
                    if (data.getY() != null) {
                        strSeries += "y:" + data.getY() + ",";
                    }
                    if (data.getYs() != null) {
                        strSeries = strSeries.substring(0, strSeries.length() - 1);
                        Iterator<Double> itrYs = data.getYs().iterator();
                        while (itrYs.hasNext()) {
                            strSeries += itrYs.next() + ",";
                        }
                    }
                    if (data.getSliced() != null) {
                        strSeries += "sliced:" + data.getSliced().toString() + ",";
                    }
                    if (data.getSelected() != null) {
                        strSeries += "selected:" + data.getSelected().toString() + ",";
                    }
                    strSeries = strSeries.substring(0, strSeries.length() - 1);
                    // Managing chartype
                    if (chart.getType() == ChartType.LINE) {
                        strSeries += "]},";
                    } else {
                        strSeries += "},";
                    }
                }
                if (chart.getType() != ChartType.LINE) {
                    strSeries = strSeries.substring(0, strSeries.length() - 1);
                    strSeries += "]";
                }
            }
            if (chart.getType() == ChartType.LINE) {
                //strSeries = strSeries.substring(0, strSeries.length() - 1);
            } else {
                strSeries += "}]";
            }
        }
        if (chart.getType() == ChartType.LINE) {
            strSeries = strSeries.substring(0, strSeries.length() - 1);
            strSeries += "]";
        }
        return strSeries;
    }

    /**
     * <h3>renderSerieOrg</h3>
     *
     * Allow to convert serie to highchart formated. Note starte with ,serie:
     * ...
     *
     * @return
     */
    public String renderSerieOrg() {
        String strSeries = "";
        if (this.getSeries().isEmpty()) {
            return strSeries;
        }

        List<ChartSerie> series = this.getSeries();

        Iterator<ChartSerie> itrSerie = series.iterator();
        Boolean firstSerie = true;
        strSeries += ",series:[";

        while (itrSerie.hasNext()) {
            ChartSerie serie = itrSerie.next();
            if (firstSerie) {
                firstSerie = false;
            } else {
                strSeries += ",";
            }

            strSeries += "{"
                    + "name:'" + serie.getName() + "',"
                    + "data: [";
            List<Double> datas = serie.getData();
            Iterator<Double> itrData = datas.iterator();
            Boolean firstData = true;
            while (itrData.hasNext()) {
                Double data = itrData.next();
                if (firstData) {
                    firstData = false;
                } else {
                    strSeries += ",";
                }
                strSeries += data;
            }
            strSeries += "]}";
        }
        if (!strSeries.isEmpty()) {
            strSeries += "]";
        }
        return strSeries;
    }

    public ChartSet getChart() {
        return chart;
    }

    public void setChart(ChartSet chart) {
        this.chart = chart;
    }

    public ChartTitle getTitle() {
        if (title == null) {
            title = new ChartTitle("Title");
        }
        return title;
    }

    public void setTitle(ChartTitle title) {
        getTitle();
        this.title = title;
    }

    public ChartTitle getSubTitle() {
        if (subTitle == null) {
            subTitle = new ChartTitle("subTitle", "{\"color\":\"#666666\"}");
        }
        return subTitle;
    }

    public void setSubTitle(ChartTitle subTitle) {
        getSubTitle();
        this.subTitle = subTitle;
    }

    public ChartToolTip getTooltip() {
        if (tooltip == null) {
            tooltip = new ChartToolTip();
        }
        return tooltip;
    }

    public ChartLegend getLegend() {
        if (legend == null) {
            legend = new ChartLegend();
        }
        return legend;
    }

    public void setLegend(ChartLegend legend) {
        getLegend();
        this.legend = legend;
    }

    public void setTooltip(ChartToolTip tooltip) {
        getTooltip();
        this.tooltip = tooltip;
    }

    public ChartPlotOptions getPlotOptions() {
        if (plotOptions == null) {
            plotOptions = new ChartPlotOptions();
        }
        return plotOptions;
    }

    public void setPlotOptions(ChartPlotOptions plotOptions) {
        getPlotOptions();
        this.plotOptions = plotOptions;
    }

    public XAxis getxAxis() {
        if (xAxis == null) {
            xAxis = new XAxis();
        }
        return xAxis;
    }

    public void setxAxis(XAxis xAxis) {
        getxAxis();
        this.xAxis = xAxis;
    }

    public YAxis getyAxis() {
        if (yAxis == null) {
            yAxis = new YAxis();
        }
        return yAxis;
    }

    public void setyAxis(YAxis yAxis) {
        getyAxis();
        this.yAxis = yAxis;
    }

    public List<ChartSerie> getSeries() {
        return series;
    }

    public void setSeries(List<ChartSerie> series) {
        this.series = series;
    }
}
