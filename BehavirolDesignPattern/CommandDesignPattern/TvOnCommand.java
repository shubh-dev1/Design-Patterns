package BehavirolDesignPattern.CommandDesignPattern;

public class TvOnCommand implements Command{
  private TV tv;
  public TvOnCommand(TV tv){
    this.tv = tv;
  }
  @Override
  public void execute() {
   tv.turnOn();
  }
}
