package com.github.passmesomesugar.SpringSmallProject2.dao;

import com.github.passmesomesugar.SpringSmallProject2.model.Person;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class FakePersonDataAccessService implements PersonDao {
  private static List<Person> DB = new ArrayList<>();

  @Override
  public int insertPerson(UUID id, Person person) {
    DB.add(new Person(id, person.getName()));
    return 1;
  }
}