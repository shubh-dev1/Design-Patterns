package BehavirolDesignPattern.StateDesignPattern;

public class ReviewState implements DocumentState{

  @Override
  public void handleRequest() {
    System.out.println("Document is under review");
  }
}
