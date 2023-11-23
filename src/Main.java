import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Person p = new Student();
        p.run();
        Hello hl = new Hello();
        hl.seeHello();
        String s = "HELLO";
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1.equals(s2));
        String s3 = "HELLO";
        String s4 = "hello";
        System.out.println(true);
        System.out.println("Hello".contains("He"));
        System.out.println(s1.replace("h", "W"));
        String s5 = "1,2,3,4";
        String[] ss = s5.split("\\,");
        System.out.println(Arrays.toString(ss));
        System.out.println(String.valueOf(123123));
        int n1 = Integer.parseInt("12312");
        System.out.println(n1);
        char[] cs = "Hello".toCharArray();
        System.out.println(cs[0]);
        String s6 = new String(cs);
        System.out.println(s6);
        Integer n = null;
        int x = n;

    }
}