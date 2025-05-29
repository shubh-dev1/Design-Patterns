package StructuralDesignPattern.FacadeDesignPattern;

public class FacadePatternDemo {
  public static void main(String[] args) {
    ComputerFacade computerFacade = new ComputerFacade();
    computerFacade.startComputer();
  }
}
