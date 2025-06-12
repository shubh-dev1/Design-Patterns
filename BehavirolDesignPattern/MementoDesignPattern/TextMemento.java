package BehavirolDesignPattern.MementoDesignPattern;

public class TextMemento {
  private final String state;

  public TextMemento(String state){
    this.state = state;
  }

  public String getState(){
    return state;
  }
}
