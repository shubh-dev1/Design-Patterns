package BehavirolDesignPattern.CommandDesignPattern;

public class CommandPatternDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    Command tvOn = new TvOnCommand(tv);
    Command tvOff = new TvOffCommand(tv);

    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(tvOn);
    remoteControl.pressButton();

    remoteControl.setCommand(tvOff);
    remoteControl.pressButton();
  }
}
