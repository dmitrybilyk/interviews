package com.learn.web.gwt.client.sap;

//import com.sap.sse.common.Util;

/**
 * A color defined in the HSV color schema (hue, saturation, brightness) Hue is a degree between 0.0 and 360.0
 * Saturation is between 0.0 and 1.0 Brightness is between 0.0 and 1.0
 * 
 * @author Frank
 */
public class HSVColor extends AbstractColor {
    private static final long serialVersionUID = 7602013229606352246L;

    private  float hue;
    private  float saturation;
    private  float brightness;

    public HSVColor(float hue, float saturation, float brightness) {
        this.hue = ensureValidRange(hue, 360.0f);
        this.saturation = ensureValidRange(saturation, 1.0f);
        this.brightness = ensureValidRange(brightness, 1.0f);
    }

    public HSVColor() {
    }

    private float ensureValidRange(float value, float maxValue) {
        float result = value;
        if (value < 0.0f) {
            result = 0.0f;
        } else if (value > maxValue) {
            result = maxValue;
        }
        return result;
    }

    @Override
    public Util.Triple<Integer, Integer, Integer> getAsRGB() {
        float r, b, g;

        if (saturation == 0) {
            r = g = b = brightness;
        } else {
            float h = hue / 60.0f; // sector 0 to 5
            int i = (int) Math.floor(h);
            float f = h - i; // factorial part of h
            float p = brightness * (1 - saturation);
            float q = brightness * (1 - saturation * f);
            float t = brightness * (1 - saturation * (1 - f));

            switch (i) {
            case 0:
                r = brightness;
                g = t;
                b = p;
                break;
            case 1:
                r = q;
                g = brightness;
                b = p;
                break;
            case 2:
                r = p;
                g = brightness;
                b = t;
                break;
            case 3:
                r = p;
                g = q;
                b = brightness;
                break;
            case 4:
                r = t;
                g = p;
                b = brightness;
                break;
            default: // case 5:
                r = brightness;
                g = p;
                b = q;
            }
        }
        Util.Triple<Integer, Integer, Integer> RGBColor = new Util.Triple<Integer, Integer, Integer>(Math.round(r * 255),
                Math.round(g * 255), Math.round(b * 255));
        return RGBColor;
    }

    @Override
    public Util.Triple<Float, Float, Float> getAsHSV() {
        return new Util.Triple<Float, Float, Float>(hue, saturation, brightness);
    }

    @Override
    public String toString() {
        return "HSVColor [hue=" + hue + ", saturation=" + saturation + ", brightness=" + brightness + "]";
    }

    public float getHue() {
        return hue;
    }

    public float getSaturation() {
        return saturation;
    }

    public float getBrightness() {
        return brightness;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(brightness);
        result = prime * result + Float.floatToIntBits(hue);
        result = prime * result + Float.floatToIntBits(saturation);
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
        HSVColor other = (HSVColor) obj;
        if (Float.floatToIntBits(brightness) != Float.floatToIntBits(other.brightness))
            return false;
        if (Float.floatToIntBits(hue) != Float.floatToIntBits(other.hue))
            return false;
        if (Float.floatToIntBits(saturation) != Float.floatToIntBits(other.saturation))
            return false;
        return true;
    }
}
