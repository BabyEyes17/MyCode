
// create two classes: Bird and Fish, which both extend the Animal class. 
// Add a method unique to each subclass (fly() for Bird and swim() for Fish).
//Instantiate Bird and Fish class inside Step_2 class and call the method from super/sub class

class Bird extends Animal {

    Bird() {}
    Bird(int age, String name) {
        super(age, name);
    }
    public void fly() {
        System.out.println("The bird flies.");
    }
}

class Fish extends Animal{

    public void swim() {
        System.out.println("The fish swims.");
    }
}

class BlueJay extends Bird {

    BlueJay(int age, String name) {
        super(age, name);
    }

    public void blueJayStuff() {
        System.out.println("This blue jay is doin stuff idk.");
    }

    @Override
    public String toString() {
        String s = "\nName: " + name;
        s += "\nAge: " + age;
        return s;
    }
}
public class Step_2 {

    public static void main(String[] args) {

        Bird myBird = new Bird();
        myBird.eat();
        myBird.fly();

        Fish myFish = new Fish();
        myFish.eat();
        myFish.swim();

        BlueJay lilBlue = new BlueJay(1, "Lil Blue");
        lilBlue.eat();
        lilBlue.fly();
        lilBlue.blueJayStuff();
        System.out.println(lilBlue.toString());
    }
}
