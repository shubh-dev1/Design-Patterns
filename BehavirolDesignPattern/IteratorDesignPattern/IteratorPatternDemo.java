package BehavirolDesignPattern.IteratorDesignPattern;

public class IteratorPatternDemo {
  public static void main(String[] args) {
    NameCollection collection = new NameCollection();
    collection.addName("Shubham");
    collection.addName("bharti");
    collection.addName("charlie");
    Iterator<String> iterator = collection.createIterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
