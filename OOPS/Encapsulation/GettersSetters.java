class GettersSetters{
    public static void main(String[] args){
        Pen p1 = new Pen();  // object Pen
        p1.setColor("red");
        System.out.println(p1.getColor());

        p1.setthick(3);
        System.out.println(p1.getthick());

        // p1.color = "yellow";
        // System.out.println(p1.color);


    }
}

class Pen{
    private String color;
    private int thickness;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setthick(int newThick){
        this.thickness = newThick;
    }

    int getthick(){
        return this.thickness;
    }
}