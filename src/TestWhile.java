public class TestWhile {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        while (a <= 10) {
            System.out.println(a);
            a = a + b;
        }
        System.out.println("b初始值");
        System.out.println(b);
        do {
            b += 1;
            System.out.println("这里才是循环");
            System.out.println(b);
        } while (b < 3); {
            System.out.println("这是是不满足循环条件");
            System.out.println(b);
        }
    }
}
