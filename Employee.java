public class Employee extends Person{
    String job;
    String place;
    String salary;
    Employee(String name, String age, String job, String place,String salary){
        super(name, age);
        this.job = job;
        this.place = place;
        this.salary = salary;
    }
    void work(){
        System.out.println(this.name + " is working in " + this.place);
    }
    void rest(String time){
        System.out.println(this.name + " is having a rest for " + time + " minutes");
    }
}
