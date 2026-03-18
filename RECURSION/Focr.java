class Focr{

    public static int Focc(int[] arr , int key , int i){
        
        if(arr[i] == key){
            return i;
        }
        if(i != arr.length-1){
            return Focc(arr , key , i+1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(Focc(arr , 11 , 0));
    }
}