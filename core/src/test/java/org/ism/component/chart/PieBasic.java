/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ism.component.chart;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static junit.framework.Assert.assertNotSame;
import org.apache.myfaces.test.base.AbstractJsfTestCase;
import org.apache.myfaces.test.mock.MockRenderKitFactory;
import org.apache.myfaces.test.mock.MockResponseWriter;
import org.ism.model.chart.ChartModel;
import org.ism.model.chart.ChartPlotOptions;
import org.ism.model.chart.ChartSerie;
import org.ism.model.chart.ChartSerieData;
import org.ism.model.chart.properties.ChartType;

/**
 * <h1>PieBasic</h1>
 *
 * <h2>Description</h2>
 *
 *
 * <hr />
 * @author r.hendrick
 */
public class PieBasic extends AbstractJsfTestCase {


    private MockResponseWriter writer;
    private Chart chart;

    public PieBasic(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();

        ChartModel model =  new ChartModel();
        model.getChart().setType(ChartType.PIE);
        model.getChart().setPlotBackgroundCorlor(null);
        model.getChart().setPlotBorderWidth(null);
        model.getChart().setPlotShadow(false);
        // Seutp Title
        model.getTitle().setText("Browser market shares January, 2015 to May, 2015");
        // Setup Tooltip
        model.getTooltip().setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        // Setup plotOptions
        model.getPlotOptions().setAllowPointSelect(true);
        model.getPlotOptions().setCursor("pointer");
        model.getPlotOptions().getDataLabels().setEnabled(true);
        model.getPlotOptions().getDataLabels().setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
        model.getPlotOptions().getDataLabels().setStyle("color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'");
        // Setup serie
        ChartSerie sBrands = new ChartSerie("Brands");
        sBrands.setColorByPoint(Boolean.TRUE);
        sBrands.add(new ChartSerieData("Microsoft Internet Explorer", 56.33));
        sBrands.add(new ChartSerieData("Chrome", 24.03, true, true));
        sBrands.add(new ChartSerieData("Firefox",10.38));
        sBrands.add(new ChartSerieData("Safari", 4.77));
        sBrands.add(new ChartSerieData("Opera", 0.91));
        sBrands.add(new ChartSerieData("Proprietary or Undetectable",0.2));
        
        
        model.addSerie(sBrands);
        
        

        chart = new Chart();
        chart.setId("PieDiv");
        chart.setStyle("min-width: 310px; height: 400px; margin: 0 auto");
        chart.setModel(model);

        writer = new MockResponseWriter(new StringWriter(), null, null);
        facesContext.setResponseWriter(writer);
        // TODO remove these two lines once shale-test goes alpha, see MYFACES-1155
        facesContext.getViewRoot().setRenderKitId(MockRenderKitFactory.HTML_BASIC_RENDER_KIT);
        facesContext.getRenderKit().addRenderer(
                chart.getFamily(),
                chart.getRendererType(),
                new ChartRenderer());
    }
    
    public void tearDown() throws Exception {
        super.tearDown();
        chart = null;
        writer = null;
    }

    public void testEncodeEnd() throws Exception {
        chart.encodeEnd(facesContext);
        facesContext.renderResponse();
        String output = writer.getWriter().toString();
        System.out.println(output);
        
        assertEquals(null, output);
        assertNotSame(null, output);
        
    }

    private void out(String txt) {
        System.out.println(txt);
    }
}
