class Locc{

    public static int Locc(int[] arr , int key , int i){
        
        if(arr[i] == key){
            return i;
        }
        if(i > 0){
            return Locc(arr , key , i-1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,3,3};
        System.out.println(Locc(arr , 45 , arr.length-1));
    }
}

