import java.util.*;

class ContRainW{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int lp = 0 ;
        int rp = list.size()-1;

        int maxarea = 0;
        while(lp<rp){
            int h = Math.min(list.get(lp) , list.get(rp));
            int w = rp - lp;
            int area = h * w;
            maxarea = Math.max(area , maxarea);

            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println(maxarea);
    }
}