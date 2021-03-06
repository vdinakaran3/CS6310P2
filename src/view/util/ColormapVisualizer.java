package view.util;

import java.awt.*;

/**
 * Visualization algorithm based on the opacity of color red.
 */
public class ColormapVisualizer implements ColorGenerator {

    private ColorMap colormap;

    public ColormapVisualizer(String cpName) {
    	colormap = ColorMap.getMap(cpName);
    }

    @Override
    public Color calculateColor(double value) {
    	//NOTE: value is expected to be between 0 and 1.0
    	return colormap.getColor(value);
    }
}
