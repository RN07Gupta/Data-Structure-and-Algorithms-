class Fib{

    public static int fib(int n){
        if( n == 0 ){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int f = fib(n-1);
        int l = fib(n-2);
        int s = f + l;
        return s;
    }
    public static void main(String[] args) {
        int n=10;

        System.out.println(fib(n));
    }
}