/*
 *
 */
package org.ism.component.chart;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFRenderer;

import org.apache.shale.remoting.XhtmlHelper;
import org.ism.component.chart.plots.ChartSetRenderer;
import org.ism.model.chart.ChartModel;
import org.ism.model.chart.properties.ChartType;
import org.ism.renderKit.CoreRenderer;




@JSFRenderer(
        renderKitId = "HTML_BASIC",
        family = "org.ism.component",
        type = "org.ism.component.ChartRenderer")
public class ChartRenderer extends CoreRenderer {

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
     * @param context jsf context
     * @param chart chart component
     * @throws IOException exception
     */
    protected void encodeResources(FacesContext context, Chart chart) throws IOException {
        // Style
        //writeStyleResource(context, "/projsf-ch3/showOneDeck.css");

        // Script        
        writeScriptResource(context, context.getExternalContext().getRequestServletPath() +  "/highcharts/highcharts.js");
        if (chart.isExporting()) {
            writeScriptResource(context, context.getExternalContext().getRequestServletPath() + "/highcharts/modules/exporting.js");
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
        if(model==null){
            return ;
        }
        
        String type = chart.getType()!=null?chart.getType():model.getChart().getType().toString();
        model.getChart().setType(ChartType.convert(type));
        model.getChart().setRenderTo(clientId);
        
        String script = "var options={";
        script += ChartSetRenderer.renderer(model.getChart());
        script += model.renderTitle();
        script += model.renderSubTitle();
        script += model.renderXAxis();
        script += model.renderYAxis();
        script += model.renderTooltip();
        script += model.renderPlotOptions();
        script += model.renderLegend();
        script += model.renderSerie();
        script += "};";
        script += "var chart_" + clientId.replace(":", "_") + " = new Highcharts.Chart(options);";
        
        if(chart.isDebug()){
            System.out.println(script);
        }
        
        writer.startElement("script",null);
        writer.write(script);
        writer.endElement("script");
        /*
        writer.startElement("script",null);
        writer.write("var options={");
        writer.write(ChartSetRenderer.renderer(model.getChart()));
        writer.write(model.renderTitle());
        writer.write(model.renderSubTitle());
        writer.write(model.renderXAxis());
        writer.write(model.renderYAxis());
        writer.write(model.renderTooltip());
        writer.write(model.renderPlotOptions());
        writer.write(model.renderLegend());
        writer.write(model.renderSerie());
        writer.write("};");
        writer.write("var chart_" + clientId.replace(":", "_") + " = new Highcharts.Chart(options);");
        writer.endElement("script");
        */

    }
    
}
