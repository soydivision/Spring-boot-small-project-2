package com.github.passmesomesugar.SpringSmallProject2.api;

import com.github.passmesomesugar.SpringSmallProject2.model.Person;
import com.github.passmesomesugar.SpringSmallProject2.service.PersonService;

public class PersonController {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  public void addPerson(Person person) {
    personService.addPerson(person);
  }
}
