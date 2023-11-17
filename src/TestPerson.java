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
    }
}
