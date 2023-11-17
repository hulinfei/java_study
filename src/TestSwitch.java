import java.util.Scanner;
public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("石头剪刀布游戏开始了");
        System.out.println("A先出，请输入：");
        String a = scanner.nextLine();
        System.out.println("到B了，请输入：");
        String b = scanner.nextLine();
        switch (a) {
            case "石头" -> {
                switch (b) {
                    case "石头" -> System.out.println("平手");
                    case "剪刀" -> System.out.println("A赢了");
                    case "布" -> System.out.println("B赢了");
                    default -> System.out.println("B出错了");
                }
            }
            case "剪刀" -> {
                switch (b) {
                    case "石头" -> System.out.println("B赢了");
                    case "剪刀" -> System.out.println("平手");
                    case "布" -> System.out.println("A赢了");
                    default -> System.out.println("B出错了");
                }
            }
            case "布" -> {
                switch (b) {
                    case "石头" -> System.out.println("A赢了");
                    case "剪刀" -> System.out.println("B赢了");
                    case "布" -> System.out.println("平手");
                    default -> System.out.println("B出错了");
                }
            }
            default -> {
                System.out.println("A出错了");
            }
        }
    }
}
