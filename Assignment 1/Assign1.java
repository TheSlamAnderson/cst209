/*
 * File:	Assign1.java
 * Author:	Anderson, Christopher
 * Description:	Print Basic Information
 */

public class Assign1 extends Object
{
 private String myName = "Christopher Anderson";
 private String mySSN = "555-55-5555";
 private String myClass = "Java Programming I";
 private String myMajor = "Information Technology";
 private String mySemester = "Fall 2008";
 public void name()
 {
  System.out.println(myName);
  System.out.println(mySSN);
  System.out.println(myClass);
  System.out.println(myMajor);
  System.out.println(mySemester);
 }
 public static void main(String args[])
 {
  Assign1 assignone;
  assignone = new Assign1();
  assignone.name();
 }
}