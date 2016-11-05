/*
 * Generated, Do Not Modify
 */
 /*
 * Copyright 2009-2013 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ism.component.chart;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.component.UINamingContainer;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.BehaviorEvent;
import javax.faces.event.FacesEvent;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFComponent;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFProperty;

@ResourceDependencies({ // JQuery
/*@ResourceDependency(library = "jquery", name = "jquery-2.2.3.min.js")*/ /*@ResourceDependency(library = "highcharts", name = "css/highcharts.css"),
    @ResourceDependency(library = "highcharts", name = "highcharts.js"),
    @ResourceDependency(library = "highcharts", name = "modules/exporting.js"),
    
    @ResourceDependency(library = "ism", name = "charts/charts.min.css"),
    @ResourceDependency(library = "ism", name = "charts/charts.min.js")*/})

@JSFComponent(
        name = "ism:chart",
        clazz = "org.ism.component.chart.Chart",
        tagClass = "org.ism.component.chart.ChartTag")
public class Chart extends UIComponentBase implements javax.faces.component.behavior.ClientBehaviorHolder {

    public static final String COMPONENT_TYPE = "org.ism.component.Chart";
    public static final String COMPONENT_FAMILY = "org.ism.component";
    private static final String DEFAULT_RENDERER = "org.ism.component.ChartRenderer";
    public static final String DEFAULT_RENDERER_TYPE = "org.ism.component.ChartRenderer";

    protected enum PropertyKeys {

        widgetVar, type, model, style, styleClass, responsive, exporting, debug;

        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {
        }

        @Override
        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }

    public Chart() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    @JSFProperty
    public java.lang.String getWidgetVar() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    /**
     * Deprecated : not working
     *
     * @param _widgetVar is the primefaces
     */
    @JSFProperty
    public void setWidgetVar(java.lang.String _widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
    }

    /**
     * <h3>Description</h3>
     * Type allow to specify kind of chart to be render. Type is one of Line,
     * Pie,
     *
     * <h3>Note :</h3>
     * Defining this properety have priority on model type chart.
     *
     * @return type
     */
    @JSFProperty
    public java.lang.String getType() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.type, null);
    }

    /**
     * <h3>Description</h3>
     * Type allow to specify kind of chart to be render. Type is one of Line,
     * Pie,
     *
     * <h3>Note :</h3>
     * Defining this properety have priority on model type chart.
     *
     * @param _type is one of line, pie,
     */
    @JSFProperty
    public void setType(java.lang.String _type) {
        getStateHelper().put(PropertyKeys.type, _type);
    }

    @JSFProperty
    public org.ism.model.chart.ChartModel getModel() {
        return (org.ism.model.chart.ChartModel) getStateHelper().eval(PropertyKeys.model, null);
    }

    @JSFProperty
    public void setModel(org.ism.model.chart.ChartModel model) {
        getStateHelper().put(PropertyKeys.model, model);
    }

    @JSFProperty
    public java.lang.String getStyle() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.style, null);
    }

    @JSFProperty
    public void setStyle(java.lang.String _style) {
        getStateHelper().put(PropertyKeys.style, _style);
    }

    @JSFProperty
    public java.lang.String getStyleClass() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.styleClass, null);
    }

    @JSFProperty
    public void setStyleClass(java.lang.String _styleClass) {
        getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }

    @JSFProperty
    public boolean isResponsive() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.responsive, false);
    }

    @JSFProperty
    public void setResponsive(boolean _responsive) {
        getStateHelper().put(PropertyKeys.responsive, _responsive);
    }

    @JSFProperty
    public boolean isExporting() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.exporting, false);
    }

    @JSFProperty
    public void setExporting(boolean _exporting) {
        getStateHelper().put(PropertyKeys.exporting, _exporting);
    }

    /**
     * When enable this property allow to display the render mecanisme for the
     * chart to render.
     *
     * @return true if debug macanisme is activated
     */
    @JSFProperty
    public boolean isDebug() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.debug, false);
    }

    /**
     * When enable this property allow to display the render mecanisme for the
     * chart to render.
     *
     * @param _debug true for renderer
     */
    @JSFProperty
    public void setDebug(boolean _debug) {
        getStateHelper().put(PropertyKeys.debug, _debug);
    }

    private final static String DEFAULT_EVENT = "itemSelect";

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(DEFAULT_EVENT));

    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    @Override
    public String getDefaultEventName() {
        return DEFAULT_EVENT;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        if (event instanceof AjaxBehaviorEvent) {
            BehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
            Map<String, String> map = getFacesContext().getExternalContext().getRequestParameterMap();
            int itemIndex = Integer.parseInt(map.get("itemIndex"));
            int seriesIndex = Integer.parseInt(map.get("seriesIndex"));

            //ItemSelectEvent itemSelectEvent = new ItemSelectEvent(this, behaviorEvent.getBehavior(), itemIndex, seriesIndex);
            //super.queueEvent(itemSelectEvent);
        }
    }

    public String resolveWidgetVar() {
        FacesContext context = getFacesContext();
        String userWidgetVar = (String) getAttributes().get("widgetVar");

        if (userWidgetVar != null) {
            return userWidgetVar;
        } else {
            return "widget_" + getClientId(context).replaceAll("-|" + UINamingContainer.getSeparatorChar(context), "_");
        }
    }
}
