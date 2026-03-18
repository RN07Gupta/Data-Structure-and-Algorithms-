class MultiLevel{
    public static void main(String args[]){
        // Fish f1 = new Fish();

        Mammels m1 = new Mammels();
        Dogs d1 = new Dogs();
        d1.legs = 4;
        d1.eat();
        d1.breathe();
        System.out.println(d1.legs);
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eating...");
    }

    void breathe(){
        System.out.println("Breathing...");
    }
}

// derived class
class Mammels extends Animal{
    int legs;
}

class Dogs extends Mammels{
    String breed;
}