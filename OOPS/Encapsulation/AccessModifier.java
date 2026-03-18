class AccessModifier{
    public static void main(String args[]){
        BankAccount MyAcc = new BankAccount();
        MyAcc.setPass("qwertyuiop");
        // MyAcc.password; X
        System.out.println( MyAcc.username = "Aryan");
    }
}

class BankAccount{
    public String username;
    private String password ;

    public void setPass(String pwd){
        password = pwd;
    }

}