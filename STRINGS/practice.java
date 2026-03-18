import java.util.*;
class practice {

    public static void main(String[] args) {

        // Count how many times lowercase vowels occurred in a String entered by the user.
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         count++;
        //     }
        // }
        // System.out.println("Number of lowercase vowels: " + count);


        // Question 2 :What will be the output of the followingcode?

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));


        // Question 3 :What will be the output of the followingcode?
        // String str="ApnaCollege".replace("l"," ");
        // System.out.println(str);

        // Question 4 :Determine if 2 Strings areanagramsof each other.What are anagrams?If two strings contain the same characters but in a different order,they can be said to be anagrams. Consider race and care.In this case,race's characters can be formed in to a study,or care's characters can be formed into race.Below is a java program to check if two strings are anagrams or not

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ → not anagram
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert to char array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        
    }
}
