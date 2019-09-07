package com.gss.ch02.job;

import com.gss.ch02.api.Operator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Booth extends Operator<String, Object> {
  private final Map<String, Integer> countMap = new HashMap<String, Integer>();

  public Booth(String name) {  super(name);  }

  @Override
  public void apply(String vehicle, List<Object> eventCollector) {
    Integer count = countMap.getOrDefault(vehicle, 0) + 1;
    countMap.put(vehicle, count);

    System.out.println("vehicle: " + vehicle + ", count: " + count);
  }
}
