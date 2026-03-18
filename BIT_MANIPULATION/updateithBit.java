class updateithBit{

    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return (n | bitMask);
    }

    public static int clearIthBits(int n , int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    public static int updateithBit(int n , int i , int newBit){
        if(newBit == 0){
            return clearIthBits(n , i);
        }
        else{
            return setIthBit(n , i);
        }
    }
    public static void main(String[] args){
        System.out.println(updateithBit(10, 2, 1));
    }
}