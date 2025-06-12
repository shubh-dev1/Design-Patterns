package BehavirolDesignPattern.TemplateDesignPattern;

public class CSVProcessor extends DataProcessor{
  @Override
  void readData() {
    System.out.println("Reading Csv file");
  }

  @Override
  void process() {
    System.out.println("Processing CSV data");
  }
}
