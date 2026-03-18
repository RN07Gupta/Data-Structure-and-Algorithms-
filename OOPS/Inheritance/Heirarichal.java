class Heirarichal{
    public static void main(String args[]){
        Fish f1 = new Fish();
        f1.swimsInWater();
        f1.eat();
        f1.breathe();

        Turtle t1 = new Turtle();
        t1.eat();
        t1.turtle();
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
class Fish extends Animal{
    int fins;

    void swimsInWater(){
        System.out.println("Swimmig..");
    }
}

class Turtle extends Animal{

    void turtle(){
    System.out.println("Turtles");
    }
}