package StructuralDesignPattern.FacadeDesignPattern;

public class ComputerFacade {
  private CPU cpu;
  private Memory memory;
  private HardDrive hardDrive;
  public ComputerFacade(){
    cpu = new CPU();
    memory = new Memory();
    hardDrive = new HardDrive();
  }

  public void startComputer(){
    System.out.println("Starting computer");
    cpu.start();
    memory.load();
    hardDrive.readData();
    System.out.println("Computer started successfully");
  }
}
