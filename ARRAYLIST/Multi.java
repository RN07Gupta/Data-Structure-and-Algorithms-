import java.util.*;
class Multi{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i =0; i<mainList.size() ; i++){
            ArrayList<Integer> currL = mainList.get(i);
            for(int j=0 ; j<currL.size() ; j++){
                System.out.print(currL.get(j)+" ");
            }
            System.out.print("");
        }

    }
}