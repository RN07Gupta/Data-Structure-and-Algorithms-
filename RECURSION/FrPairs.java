class FrPairs{

    public static int Fpairs(int n){
        if( n==1 || n==2){
            return n;
        }

        int fnm1 = Fpairs(n-1);
        int fnm2 = Fpairs(n-2);
        int totalW = fnm1  + (n-1)*fnm2;
        return totalW;
    }
    public static void main(String[] args) {
        System.out.println(Fpairs(4));
    }
}

