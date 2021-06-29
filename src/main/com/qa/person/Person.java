package com.qa.person;

public class Person {
  private String forename;
  private String surname;
  private int age;
  private String email;
  private String telephoneNo;
  private String[] middleNames;

  public Person() {
    this("", "", 0, "", "", new String[0]);
  }

  public Person(
      String forname,
      String surname,
      int age,
      String email,
      String telephoneNo,
      String[] middleNames) {
    this.forename = forname;
    this.surname = surname;
    this.age = age;
    this.email = email;
    this.telephoneNo = telephoneNo;
    this.middleNames = middleNames;
  }

  public String getForename() {
    return this.forename;
  }

  public String getSurname() {
    return this.surname;
  }

  public int getAge() {
    return this.age;
  }

  public String getEmail() {
    return this.email;
  }

  public String getTelephoneNo() {
    return this.telephoneNo;
  }

  public String[] getMiddleNames() {
    return this.middleNames;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTelephoneNo(String telephoneNo) {
    this.telephoneNo = telephoneNo;
  }

  public void setMiddleNames(String[] middleNames) {
    this.middleNames = middleNames;
  }

  public String toString() {
    String res = "Name : ";
    res += this.forename + " ";
    for (String mName : this.middleNames) {
      res += mName + " ";
    }
    res += this.surname + "\nAge : " + this.age + "\nContact details :\n\t";
    res += "Email : " + this.email + "\n\tTelephone : " + this.telephoneNo + "\n";
    return res;
  }
}
