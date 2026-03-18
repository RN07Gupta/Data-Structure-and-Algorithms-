class Static{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "KNIT";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}

class Student{
    int roll;
    static String schoolName;
    String name;

    void getName(){
        this.name = name;
    }

    String setName(){
        return this.name;
    }
}