package com.learn.web.gwt.client.sap;

//import com.sap.sse.common.Color;
//import com.sap.sse.common.Util;
//import com.sap.sse.common.Util.Triple;

public abstract class AbstractColor implements Color {
    private static final long serialVersionUID = 7758884012281863458L;

    @Override
    public String getAsHtml() {
        Util.Triple<Integer, Integer, Integer> asRGB = getAsRGB();
        return "#" + toBrowserHexValue(asRGB.getA()) + toBrowserHexValue(asRGB.getB())
                + toBrowserHexValue(asRGB.getC());
    }

    private static String toBrowserHexValue(int number) {
        StringBuilder builder = new StringBuilder(Integer.toHexString(number & 0xff));
        while (builder.length() < 2) {
            builder.insert(0, '0');
        }
        return builder.toString().toUpperCase();
    }

    /**
     * accepts all colors in the css-format (see http://www.w3schools.com/cssref/css_colors_legal.asp)
     * 
     * @return {@code null} in case {@code color==null} or {@code color} cannot be parsed successfully as a valid CSS
     *         color string
     */
    public static Color getCssColor(String color) {
        Color resultColor;
        if (color == null) {
            resultColor = null;
        } else {
            String[] colorWithName = color.trim().split("[()]");
            if (colorWithName.length == 2) {
                switch (colorWithName[0].trim().toLowerCase()) {
                case "rgb":
                case "rgba":
                    return getRGBColor(colorWithName[1]);
                case "hsl":
                case "hsla":
                case "hsv":
                    return getHSVColor(colorWithName[1]);
                }
            }
            resultColor = getColorByLowercaseNameStatic(color.toLowerCase().replace(" ", ""));
            if (resultColor == null) {
                try {
                    resultColor = new RGBColor(color);
                } catch (NumberFormatException e) {
                    // ignore this exception and return null
                } catch (IllegalArgumentException e) {
                    // ignore this exception and return null
                }
            }
        }
        return resultColor;

    }

    /**
     * 
     * @param color
     *            for example: "210, 100%, 50%", "210.0, 1.0, 0.5"(with or without spaces),ignores brightness of HSLA
     * @return the Color as Color-Object
     */
    private static Color getHSVColor(String color) {
        String[] values = color.replace(" ", "").split(",");
        if (values.length == 3 || values.length == 4) {
            try {
                float hue = Float.parseFloat(values[0]);
                float saturation = parseToFloat(values[1].replace("%", ""));
                float brightness = parseToFloat(values[2].replace("%", ""));
                return new HSVColor(hue, saturation, brightness);
            } catch (NumberFormatException e) {
                // in this case the color isn't valid.
                return null;
            }
        } else {
            // in this case the color isn't valid.
            return null;
        }
    }

    private static float parseToFloat(String number) {
        if (number.contains(".")) {
            return Float.parseFloat(number);
        } else {
            return Float.parseFloat(number) / 100.0f;
        }
    }

    /**
     * 
     * @param color
     *            for example: "255,120,0", "0%, 12%,95%" (with or without spaces),ignores brightness of RGBA
     * @return the Color as Color-Object
     */
    private static Color getRGBColor(String color) {
        String[] values = color.replace(" ", "").split(",");
        if (values.length == 3 || values.length == 4) {
            try {

                int red = (int) (values[0].contains("%") ? parseToFloat(values[0].replace("%", "")) * 255f
                        : Integer.parseInt(values[0]));
                int green = (int) (values[1].contains("%") ? parseToFloat(values[1].replace("%", "")) * 255f
                        : Integer.parseInt(values[1]));
                int blue = (int) (values[2].contains("%") ? parseToFloat(values[2].replace("%", "")) * 255f
                        : Integer.parseInt(values[2]));
                return new RGBColor(red, green, blue);
            } catch (NumberFormatException e) {
                // in this case the color isn't valid.
                return null;
            }
        } else {
            // in this case the color isn't valid.
            return null;
        }
    }

