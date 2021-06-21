import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("5000","40000","BNV","bd-c");
        car.display();
        Student student = new Student("otar","14");
        student.play();
        System.out.println(student.name);
        Employee employee = new Employee("otar", "14", "programmer", "google", "100000$");
        employee.work();
        employee.rest("10");
    }
}