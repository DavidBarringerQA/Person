package com.qa.person;

import java.util.ArrayList;

public class Runner {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    Person fnu = new Person();
    fnu.setForename("FNU");
    fnu.setSurname("LNU");
    fnu.setAge(0);
    fnu.setEmail("flnu@email.com");
    fnu.setTelephoneNo("x7777 777777");
    fnu.setMiddleNames(new String[0]);
    people.add(fnu);
    Person jefferey = new Person();
    jefferey.setForename("Jeremy");
    jefferey.setSurname("Skinner");
    jefferey.setAge(30);
    jefferey.setEmail("jsk@mail.com");
    jefferey.setTelephoneNo("x1111 222222");
    jefferey.setMiddleNames(new String[] {"mName1", "mName2"});
    people.add(jefferey);
    Person glennjamin = new Person();
    glennjamin.setForename("Glennjamin");
    glennjamin.setSurname("Johnson");
    glennjamin.setAge(28);
    glennjamin.setEmail("gjohn@address.com");
    glennjamin.setMiddleNames(new String[] {"name", "Jedadiah", "name"});
    people.add(glennjamin);
    for (Person person : people) {
      System.out.println(person);
    }
  }
}
