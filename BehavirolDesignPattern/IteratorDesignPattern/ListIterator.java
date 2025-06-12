package BehavirolDesignPattern.IteratorDesignPattern;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
  private List<T> list;
  private int index = 0;

  public ListIterator(List<T> list){
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    return index <list.size();
  }

  @Override
  public T next() {
    return hasNext() ? list.get(index++) : null;
  }
}
