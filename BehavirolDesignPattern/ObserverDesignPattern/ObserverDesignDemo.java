package BehavirolDesignPattern.ObserverDesignPattern;

public class ObserverDesignDemo {
  public static void main(String[] args) {
    NewsAgency agency = new NewsAgency();
    User user1 = new User("shubham");
    User user2 = new User("bharti");

    agency.addObserver(user1);
    agency.addObserver(user2);

    agency.notifyObservers("Breaking news: Observer pattern in Action1");
  }
}
