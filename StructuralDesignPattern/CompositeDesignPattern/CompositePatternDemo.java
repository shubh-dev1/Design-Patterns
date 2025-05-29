package StructuralDesignPattern.CompositeDesignPattern;



public class CompositePatternDemo {
  public static void main(String[] args) {
    Employee dev1 = new Developer("Alice","Frontend Developer");
    Employee dev2 = new Developer("Bob","Backend Developer");

    Manager manager = new Manager("Charlie");
    manager.addEmployee(dev1);
    manager.addEmployee(dev2);

    manager.showDetails(); // show manager and team details
  }
}
