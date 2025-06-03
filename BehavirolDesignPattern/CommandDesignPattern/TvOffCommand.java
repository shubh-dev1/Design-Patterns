package BehavirolDesignPattern.CommandDesignPattern;

public class TvOffCommand implements Command{
  private TV tv;
  public TvOffCommand(TV tv){
    this.tv = tv;
  }
  @Override
  public void execute() {
    tv.turnOff();
  }
}
