class Hello {
    public void hello(){
        System.out.println("你好啊");
    }
    public void hello(String name){
        System.out.println("你好啊" + name);
    }
    public void hello(String name, int age){
        if (age <= 18) {
            System.out.println("你好啊" + name + "你真年轻！");
        }else {
            System.out.println("你好啊" + name);
        }
    }
    public void seeHello(){
        this.hi();
    }
    private void hi(){
        System.out.println("我说你好");
    }
}
