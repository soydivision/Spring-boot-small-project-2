package com.github.passmesomesugar.SpringSmallProject2.model;

import java.util.UUID;

public class Person {
  private final UUID id;
  private final String name;

  public Person(UUID uuid, String name) {
    this.id = uuid;
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
