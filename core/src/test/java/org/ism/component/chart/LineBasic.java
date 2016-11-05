/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ism.component.chart;

import org.ism.component.chart.ChartRenderer;
import org.ism.component.chart.Chart;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.myfaces.test.base.AbstractJsfTestCase;
import org.apache.myfaces.test.mock.MockRenderKitFactory;
import org.apache.myfaces.test.mock.MockResponseWriter;
import org.ism.model.chart.ChartSerie;
import org.ism.model.chart.ChartTitle;
import org.ism.model.chart.properties.ChartType;
import org.ism.model.chart.ChartModel;
import org.ism.model.chart.ChartSerieData;
import org.ism.model.chart.properties.Align;

/**
 * Class to test the behaviour of the SayHello renderer
 */
public class LineBasic extends AbstractJsfTestCase {

    private MockResponseWriter writer;
    private Chart chart;

    public LineBasic(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();

        ChartModel model = new ChartModel();
        model.getChart().setType(ChartType.LINE);
        // Seutp Title
        model.getTitle().setText("Monthly Average Temperature");
        model.getTitle().setX(-20);
        // Setup SubTitle
        model.getSubTitle().setText("Source: WorldClimate.com");
        model.getSubTitle().setX(-20);
        // Setup xAxis
        List<String> xAxis = new ArrayList<String>();
        Collections.addAll(xAxis, "Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        model.getxAxis().setCategories(xAxis);
        // Setup yAxis
        model.getyAxis().getTitle().setText("Temperature (°C)");
        model.getyAxis().getPlotLines().setValue(0);
        model.getyAxis().getPlotLines().setWidth(1);
        model.getyAxis().getPlotLines().setColor("#808080");
        // Setup Tooltip
        model.getTooltip().setValueSuffix("°C");
        // Setup Legend
        model.getLegend().setLayout(Align.VERTICAL);
        model.getLegend().setAlign(Align.RIGHT);
        model.getLegend().setVerticalAlign(Align.MIDDLE);
        model.getLegend().setBorderWidth(0);
        
        
        List<Double> lTokyo =   new ArrayList<Double>();
        Collections.addAll(lTokyo, 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6);
        ChartSerie sTokyo = new ChartSerie("Tokyo");
        sTokyo.add(new ChartSerieData(lTokyo));
        model.addSerie(sTokyo);
        
        List<Double> lNewYorck =   new ArrayList<Double>();
        Collections.addAll(lNewYorck, -0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5);
        ChartSerie sNewYorck = new ChartSerie("New York");
        sNewYorck.add(new ChartSerieData(lNewYorck));
        model.addSerie(sNewYorck);
        
        List<Double> lBerlin =   new ArrayList<Double>();
        Collections.addAll(lBerlin, -0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0);
        ChartSerie sBerlin = new ChartSerie("Berlin");
        sBerlin.add(new ChartSerieData(lBerlin));
        model.addSerie(sBerlin);
        
        List<Double> lLondon =   new ArrayList<Double>();
        Collections.addAll(lLondon, 3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8);
        ChartSerie sLondon = new ChartSerie("London");
        sLondon.add(new ChartSerieData(lLondon));
        model.addSerie(sLondon);
        

        chart = new Chart();
        chart.setId("Container");
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
        
        //assertEquals(null, output);
        assertNotSame(null, output);
        
    }

    private void out(String txt) {
        System.out.println(txt);
    }

}
