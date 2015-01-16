package com.learn.core.strings;

import com.google.common.base.CharMatcher;

/**
 * Created by dmitry on 09.01.15.
 */
public class FileSeparatorSystemGetPropertyMain {
    public static void main(String[] args) {
//        String s = "idet_soldat_po_gorodu_-_Idyot_soldat_po_gorodu_vkon_09_(get-tune.net).mp3";
        String s = "C:/fakepath/idet_soldat_po_gorodu_-_Idyot_soldat_po_gorodu_vkon_09_(get-tune.net).mp3";
//        System.out.println(System.getProperty("file.separator"));
        String fixedString = s.substring(s.lastIndexOf('/') + 1, s.length());
        String fixedString2 = fixedString.substring(fixedString.lastIndexOf('\\') + 1, fixedString.length());
//        String fixedString = s.substring(s.lastIndexOf(System.getProperty("file.separator")) + 1, s.length());
//        String fixedString = CharMatcher.s.substring(s.lastIndexOf(System.getProperty("file.separator")) + 1, s.length());

        System.out.println(fixedString);
    }
}
