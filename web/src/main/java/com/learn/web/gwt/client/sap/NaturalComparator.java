package com.learn.web.gwt.client.sap;

import java.util.Comparator;

/**
 * Natural Order String Comparison inspired by the idea of Martin Pool and Dave Koelle.
 * <p>
 * 
 * Natural order compares mixed (alphanumeric) string in a more intuitive way: a &lt; a0 &lt; a1 &lt; a1a &lt; a1b &lt;
 * a2 &lt; a10 &lt; a20
 * 
 */
public class NaturalComparator implements Comparator<String> {
    boolean caseSensitive;
    
    public NaturalComparator(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }
    
    /**
     * Creates a case-sensitive natural comparator.
     */
    public NaturalComparator() {
        caseSensitive = true;
    }

    /**
     * Compare the passed strings in natural order.
     */
    @Override
    public int compare(final String aOrNull, final String bOrNull) {
        String a = aOrNull == null ? "" : aOrNull;
        String b = bOrNull == null ? "" : bOrNull;
        if (!caseSensitive){
            a = a.toLowerCase();
            b = b.toLowerCase();
        }
        int result = 0;
        int aIndex = 0;
        int bIndex = 0;
        int aLength = a.length();
        int bLength = b.length();

        while (aIndex < aLength && bIndex < bLength) {
            // Get next block of all-char or all-digit substring
            String aBlock = getBlock(a, aIndex);
            aIndex += aBlock.length();
            String bBlock = getBlock(b, bIndex);
            bIndex += bBlock.length();

            // Compare all-digit blocks as numbers - all-char blocks as strings
            if (Character.isDigit(aBlock.charAt(0)) && Character.isDigit(bBlock.charAt(0))) {
                result = Long.valueOf(aBlock).compareTo(Long.valueOf(bBlock));
            } else {
                result = aBlock.compareTo(bBlock);
            }

            if (result != 0) {
                return result;
            }
        }

        // Strings may be of different size
        return aLength - bLength;
    }

    private String getBlock(String value, int index) {
        int valueLength = value.length();
        StringBuilder blockBuilder = new StringBuilder();

        char ch = value.charAt(index++);
        blockBuilder.append(ch);

        if (Character.isDigit(ch)) {
            while (index < valueLength) {
                ch = value.charAt(index++);
                if (!Character.isDigit(ch)) {
                    break;
                } else {
                    blockBuilder.append(ch);
                }
            }
        } else {
            while (index < valueLength) {
                ch = value.charAt(index++);
                if (Character.isDigit(ch)) {
                    break;
                } else {
                    blockBuilder.append(ch);
                }
            }
        }

        return blockBuilder.toString();
    }

}
