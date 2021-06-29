package com.qa.person;

import java.util.ArrayList;

public class Runner {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("FNU", "LNU", 0, "flnu@email.com", "x7777 777777", new String[0]));
    people.add(
        new Person(
            "Jefferey",
            "Skinner",
            30,
            "jsk@mail.com",
            "x1111 222222",
            new String[] {"mName1", "mName2"}));
    people.add(
        new Person(
            "Glennjamin",
            "Johnson",
            28,
            "gjohn@address.com",
            "x4444 666666",
            new String[] {"name", "name2", "name3"}));
    for (Person p : people) {
      System.out.println(p);
    }
  }
}
