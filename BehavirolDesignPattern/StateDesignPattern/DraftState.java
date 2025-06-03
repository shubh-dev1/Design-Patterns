package BehavirolDesignPattern.StateDesignPattern;

public class DraftState implements DocumentState{
  @Override
  public void handleRequest() {
    System.out.println("Document is in draft state");
  }
}
