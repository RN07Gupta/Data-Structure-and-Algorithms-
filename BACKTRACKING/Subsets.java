
class Subsets {

    public static void subset(String str, String ans, int i) {
        // base
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        

        // recursion
        // yes
        subset(str, ans + str.charAt(i), i + 1);
        // no
        subset(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subset(str, ans ,0);
    }
}
