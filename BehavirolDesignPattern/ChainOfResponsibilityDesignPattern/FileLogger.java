package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class FileLogger extends Logger{
  @Override
  protected boolean canHandle(int level) {
    return level == 2;
  }

  @Override
  protected void write(String message) {
    System.out.println("File: "+ message);
  }
}
