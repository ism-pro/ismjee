/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ism.model.chart.properties;

/**
 * <h1>Center</h1>
 *
 * <h2>Description</h2>
 *
 *
 * @author r.hendrick
 */
public class Point {

    /**
     * First 
     */
    private String x = null;
    private String y = null;
    
    
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
        return (x!=null) & (y!=null);
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }    
}
