class MethodOverriding{
    public static void main(String[] args){
        Animal a = new Animal();
        Dear d = new Dear();
        a.eat();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat Everything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("Eating.... Dear");
    }
}