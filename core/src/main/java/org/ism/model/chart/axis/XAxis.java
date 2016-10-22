/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ism.model.chart.axis;

import java.util.ArrayList;
import java.util.List;

/**
 * The X axis or category axis. Normally this is the horizontal axis, though if
 * the chart is inverted this is the vertical axis. In case of multiple axes,
 * the xAxis node is an array of configuration objects.
 *
 * @See the Axis object for programmatic access to the axis.
 *
 * @author r.hendrick
 */
public class XAxis {

    /**
     * <h3>allowDecimals</h3>
     *
     * Whether to allow decimals in this axis' ticks. When counting integers,
     * like persons or hits on a web page, decimals should be avoided in the
     * labels. Defaults to true. Try it:
     *
     * True by default (unwanted for this type of data), false See also:
     *
     * minTickInterval
     */
    private Boolean allowDecimals = null;

    /**
     * <h3>categories</h3>
     * 
     * If categories are present for the xAxis, names are used instead of
     * numbers for that axis. Since Highcharts 3.0, categories can also be
     * extracted by giving each point a name and setting axis type to category.
     * However, if you have multiple series, best practice remains defining the
     * categories array.
     *
     * Example:
     *
     * categories: ['Apples', 'Bananas', 'Oranges'] Defaults to null Try it:
     *
     * With and without categories
     */
    List<String> categories = null;

    /**
     * Boolean used to determine if when of the setter method was used that way,
     * we know if a parameter has to be write down
     */
    private Boolean unused = true;
    
    /***
     * 
     * @return 
     */
    public boolean isUnused() {
        return unused;
    }
    
    /**
     * <h3>addCategorie</h3>
     * 
     * This allow to fullfill xAxis label
     * 
     * @param categorie 
     */
    public void addCategorie(String categorie){
        if(categorie==null){    unused = categorie != null; return; }
        if(categories==null)    categories = new ArrayList<String>();
        categories.add(categorie);
        unused = categorie != null;
    }   
    
    public Boolean getAllowDecimals() {
        return allowDecimals;
    }

    public void setAllowDecimals(Boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
        unused = allowDecimals != null;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
        unused = categories != null;
    }

    
    
    
    
}
