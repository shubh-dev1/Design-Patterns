package CreationalDesignPattern.SingletonDesignPattern;

public class synchronizedMethod {

  private static synchronizedMethod instance;

  private synchronizedMethod(){
  }

  synchronized public static synchronizedMethod getInstance(){
    if(instance == null){
      instance = new synchronizedMethod();
    }
    return instance;
  }
}
