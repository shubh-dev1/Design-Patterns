package CreationalDesignPattern.BuilderPattern;


public class Director {
  StudentBuilder studentBuilder;
  Director(StudentBuilder builder){
    this.studentBuilder = builder;
  }

  public Student createStudent(){
    if(studentBuilder instanceof EngineeringStudentBuilder){
      return createEngineeringStudent();
    }else if (studentBuilder instanceof MBAStudentBuilder){
      return createMbaStudentBuilder();
    }
    return null;
  }

  private Student createEngineeringStudent(){
    return studentBuilder.setRollNumber(1).setAge(22).setName("ss").setSubjects().build();
  }

  private Student createMbaStudentBuilder(){
    return studentBuilder.setRollNumber(2).setAge(23).setName("Br").setFatherName("myFatherName").setMotherName("myMotherName").setSubjects().build();
  }
}
