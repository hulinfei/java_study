import java.io.File;
import java.lang.reflect.Field;

public class TestPerson {
    public static void main(String[] args){
        Person person = new Person();
        String bob = "Bob";
        person.setName(bob);
        System.out.println(person.getName());
        bob = "Alice";
        System.out.println(person.getName());
        Person person1 = new Person();
        String[] hu = { "hu", "lin"};
        person1.setNickname(hu);
        System.out.println(person1.getNickname());
        hu[0] = "li";
        System.out.println(person1.getNickname());
        Person p = new Person("Hu", 18);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        Person ming = new Person("xiaoming", 12);
        Person hong = new Person("xiaohong", 13);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
        Person.setNumber(100);
        System.out.println(Person.number);
    }
}
