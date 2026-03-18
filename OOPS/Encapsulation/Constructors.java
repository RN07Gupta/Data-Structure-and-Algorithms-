class Constructors{
    public static void main(String args[]){

        Student s1 = new Student("Aryan" , 44);
        Student s3 = new Student("A");
        Student s2 = new Student();
        System.out.println(s3.sec);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class Student {
    String name ;
    int roll;
    String sec;

    // Parameterized Constructor
    Student(String name , int roll){
        this.name = name;
        this.roll = roll;
        System.out.println("Constructors called - Student data is created");
    }

    // The code snippet you provided is defining a non-parameterized constructor for the `Student`
    // class in Java. This constructor does not take any parameters and simply prints an empty line
    // when it is called.
    // Non Parameterized Constructor
    Student(){
        System.out.println("Non Parameterized Constructor");
    }

    Student(String sec){
        this.sec = sec;
    }


}