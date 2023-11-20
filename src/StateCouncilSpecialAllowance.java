class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    public double getTax(){
        System.out.println("国务院津贴");
        return 0;
    }
}
