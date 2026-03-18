
class StrCompare {

    public static void main(String[] args) {
        String s1 = "Aryan";
        String s2 = "Aryan";
        String s3 = new String("Aryan");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Not equal");
        }

        if (s1 == s3) {
            System.out.println("Strngs are eual");
        } else {
            System.out.println("Not equal");
        }

        if(s1.equals(s3)){
        System.out.println("Equal");
        }

    }
}
