/*
 *
 */
package org.ism.component.chart;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFRenderer;

import org.apache.shale.remoting.XhtmlHelper;
import org.ism.model.chart.ChartTitle;
import org.ism.model.chart.ChartModel;
import org.ism.model.chart.properties.ChartType;
import org.ism.renderKit.CoreRenderer;




@JSFRenderer(
        renderKitId = "HTML_BASIC",
        family = "org.ism.component",
        type = "org.ism.component.ChartRenderer")
public class ChartRenderer extends CoreRenderer {

    private final static String TYPE_PIE = "pie";
    private final static String TYPE_LINE = "line";
    private final static String TYPE_BAR = "bar";
    private final static String TYPE_OHLC = "ohlc";
    private final static String TYPE_DONUT = "donut";
    private final static String TYPE_BUBBLE = "bubble";
    private final static String TYPE_METERGAUGE = "metergauge";

    /**
     * <p>
     * Stateless helper bean to manufacture resource linkages.</p>
     */
    private static XhtmlHelper helper = new XhtmlHelper();

    @Override
    public void decode(FacesContext context, UIComponent component) {
        //super.decodeBehaviors(context, component);
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        Chart chart = (Chart) component;

        encodeResources(context, chart);
        encodeMarkup(context, chart);
        encodeScript(context, chart);
    }

    /**
     * Allow to manually encode resources
     * 
     * @param context
     * @param chart
     * @throws IOException 
     */
    protected void encodeResources(FacesContext context, Chart chart) throws IOException {
        // Style
        //writeStyleResource(context, "/projsf-ch3/showOneDeck.css");

        // Script        
        writeScriptResource(context, "/highcharts/highcharts.js");
        if (chart.isExporting()) {
            writeScriptResource(context, "/highcharts/modules/exporting.js");
        }

    }

    protected void encodeMarkup(FacesContext context, Chart chart) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        String style = chart.getStyle();
        String styleClass = chart.getStyleClass();

        writer.startElement("div", null);
        writer.writeAttribute("id", chart.getClientId(context), null);
        if (style != null) {
            writer.writeAttribute("style", style, "style");
        }
        if (styleClass != null) {
            writer.writeAttribute("class", styleClass, "styleClass");
        }
        writer.endElement("div");
    }

    protected void encodeScript(FacesContext context, Chart chart) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        String clientId = chart.getClientId(context);

        ChartModel model = chart.getModel();
        String type = chart.getType()!=null?chart.getType():model.getChart().getType().toString();
        model.getChart().setType(ChartType.convert(type));
        model.getChart().setRenderTo(clientId);
        

        writer.startElement("script",null);
        writer.write("var options={");
        writer.write(model.renderChartSet().replaceFirst(",", ""));
        writer.write(model.renderTitle());
        writer.write(model.renderSubTitle());
        writer.write(model.renderXAxis());
        writer.write(model.renderYAxis());
        writer.write(model.renderTooltip());
        writer.write(model.renderPlotOptions());
        writer.write(model.renderLegend());
        writer.write(model.renderSerie());
        writer.write("};");
        writer.write("var chart_" + clientId + " = new Highcharts.Chart(options);");
        writer.endElement("script");

    }


    /**
     * *
     * The method encodeTitle manage in script writing title setup
     *
     * @param context
     * @param chart
     * @throws IOException
     */
    private void encodedTitles(FacesContext context, Chart chart) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        String clientId = chart.getClientId(context);

        ChartModel model = chart.getModel();
        ChartTitle title = model.getTitle();
        ChartTitle subTitle = model.getSubTitle();

        writer.write(""
                // TITLE
                + ",title:{"
                + "align: '" + title.getAlign().toString() + "',"
                + "floating:" + title.getFloating().toString() + ","
                + "margin:" + title.getMargin().toString() + ","
                + "style:" + title.getStyle() + ","
                + "text:'" + title.getText() + "',"
                + "useHTML:" + title.getUseHTML().toString()
                + (title.getVerticalAlign() == null ? "" : ",verticalAlign:'" + title.getVerticalAlign().toString() + "'")
                + (title.getWidthAdjust() == null ? "" : ",widthAdjust:" + title.getWidthAdjust().toString())
                + (title.getX() == null ? "" : ",x:" + title.getX().toString())
                + (title.getY() == null ? "" : ",y:" + title.getY().toString())
                + "},"
                // SUB TITLE
                + "subtitle:{"
                + "align: '" + subTitle.getAlign().toString() + "',"
                + "floating:" + subTitle.getFloating().toString() + ","
                // NOT AVALAIBLE + "margin:" + subTitle.getMargin().toString() + ","
                + "style:" + subTitle.getStyle() + ","
                + "text:'" + subTitle.getText() + "',"
                + "useHTML:" + subTitle.getUseHTML().toString()
                + (subTitle.getVerticalAlign() == null ? "" : ",verticalAlign:'" + subTitle.getVerticalAlign().toString() + "'")
                + (subTitle.getWidthAdjust() == null ? "" : ",widthAdjust:" + subTitle.getWidthAdjust().toString())
                + (subTitle.getX() == null ? "" : ",x:" + subTitle.getX().toString())
                + (subTitle.getY() == null ? "" : ",y:" + subTitle.getY().toString())
                + "}"
        );
    }

    
    
}
