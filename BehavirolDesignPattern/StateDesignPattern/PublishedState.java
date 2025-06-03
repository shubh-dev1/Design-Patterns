package BehavirolDesignPattern.StateDesignPattern;

public class PublishedState implements DocumentState{
  @Override
  public void handleRequest() {
    System.out.println("Document is published");
  }
}
