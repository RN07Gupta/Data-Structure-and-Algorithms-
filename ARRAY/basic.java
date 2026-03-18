

public class basic {
    public static void update(int marks[]){
        for(int i=0 ; i<marks.length ; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        // Create

        // int marks[] = new int[50];
        // marks[0] = 0; 

        // String str[] = {"aa", "b", "c", "d", "e"};
        // System.out.println(str[0]);


        // // Input
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // // Output
        // System.out.println("phy " +marks[0]);
        // System.out.println("chem " +marks[1]);
        // System.out.println("math " +marks[2]);
        // sc.close();


        // // Update
        // marks[2] = marks[2] + 1;
        // System.out.println("math " +marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage = " + percentage + "%"); 

        // System.out.println(marks.length);


        // Passing arrays as arugument in function

        int marks[] = {87 , 98 , 99};
        update(marks);

        for(int i=0 ; i<marks.length ; i++){
            System.out.println(marks[i]);
        }
    }
}