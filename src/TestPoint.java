import java.util.Random;

public class TestPoint {
    public static void main(String[] args){
        Point point = new Point(123, 456);
        System.out.println(point.x());
        System.out.println(point.y());
        System.out.println(point);
        Math.abs(-100);
        Math.min(100, 99);
        Math.max(1.2, 1.2);
        Math.pow(2, 10);
        Math.random();
        Random r = new Random();
        r.nextInt(10);
        System.out.println(r.nextInt(100));
        double x = Math.abs(-123);
        assert x >= 0 : "绝对值大于0";
        System.out.println(x);
        int xx = 234;
        assert xx < 0 : "xx小于0";
        System.out.println(xx);
    }
}
