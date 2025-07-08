import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class student{
    private String name;
    private int age;

    public student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student name=" + name + ", age=" + age +"\n";
    }

}

public class Demo {
    public static void main(String[] args) {

        List<String> names=Arrays.asList("Ricky","vicky","chakki");

        List<student> students = new ArrayList<>();

        // for(String student:names){
        //     new student(student);
        // }

        // students= names.stream()
        // .map(student-> new student(student))
        // .toList();

        students= names.stream()
                  .map(student::new)
                  .toList();
        System.out.println(students);
        
    }
}
