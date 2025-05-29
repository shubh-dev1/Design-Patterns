package CreationalDesignPattern.SingletonDesignPattern;

public class EagerInititalization {


  // static member belongs to the class not to all the objects
  //like if you create 5 object of a class static variable will be same for the objects

  private static EagerInititalization instance = new EagerInititalization();

  private EagerInititalization(){

  }

  public static EagerInititalization getInstance(){
    return instance;
  }
}
