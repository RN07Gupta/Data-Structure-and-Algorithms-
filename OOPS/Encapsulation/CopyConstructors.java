class CopyConstructors{
    public static void main(String args[]){
        Student s1 = new Student("Aryan" , 44);
        s1.password="jhkhgfdc";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 =  new Student(s1);  // copy
        s2.password = "qwertyuiop";
        s1.marks[2] = 100;

        for(int i=0; i<3 ;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(String name , int roll) {
        this.name = name;
        this.roll = roll;
        this.marks = new int[3];
    }

    // Shallow Copy Constructors
    // Student(Student s1){
    //     this.name = s1.name ;
    //     this.roll = s1.roll;
    //     this.marks = new int[3];
    //     this.marks = s1.marks;
    // }

    // Deep copy constructors
    Student(Student s1){
        this.name = s1.name ;
        this.roll = s1.roll;
        this.marks = new int[3];

        for(int i=0 ; i<3 ; i++){
            this.marks[i] = s1.marks[i];
        }
    }

}