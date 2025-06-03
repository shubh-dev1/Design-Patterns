package BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public abstract class Logger {
  protected Logger nextLogger;
  public void setNextLogger(Logger nextLogger){
    this.nextLogger = nextLogger;
  }

  public void logMessage(int level,String message){
    if(canHandle(level)) write(message);
    if(nextLogger != null) nextLogger.logMessage(level,message);
  }
  abstract protected boolean canHandle(int level);
  abstract protected void write(String message);
}
