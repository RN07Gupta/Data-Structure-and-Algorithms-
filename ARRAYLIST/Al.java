import java.util.*;
class Al{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        // add
        list.add(4); // O(1)
        list.add(3);
        list.add(2);
        list.add(1);

        list.add(0,5); // O(n)
        System.out.println(list);

        // get
        int el = list.get(2); // O(1)
        System.out.println((el));

        // remove
        list.remove(2);  // O(n)
        System.out.println(list);

        // set
        list.set(2,10);  // O(n)
        System.out.println(list);

        // contains
        System.out.println(list.contains(10));  // O(n)
        System.out.println(list.contains(4));

        System.out.println(list.size());

        for(int i=0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }

    }
}