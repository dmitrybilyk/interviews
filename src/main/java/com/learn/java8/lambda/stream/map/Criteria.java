package com.learn.java8.lambda.stream.map;

import lombok.Data;

import java.util.List;

@Data
public class Criteria {
  private String name;
  private List<Subevaluation> subevaluationList;
}
