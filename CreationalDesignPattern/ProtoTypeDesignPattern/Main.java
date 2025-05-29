package CreationalDesignPattern.ProtoTypeDesignPattern;

public class Main {
  public static void main(String[] args) {

    // main Object

    Student mainObj = new Student(12,34,"Shubham");

    Student clone = new Student();

    clone.age = mainObj.age;
    clone.name = mainObj.name;
   // clone.rollNumber = mainObj.rollNumber;  // this case will case as class can contain some private instance variable with private getter method

    Student cloneObj =(Student) mainObj.clone();
  }
}
