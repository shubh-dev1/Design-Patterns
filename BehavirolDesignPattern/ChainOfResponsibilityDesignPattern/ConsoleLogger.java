package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class ConsoleLogger extends Logger{

  @Override
  protected boolean canHandle(int level) {
    return level == 1;
  }

  @Override
  protected void write(String message) {
    System.out.println("Console: "+ message);
  }
}
