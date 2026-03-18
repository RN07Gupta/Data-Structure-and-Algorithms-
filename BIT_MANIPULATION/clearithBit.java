class clearithBit{

    public static int clearIthBits(int n , int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    public static void main(String[] args){
        System.out.println(clearIthBits(10,1));

    }
}