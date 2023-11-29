import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class TestClass {
    private static Person person;

    public static void main(String[] args){
        int i = 100;
//        Integer n1 = new Integer(i);
        Integer n2 = i;
        Integer n3 = Integer.valueOf("100");
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(i);
        Integer xx = 1009;
        String s = "abc";
        System.out.println("匹配abc");
        System.out.println("ABC".matches(s));
        System.out.println("Abc".matches(s));
        System.out.println("abcd".matches(s));
        System.out.println("abc".matches(s));
        String s1 = "a\\&c";
        System.out.println("匹配特殊字符\\");
        System.out.println("a&c".matches(s1));
        System.out.println("a-c".matches(s1));
        System.out.println("a&&c".matches(s1));
        String s2 = "java\\d";
        System.out.println("匹配数字");
        System.out.println("java9".matches(s2));
        System.out.println("java10".matches(s2));
        String re2 = "java\\D";
        System.out.println("匹配非数字");
        System.out.println("javax".matches(re2));
        System.out.println("java#".matches(re2));
        System.out.println("java5".matches(re2));
        String s3 = "\\d{3}-\\d{7,8}";
        System.out.println("匹配座机");
        System.out.println("010-1234567".matches(s3));
        System.out.println("0874-1234567".matches(s3));
        System.out.println("087-12345678".matches(s3));
        Pattern pattern = Pattern.compile("(\\d{3,4})-(\\d{6,8})");
        Matcher m = pattern.matcher("010-1233445");
        if (m.matches()){
            String s4 = m.group(1);
            String s5 = m.group(2);
            System.out.println(s4);
            System.out.println(s5);
        }else {
            System.out.println("匹配失败");
        }
        Pattern pattern1 = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");
        Matcher matcher = pattern1.matcher("23:01:59");
        if (matcher.matches()){
            String s6 = matcher.group(1);
            String s7 = matcher.group(2);
            String s8 = matcher.group(3);
            System.out.println(s6);
            System.out.println(s7);
            System.out.println(s8);
        }else {
            System.out.println("匹配失败");
        }
        System.out.println(Arrays.toString("a b c".split("\\s")));
        System.out.println(Arrays.toString("a,b ;c".split("[,\\s;]+")));
        String s4 = "你好啊，${name},你正在学习${lang},祝你前程似锦";
        int pi = 2;
        Person[] persons = new Person[pi];
        for (i = 0; i < pi; i++){
            if (i == 0) {
                persons[i] = new Person("Tom", "正则表达式");
            }else {
                persons[i] = new Person("Lissa", "Java框架");
            }
        }
        for (Person person : persons
             ) {
            String s5 = s4.replaceAll("\\$\\{(name)}", person.getName());
            String s6 = s5.replaceAll("\\$\\{(lang)}", person.getLang());
            System.out.println(s6);
        }
    }
}
