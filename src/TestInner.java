public class TestInner {
    public static void main(String[] args){
        Outer outer = new Outer("外部类");
        Outer.Inner inner = outer.new Inner();
        inner.hello();
    }
}
