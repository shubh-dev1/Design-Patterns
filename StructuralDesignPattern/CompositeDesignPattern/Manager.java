package StructuralDesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
  private String name;
  private List<Employee> employees = new ArrayList<>();
  public Manager(String name){
    this.name = name;
  }
  public void addEmployee(Employee employee){
    employees.add(employee);
  }

  public void removeEmployee(Employee employee){
    employees.remove(employee);
  }

  @Override
  public void showDetails() {
    System.out.println(name + " (Manager)");
    for(Employee employee : employees){
      employee.showDetails();
    }
  }
}
