package BehavirolDesignPattern.TemplateDesignPattern;

public class JSONProcessor extends DataProcessor{
  @Override
  void readData() {
    System.out.println("Reading json file");
  }

  @Override
  void process() {
    System.out.println("Processing json data");
  }
}
