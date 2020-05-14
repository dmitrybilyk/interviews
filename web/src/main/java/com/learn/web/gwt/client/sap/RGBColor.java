package com.learn.web.gwt.client.sap;

//import com.sap.sse.common.Util;

/**
 * A color defined in the RGB color schema
 * @author Frank
 */
public class RGBColor extends AbstractColor {
    private static final long serialVersionUID = -4091876840771631308L;
    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        this.red = ensureValidRange(red);
        this.green = ensureValidRange(green);
        this.blue = ensureValidRange(blue);
    }
    
    /**
     * Constructs an RGB color from a string such as "#FF00FF"
     */
    public RGBColor(String htmlColor) {
        if (htmlColor.startsWith("#")) {
            htmlColor = htmlColor.substring(1);
        }
        if (htmlColor.endsWith(";")) {
            htmlColor = htmlColor.substring(0, htmlColor.length() - 1);
        }

        int r, g, b;
        switch (htmlColor.length()) {
        case 6:
            r = Integer.parseInt(htmlColor.substring(0, 2), 16);
            g = Integer.parseInt(htmlColor.substring(2, 4), 16);
            b = Integer.parseInt(htmlColor.substring(4, 6), 16);
            break;
        case 3:
            final int r0 = Integer.parseInt(htmlColor.substring(0, 1), 16);
            r = 16*r0 + r0;
            final int g0 = Integer.parseInt(htmlColor.substring(1, 2), 16);
            g = 16*g0 + g0;
            final int b0 = Integer.parseInt(htmlColor.substring(2, 3), 16);
            b = 16*b0 + b0;
            break;
        case 1:
            r = g = b = Integer.parseInt(htmlColor.substring(0, 1), 16);
            break;
        default:
            throw new IllegalArgumentException(htmlColor);
        }
        this.red = ensureValidRange(r);
        this.green = ensureValidRange(g);
        this.blue = ensureValidRange(b);
    }

    public RGBColor() {
    }

    private int ensureValidRange(int value) {
        int result = value;
        if (value < 0) {
            result = 0;
        } else if (value > 255) {
            result = 255;
        }
        return result;
    }

    @Override
    public Util.Triple<Integer, Integer, Integer> getAsRGB() {
        return new Util.Triple<Integer, Integer, Integer>(red, green, blue);
    }

    public Util.Triple<Float, Float, Float> getAsHSV() {
        float hue, saturation, brightness;
        int cmax = (red > green) ? red : green;
        if (blue > cmax) {
            cmax = blue;
        }
        int cmin = (red < green) ? red : green;
        if (blue < cmin) {
            cmin = blue;
        }

        brightness = ((float) cmax) / 255.0f;
        if (cmax != 0) {
            saturation = ((float) (cmax - cmin)) / ((float) cmax);
        } else {
            saturation = 0;
        }
        if (saturation == 0) {
            hue = 0;
        }
        else {
            float redc = ((float) (cmax - red)) / ((float) (cmax - cmin));
            float greenc = ((float) (cmax - green)) / ((float) (cmax - cmin));
            float bluec = ((float) (cmax - blue)) / ((float) (cmax - cmin));
            if (red == cmax) {
                hue = bluec - greenc;
            } else if (green == cmax) {
                hue = 2.0f + redc - bluec;
            } else {
                hue = 4.0f + greenc - redc;
            }
            hue = hue / 6.0f;
            if (hue < 0) {
                hue = hue + 1.0f;
            }
        }

        Util.Triple<Float, Float, Float> HSVColor = new Util.Triple<Float, Float, Float>(hue * 360, saturation, brightness);
        return HSVColor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + blue;
        result = prime * result + green;
        result = prime * result + red;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RGBColor other = (RGBColor) obj;
        if (blue != other.blue)
            return false;
        if (green != other.green)
            return false;
        if (red != other.red)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getAsHtml();
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
