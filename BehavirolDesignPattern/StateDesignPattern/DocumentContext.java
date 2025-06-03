package BehavirolDesignPattern.StateDesignPattern;



public class DocumentContext {
  private DocumentState state;

  public void setState(DocumentState state){
    this.state = state;
  }

  public void applyState(){
    state.handleRequest();
  }
}
