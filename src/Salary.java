class Salary extends Income {
    public Salary(double income){
        super(income);
    }
    public double getTax(){
        System.out.println("工资收入");
        if(income <= 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
