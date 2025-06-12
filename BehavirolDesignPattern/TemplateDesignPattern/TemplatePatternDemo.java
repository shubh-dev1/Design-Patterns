package BehavirolDesignPattern.TemplateDesignPattern;

public class TemplatePatternDemo {
  public static void main(String[] args) {
    DataProcessor csvProcessor = new CSVProcessor();
    csvProcessor.processData();

    DataProcessor jsonProcessor = new JSONProcessor();
    jsonProcessor.processData();

  }
}
