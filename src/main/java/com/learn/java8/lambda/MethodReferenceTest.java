package com.learn.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceTest {
        static boolean isContains5(String para) {
                return para.contains("5");
        }
        static boolean isContains3(String para) {
                return para.contains("3");
        }


        public static void main(String[] args) {
                List<String> list = Arrays.asList("3iuiu", "uiyui4");
                list.stream().filter(MethodReferenceTest::isContains5)
                        .collect(Collectors.toList()).forEach(System.out::println);


//                SomeInterface someInterface = ResultHandlerProvider::getResultHolder;
//                ResultHolder resultHolder = someInterface.handle("777", "888");
//                System.out.println(resultHolder.getResult());
        }
        class SomeClass {
                public void print(String s) {
                        System.out.println(s);
                }
        }
        @FunctionalInterface
        interface SomeInterface {
                ResultHolder handle(String s, String s2);
        }

        static Integer returnInteger2(String param) {
                return Integer.parseInt(param) * 2;
        }

        static Integer returnInteger3(String param) {
                return Integer.parseInt(param) * 3;
        }

        static class ResultHolder {
                private Integer result;

                public ResultHolder(String result) {
                        this.result = Integer.parseInt(result);
                }

                public Integer getResult() {
                        return result;
                }

                public void setResult(Integer result) {
                        this.result = result;
                }
        }


}

 class ResultHandlerProvider {

        static MethodReferenceTest.ResultHolder getResultHolder(String s, String s2) {
                String r = s + s2;
                return new MethodReferenceTest.ResultHolder(r);
        }
}
