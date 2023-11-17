class Person {
    protected   String name;
    protected String[] nickname;
    protected int age;

    public Person(){}

    public Person(int age){
        this.age = age;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNickname(){
        return this.nickname[0] + " " + this.nickname[1];
    }

    public void setNickname(String[] nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void run(){
        System.out.println("Person.run");
    }
}
