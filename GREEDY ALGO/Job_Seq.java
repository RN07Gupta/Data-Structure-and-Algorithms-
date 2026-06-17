import java.util.*;
class Job_Seq{
    public static void main(String[] args){

        int[] deadline = {4, 1, 1, 1};
        int[] profit = {20, 10, 40, 30};
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < deadline.length; i++) {
            l.add(Arrays.asList(deadline[i], profit[i]));
        }

        l.sort((a, b) -> b.get(1) - a.get(1));

        int time = 0;
        int totalProfit = 0;

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) > time) {
                time++;
                totalProfit += l.get(i).get(1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(time);
        ans.add(totalProfit);

        System.out.println(ans);
    }
}