public class TestClass {
    public static void main(String[] args){
        int i = 100;
//        Integer n1 = new Integer(i);
        Integer n2 = Integer.valueOf(i);
        Integer n3 = Integer.valueOf("100");
        System.out.println(n2);
        System.out.println(n3);
        Integer n = Integer.valueOf(i);
        int x = n.intValue();
        System.out.println(x);
        Integer xx = Integer.valueOf(1009);
    }
}
