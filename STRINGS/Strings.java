import java.util.*;
class Strings{

    // charAt()
    public static void charat(String fullName){
        for(int i=0; i<fullName.length() ; i++){
            System.out.println( fullName.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
    // Strings are IMUTABLE
    char[] ch = {'a','b','c','d'};
    String str = "abcd";
    String str2 = new String("xyz");

    // Input and Output 

    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);

    // Length of the String
    System.out.println(name.length());

    // Concatanation
    String firstName = "Aryan";
    String lastName = "Gupta";
    String fullName = firstName +" "+ lastName;
    System.out.println(fullName);

    charat("Aryan Gupta");

    }
}