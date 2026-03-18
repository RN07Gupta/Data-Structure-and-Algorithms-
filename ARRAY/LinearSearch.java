public class LinearSearch {

    public static int LSearch(int marks[] , int key){
        for(int i=0 ; i<marks.length ; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int marks[] = {2 , 4 , 8 , 10 ,12 ,14 , 16};
        int key = 10;

        int index = LSearch(marks, key);
        System.out.println(index);
    }
}
