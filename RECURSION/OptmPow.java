class OptmPow{

    public static int OptPow(int x , int n){
        if(n ==0){
            return 1;
        }

        int halfPowerSq = OptPow(x , n/2) * OptPow(x , n/2);

        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(OptPow(x, n));
    }
}