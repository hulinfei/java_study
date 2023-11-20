public class Outer {
    private String name;
    Outer(String name){
        this.name = name;
    }
    class Inner{
        void hello(){
            System.out.println("我是内部类在说你好");
        }
    }
}
