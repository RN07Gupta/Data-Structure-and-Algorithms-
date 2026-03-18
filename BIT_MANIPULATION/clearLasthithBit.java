class clearLasthithBit{

    public static int clearLasthithbit(int n , int i){
        int bitMask = ((~0)<<i);

        return n & bitMask;
    }
    public static void main(String[] argds){
        System.out.println(clearLasthithbit(15 , 2));
    }
}