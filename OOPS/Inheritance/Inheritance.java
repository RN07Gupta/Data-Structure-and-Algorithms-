class Inheritance{
    public static void main(String args[]){
        Fish f1 = new Fish();
        f1.swimsInWater();
        f1.eat();
        f1.breathe();
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