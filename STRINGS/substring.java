
class substring {

    public static void subStr(String str, int si, int ei) {
        String word = "";
        for (int i = 0; i < ei; i++) {
            word += str.charAt(i);
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        subStr(str , 0 , 5);

        System.out.println(str.substring(0, 5));
    }
}
