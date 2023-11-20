class Income {
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax(){
        System.out.println("普通收入");
        return income + 0.01;
    }
}
