/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author alsul
 */
/**
 * Class Person.java
 * A simple class which provides an definition+
6540n of a Person object
 *
 * @version 3.0 Sept 2016
 * @author Nour
 */

public class Person implements Comparable {
  private String name;
  private int age;
  private double hight;

  /**
   * Default constructor creates an empty instance of a Person
   */
  public Person() {
   name = "";
   age = 0;
   hight=0.0;
  }

  /**
   * Alternative Constructor which creates and initialises a
   * Person using the supplied parameters 
   *
   * @param nName used to set the Person name
   * @param nAge used to set the Person age
   * @param nHight use to set the person hight
   */
  public Person(String nName, int nAge, double nHight) {
    name = nName;
    age = nAge;
    hight = nHight;
  }

  /**
   * Retrieve the name of the Person 
   *
   * @return the Person name 
   */
  public String getName() {
    return name;
  }

  /**
   * Retrieve the age of the Person  
   *
   * @return the Person age 
   */
  public int getAge() {
    return age;
  }
  /**
   * Retrieve the hight of the person
   * 
   * @return hight;
   * */
   public double getHight(){
       return hight;
   }
   
  /**
   * Update the name of the Person  
   *
   * @param nName the new Person name 
   */
  public void setName(String nName) {
    name = nName;
  }

  /**
   * Update the age of the Person
   *
   * @param nAge the new Person age 
   */
  public void setAge(int nAge) {
    age = nAge;
  }
  
  /** 
  * Update the hight of the person
  *
  * @param nHight the new person hight
  */
  public void setHight(double nhight){
      hight=nhight;
  }

  /**
   * Returns a string representation of the object. In general, the 
   * 'toString' method returns a string that "textually represents" this
   * object. The result should be a concise but informative representation
   * that is easy for a person to read. It is recommended that all Objects
   * provide this method.  
   *
   * @return String representation of an object 
   */
  public String toString() {
    return "Person(" + name + ", " + age + ","+hight +" )";
  }

    @Override
    public int compareTo(Object t) {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      switch (this.getName().compareTo(t.toString())) {
          case 1:
              return 1;
          case -1:
              return -1;
          default:
              return 0;
      }
    }

}
    

