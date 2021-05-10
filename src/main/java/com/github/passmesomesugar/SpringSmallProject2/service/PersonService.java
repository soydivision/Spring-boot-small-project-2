package com.github.passmesomesugar.SpringSmallProject2.service;

import com.github.passmesomesugar.SpringSmallProject2.dao.PersonDao;
import com.github.passmesomesugar.SpringSmallProject2.model.Person;

public class PersonService {

  private final PersonDao personDao;

  public PersonService(PersonDao personDao) {
    this.personDao = personDao;
  }

  public int addPerson(Person person) {

    return personDao.insertPerson(person);
  }
}
