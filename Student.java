public class Student extends Person{
    Student(String name,String age){
        super(name, age);
    }
    void learn(){
        System.out.println("Student is learning");
    }
    void play(){
        System.out.println("Student is playing");
    }
}