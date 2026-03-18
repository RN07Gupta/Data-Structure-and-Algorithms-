
class stringBuild {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) { // O(26) else O(26 * n^2)
            str.append(ch);
        }
        System.out.println(str);
    }
}
