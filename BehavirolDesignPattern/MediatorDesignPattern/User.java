package BehavirolDesignPattern.MediatorDesignPattern;

public abstract class User {

  protected ChatMediator mediator;
  protected  String name;

  public User(ChatMediator mediator,String name){
    this.mediator = mediator;
    this.name = name;
  }

  abstract void sendMessage(String message);
  abstract void receiveMessage(String message);
}
