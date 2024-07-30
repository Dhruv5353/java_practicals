import java.util.*;

public class prac3_7_4 {
    public static void main(String[] args) {
        Person person = createPerson("23CS041");
        System.out.println("Person's name: " + person.name);
        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }

    public static Person createPerson(String name) {
        return new Person(name);
    }
}
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}


