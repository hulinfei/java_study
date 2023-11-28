import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

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
        try{
            int x = n;
        }catch (NullPointerException e){
            System.out.println("异常:" + e);
        }
        ArrayList<String> list = new ArrayList();
        list.add("Hello");
        System.out.println(list.getFirst());
        List list1 = new ArrayList();
        list1.add("阿斯利康到付件");
        list1.add("发卡机好地方");
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        String[] as = {"oertjor","hhkad","jakskl"};
        Arrays.sort(as);
        System.out.println(Arrays.toString(as));
        List<String> list2 = List.of("v","a","k");
        for (String s7 : list2) {
            System.out.println(s7);
        }
        Animal animal = new Animal("佩奇");
        Map<String, Animal> map = new HashMap<>();
        map.put("佩奇", animal);
        Animal target = map.get("佩奇");
        System.out.println(target == animal);
        System.out.println(target == map.get("佩奇"));
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 123123);
        System.out.println(map1.get("a"));
        map1.put("b", 1122);
        map1.put("a", 1233);
        System.out.println(map1.get("a"));
        map1.put("f", 45456);
        for (String key: map1.keySet()
             ) {
            Integer value = map1.get(key);
            System.out.println(key + "+" + value);
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}