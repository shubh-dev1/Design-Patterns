package BehavirolDesignPattern.IteratorDesignPattern;

public interface IterableCollection<T>{
  Iterator<T> createIterator();
}