    public static Color getColorByLowercaseNameStatic(String lowercaseColorName) {
        switch (lowercaseColorName) {
        case "aliceblue":
            return ALICE_BLUE;
        case "antiquewhite":
            return ANTIQUE_WHITE;
        case "aqua":
            return AQUA;
        case "aquamarine":
            return AQUAMARINE;
        case "azure":
            return AZURE;
        case "beige":
            return BEIGE;
        case "bisque":
            return BISQUE;
        case "black":
            return BLACK;
        case "blanchedalmond":
            return BLANCHED_ALMOND;
        case "blue":
            return BLUE;
        case "blueviolet":
            return BLUE_VIOLET;
        case "brown":
            return BROWN;
        case "burlywood":
            return BURLY_WOOD;
        case "cadetblue":
            return CADET_BLUE;
        case "chartreuse":
            return CHARTREUSE;
        case "chocolate":
            return CHOCOLATE;
        case "coral":
            return CORAL;
        case "cornflowerblue":
            return CORNFLOWER_BLUE;
        case "cornsilk":
            return CORNSILK;
        case "crimson":
            return CRIMSON;
        case "cyan":
            return CYAN;
        case "darkblue":
            return DARK_BLUE;
        case "darkcyan":
            return DARK_CYAN;
        case "darkgoldenrod":
            return DARK_GOLDEN_ROD;
        case "darkgray":
            return DARK_GRAY;
        case "darkgrey":
            return DARK_GREY;
        case "darkgreen":
            return DARK_GREEN;
        case "darkkhaki":
            return DARK_KHAKI;
        case "darkmagenta":
            return DARK_MAGENTA;
        case "darkolivegreen":
            return DARK_OLIVE_GREEN;
        case "darkorange":
            return DARK_ORANGE;
        case "darkorchid":
            return DARK_ORCHID;
        case "darkred":
            return DARK_RED;
        case "darksalmon":
            return DARK_SALMON;
        case "darkseagreen":
            return DARK_SEA_GREEN;
        case "darkslateblue":
            return DARK_SLATE_BLUE;
        case "darkslategray":
            return DARK_SLATE_GRAY;
        case "darkslategrey":
            return DARK_SLATE_GREY;
        case "darkturquoise":
            return DARK_TURQUOISE;
        case "darkviolet":
            return DARK_VIOLET;
        case "deeppink":
            return DEEP_PINK;
        case "deepskyblue":
            return DEEP_SKY_BLUE;
        case "dimgray":
            return DIM_GRAY;
        case "dimgrey":
            return DIM_GREY;
        case "dodgerblue":
            return DODGER_BLUE;
        case "firebrick":
            return FIRE_BRICK;
        case "floralwhite":
            return FLORAL_WHITE;
        case "forestgreen":
            return FOREST_GREEN;
        case "fuchsia":
            return FUCHSIA;
        case "gainsboro":
            return GAINSBORO;
        case "ghostwhite":
            return GHOST_WHITE;
        case "gold":
            return GOLD;
        case "goldenrod":
            return GOLDEN_ROD;
        case "gray":
            return GRAY;
        case "grey":
            return GREY;
        case "green":
            return GREEN;
        case "greenyellow":
            return GREEN_YELLOW;
        case "honeydew":
            return HONEY_DEW;
        case "hotpink":
            return HOT_PINK;
        case "indianred":
            return INDIAN_RED;
        case "indigo":
            return INDIGO;
        case "ivory":
            return IVORY;
        case "khaki":
            return KHAKI;
        case "lavender":
            return LAVENDER;
        case "lavenderblush":
            return LAVENDER_BLUSH;
        case "lawngreen":
            return LAWN_GREEN;
        case "lemonchiffon":
            return LEMON_CHIFFON;
        case "lightblue":
            return LIGHT_BLUE;
        case "lightcoral":
            return LIGHT_CORAL;
        case "lightcyan":
            return LIGHT_CYAN;
        case "lightgoldenrodyellow":
            return LIGHT_GOLDEN_ROD_YELLOW;
        case "lightgray":
            return LIGHT_GRAY;
        case "lightgrey":
            return LIGHT_GREY;
        case "lightgreen":
            return LIGHT_GREEN;
        case "lightpink":
            return LIGHT_PINK;
        case "lightsalmon":
            return LIGHT_SALMON;
        case "lightseagreen":
            return LIGHT_SEA_GREEN;
        case "lightskyblue":
            return LIGHT_SKY_BLUE;
        case "lightslategray":
            return LIGHT_SLATE_GRAY;
        case "lightslategrey":
            return LIGHT_SLATE_GREY;
        case "lightsteelblue":
            return LIGHT_STEEL_BLUE;
        case "lightyellow":
            return LIGHT_YELLOW;
        case "lime":
            return LIME;
        case "limegreen":
            return LIME_GREEN;
        case "linen":
            return LINEN;
        case "magenta":
            return MAGENTA;
        case "maroon":
            return MAROON;
        case "mediumaquamarine":
            return MEDIUM_AQUA_MARINE;
        case "mediumblue":
            return MEDIUM_BLUE;
        case "mediumorchid":
            return MEDIUM_ORCHID;
        case "mediumpurple":
            return MEDIUM_PURPLE;
        case "mediumseagreen":
            return MEDIUM_SEA_GREEN;
        case "mediumslateblue":
            return MEDIUM_SLATE_BLUE;
        case "mediumspringgreen":
            return MEDIUM_SPRING_GREEN;
        case "mediumturquoise":
            return MEDIUM_TURQUOISE;
        case "mediumvioletred":
            return MEDIUM_VIOLET_RED;
        case "midnightblue":
            return MIDNIGHT_BLUE;
        case "mintcream":
            return MINT_CREAM;
        case "mistyrose":
            return MISTY_ROSE;
        case "moccasin":
            return MOCCASIN;
        case "navajowhite":
            return NAVAJO_WHITE;
        case "navy":
            return NAVY;
        case "oldlace":
            return OLD_LACE;
        case "olive":
            return OLIVE;
        case "olivedrab":
            return OLIVE_DRAB;
        case "orange":
            return ORANGE;
        case "orangered":
            return ORANGE_RED;
        case "orchid":
            return ORCHID;
        case "palegoldenrod":
            return PALE_GOLDEN_ROD;
        case "palegreen":
            return PALE_GREEN;
        case "paleturquoise":
            return PALE_TURQUOISE;
        case "palevioletred":
            return PALE_VIOLET_RED;
        case "papayawhip":
            return PAPAYA_WHIP;
        case "peachpuff":
            return PEACH_PUFF;
        case "peru":
            return PERU;
        case "pink":
            return PINK;
        case "plum":
            return PLUM;
        case "powderblue":
            return POWDER_BLUE;
        case "purple":
            return PURPLE;
        case "rebeccapurple":
            return REBECCA_PURPLE;
        case "red":
            return RED;
        case "rosybrown":
            return ROSY_BROWN;
        case "royalblue":
            return ROYAL_BLUE;
        case "saddlebrown":
            return SADDLER_BROWN;
        case "salmon":
            return SALMON;
        case "sandybrown":
            return SANDY_BROWN;
        case "seagreen":
            return SEA_GREEN;
        case "seashell":
            return SEA_SHELL;
        case "sienna":
            return SIENNA;
        case "silver":
            return SILVER;
        case "skyblue":
            return SKY_BLUE;
        case "slateblue":
            return SLATE_BLUE;
        case "slategray":
            return SLATE_GRAY;
        case "slategrey":
            return SLATE_GREY;
        case "snow":
            return SNOW;
        case "springgreen":
            return SPRING_GREEN;
        case "steelblue":
            return STEEL_BLUE;
        case "tan":
            return TAN;
        case "teal":
            return TEAL;
        case "thistle":
            return THISTLE;
        case "tomato":
            return TOMATO;
        case "turquoise":
            return TURQUOISE;
        case "violet":
            return VIOLET;
        case "wheat":
            return WHEAT;
        case "white":
            return WHITE;
        case "whitesmoke":
            return WHITE_SMOKE;
        case "yellow":
            return YELLOW;
        case "yellowgreen":
            return YELLOW_GREEN;
        default:
            return null;
        }
    }

    @Override
    public Color invert() {
        final Util.Triple<Integer, Integer, Integer> rgb = getAsRGB();
        return new RGBColor(255-rgb.getA(), 255-rgb.getB(), 255-rgb.getC());
    }
}
