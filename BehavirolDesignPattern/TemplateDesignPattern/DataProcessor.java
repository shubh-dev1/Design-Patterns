package BehavirolDesignPattern.TemplateDesignPattern;

public abstract class DataProcessor
{
  // Template method(defined the workflow)
  public final void processData(){
    readData();
    process();
    saveData();
  }

  abstract void readData();
  abstract void process();
  void saveData(){
    System.out.println("Saving processed data...");
  }
}
