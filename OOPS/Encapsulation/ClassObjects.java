
class ClassObjects{
    public static void main(String[] args){
        Pen p1 = new Pen();  // object Pen
        p1.setColor("red");
        System.out.println(p1.color);

        p1.setthick(3);
        System.out.println(p1.thickness);

        p1.color = "yellow";
        System.out.println(p1.color);


        Student s1 = new Student(); // object Student
        s1.calcPer(87, 69, 90);
        System.out.println(s1.percentage);
    }
}

class Pen{
    String color;
    int thickness;

    void setColor(String newColor){
        color = newColor;
    }

    void setthick(int newThick){
        thickness = newThick;
    }
}


class Student{
    String name ;
    int age;
    float percentage;

    void calcPer(int maths , int phy , int chem){
        percentage = (maths + phy + chem)/3;
    }
}