package com.learn.core.regex;

import java.util.regex.Pattern;

public class WildcardRegex {
    public WildcardRegex() {  }
    public static void main(String[] args) {
        String test1 = "+380504759475";
        String test2 = "dima123@zoomint.com";
        String test3 = "1234";
        String test4 = "12345";
//        System.out.println(test);
        System.out.println(Pattern.matches(wildcardToRegex("+380504759475"), test1));
        System.out.println(Pattern.matches(wildcardToRegex("*@zoomint.com"), test2));
        System.out.println(Pattern.matches(wildcardToRegex("????"), test3));
        System.out.println(Pattern.matches(wildcardToRegex("??????"), test4));
        System.out.println(Pattern.matches(wildcardToRegex("?????"), test4));
        System.out.println(Pattern.matches(wildcardToRegex("????"), test4));
        System.out.println(Pattern.matches(wildcardToRegex("???"), test4));
        System.out.println(Pattern.matches(wildcardToRegex("??"), test4));
        System.out.println(Pattern.matches(wildcardToRegex("?"), test4));
//        System.out.println(Pattern.matches(wildcardToRegex("*Z*"), test));
//        System.out.println(Pattern.matches(wildcardToRegex("123*"), test));
//        System.out.println(Pattern.matches(wildcardToRegex("123"), test));
//        System.out.println(Pattern.matches(wildcardToRegex("*ABC"), test));
//        System.out.println(Pattern.matches(wildcardToRegex("*abc"), test));
//        System.out.println(Pattern.matches(wildcardToRegex("ABC*"), test));
        /*
           output :
           123ABC
            true
            true
            false
            true
            false
            true
            false
            true
            false
            false
        */
        
    }
    
    public static String wildcardToRegex(String wildcard){
        StringBuffer s = new StringBuffer(wildcard.length());
        s.append('^');
        if (wildcard.startsWith("+")) {
            return "\\+" + wildcard;
        }
        for (int i = 0, is = wildcard.length(); i < is; i++) {
            char c = wildcard.charAt(i);
            switch(c) {
                case '*':
                    s.append(".*");
                    break;
                case '?':
                    s.append(".");
                    break;
                    // escape special regexp-characters
                case '(': case ')': case '[': case ']': case '$':
                case '^': case '.': case '{': case '}': case '|':
                case '\\':
                    s.append("\\");
                    s.append(c);
                    break;
                default:
                    s.append(c);
                    break;
            }
        }
        s.append('$');
        return(s.toString());
    }
}