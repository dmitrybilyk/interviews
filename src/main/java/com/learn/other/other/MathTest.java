package com.learn.other.other;

/**
 * Created by dmitry on 08.05.15.
 */
public class MathTest {
  public static void main(String[] args) {

    double total = 802;
    double good = 468;
    double normal = 7;
    double bad = 327;


    double percentage1 = 58.35411471;
    double percentage = 0.8728343243243;
    double percentage3 = 40.773067;

    System.out.println(Math.pow(10, 1));
    System.out.println(normal / total);

    System.out.println("normal - " + Math.round(percentage * 100 / 100));
    System.out.println("normal2 - " + Math.round(percentage1 * 100 / 100));
    System.out.println("normal3 - " + Math.round(percentage3 * 100 / 100));

//    String tooltipJsFunction = "function() { return '<span  this.y + ' "+
//            from+" ' + this.total + '<br/>' + " +
//            "Math.round( this.percentage * Math.pow(10,"+decimalNumbers+"))/Math.pow(10,"+decimalNumbers+") + '%<br/>' " +
//            "+ this.x +'</span>' ; } ";

//    function() { return '<span style="text-align:center" align="center">' + this.y 45.5 + ' from ' + this.total + '<br/>' +
//            Math.round( this.percentage * Math.pow(10,1))/Math.pow(10,1) + '%<br/>' + this.x 824.5 +'</span>' ; }

//    System.out.println("pow(2.0, 2.0) is "  + Math.pow(2.0,2.0));
//    System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0,3.5));
//    System.out.println("pow(8, -1) is "     + Math.pow(10, 1));

  }

  private static double round(Double d){
//    return Math.round(d * 100 / 100);
    return Math.round(d * 100 / 100);
  }

}
