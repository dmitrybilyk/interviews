package com.learn.java8.lambda.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Evaluation evaluation = new Evaluation();
    evaluation.setName("Ev name");
    Criteria criteria1 = new Criteria();
    criteria1.setName("Cri name");
    Subevaluation sub1 = new Subevaluation();
    sub1.setName("Sub 1");
    Subevaluation sub2 = new Subevaluation();
    sub2.setName("Sub 2");
    criteria1.setSubevaluationList(new ArrayList<>());
    criteria1.getSubevaluationList().add(sub1);
    criteria1.getSubevaluationList().add(sub2);
    evaluation.setCriteriaList(new ArrayList<>());
    evaluation.getCriteriaList().add(criteria1);

    List<Evaluation> evaluations = new ArrayList<>();
    evaluations.add(evaluation);

//    evaluations.stream()
//            .map(Evaluation::getCriteriaList)
//            .forEach(criteria -> {
//              System.out.println(criteria.get);
//            });


//    evaluations.forEach(evaluationBO -> evaluationBO.getCriteriaList().forEach(criteriaBO ->
//            criteriaBO.getSubevaluationList().forEach(subevaluationBO -> {
//                System.out.println(subevaluationBO.getName());
//            })));


    evaluations.stream().map(Evaluation::getCriteriaList).
            flatMap(List::stream)
            .map(Criteria::getSubevaluationList)
            .flatMap(List::stream)
            .forEach(subevaluation -> System.out.println(subevaluation.getName()));


//    evaluations.stream()
//            .map(Evaluation::getCriteriaList).collect(Collectors.toList())
//            .stream()
//            .map(Criteria::getSubevaluationList)
//            .forEach(r -> {
//              System.out.println();
//            });
  }
}
