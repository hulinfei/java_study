public class TestCoreClass {
    public static void main(String[] args){
        String[] bs = {"byte","short","long","int","double","float","boolean","char"};
        String[] by = {"String", "Array", "所有类", "所有接口"};
        for (String b: bs
             ) {
            System.out.println("我是基本类型：" + b);
        }
        for (String y: by
             ) {
            System.out.println("我是引用类型：" + y);
        }
    }
}
