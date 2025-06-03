package BehavirolDesignPattern.StateDesignPattern;

public class StatePatternDemo {
  public static void main(String[] args) {
    DocumentContext context = new DocumentContext();

    context.setState(new DraftState());
    context.applyState();

    context.setState(new ReviewState());
    context.applyState();

    context.setState(new PublishedState());
    context.applyState();
  }
}
