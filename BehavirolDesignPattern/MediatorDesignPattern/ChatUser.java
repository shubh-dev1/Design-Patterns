package BehavirolDesignPattern.MediatorDesignPattern;

public class ChatUser extends User{

  public ChatUser(ChatMediator mediator,String name){
    super(mediator,name);
  }
  @Override
  void sendMessage(String message) {
    System.out.println(name +" sends "+ message);
    mediator.sendMessage(message,this);
  }

  @Override
  void receiveMessage(String message) {
    System.out.println(name + " received "+ message);
  }
}
