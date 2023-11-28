public class TestEnum {
    public static void main(String[] args){
        Weekday day = Weekday.SUN;
        if ( day == Weekday.SAT || day == Weekday.SUN){
            System.out.println("周末");
        }else {
            System.out.println("工作日");
        }
        Weekday d = Weekday.SUN;
        if (d.dayValue == 6 || d.dayValue ==0){
            System.out.println("今天是" + d + "不上班");
        }else {
            System.out.println("今天是" + d + "要上班");
        }
        switch (d){
            case FRI -> System.out.println(d.toString());
            case MON -> System.out.println(d.toString());
            case SAT -> System.out.println(d.toString());
            case SUN -> System.out.println(d.toString());
            case THU -> System.out.println(d.toString());
            case TUE -> System.out.println(d.toString());
            case WED -> System.out.println(d.toString());
            default -> System.out.println("出错了");
        }
    }
}
