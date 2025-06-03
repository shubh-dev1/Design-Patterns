package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class ChainDemo {
  public static void main(String[] args) {
    Logger consoleLogger = new ConsoleLogger();
    Logger fileLogger = new FileLogger();
    consoleLogger.setNextLogger(fileLogger);

    consoleLogger.logMessage(1,"This is an info message");
    consoleLogger.logMessage(2,"This is an debug message");
  }
}
