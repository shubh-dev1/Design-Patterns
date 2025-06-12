package BehavirolDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NameCollection implements IterableCollection<String>{
  private List<String> names = new ArrayList();

  public void addName(String name){
    names.add(name);
  }
  @Override
  public Iterator<String> createIterator() {
    return new ListIterator<>(names);
  }
}
