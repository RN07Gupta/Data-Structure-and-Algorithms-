class powerOftwo{

    public static boolean poweroftwo(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(poweroftwo(4));
    }
}
