package CreationalDesignPattern.SingletonDesignPattern;

public class DoubleLockingMethod {

  // used in industry

  private static DoubleLockingMethod instance;
  private DoubleLockingMethod(){
  }

  public static DoubleLockingMethod getInstance(){
    if(instance == null){
      synchronized (DoubleLockingMethod.class){
        if(instance == null){
          instance = new DoubleLockingMethod();
        }
      }
    }
    return instance;
  }
}
