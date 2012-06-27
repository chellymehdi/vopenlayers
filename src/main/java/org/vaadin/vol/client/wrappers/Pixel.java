package org.vaadin.vol.client.wrappers;

import com.google.gwt.core.client.JavaScriptObject;

public class Pixel extends JavaScriptObject {

    protected Pixel() {
    };

    public native static Pixel create(double x, double y)
    /*-{
    	return new $wnd.OpenLayers.Pixel(x, y);
    }-*/;
    
    public native final int getX()
    /*-{
    return this.x;
    }-*/;

    public native final int getY()
    /*-{
    return this.y;
    }-*/;

    /**
     * @return An wrapper for OpenLayers.LonLat corresponding to the given
     *         OpenLayers.Pixel, translated into lon/lat by the current base
     *         layer
     */
    public final native LonLat getLonLatFromPixel()
    /*-{
     	return $wnd.OpenLayers.Map.getLonLatFromPixel(this); 
    }-*/;

}
