// //Override - polymorphism - super keyword

// I defined the super class Animal and supclass Dog in Step_1
class Cat extends Animal {
    
    String foodPreference; 
    Cat() {}

    //exercise you can use super here show how? remove duplication 
    Cat(int age, String name, String foodPreference) {
        this.age = age;
        this.name = name;
        this.foodPreference = foodPreference;
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("The cat eats cat food.");
    }

    public void sound(){
        System.out.println("The cat meows");
    }
}


public class Step_3 {
    public static void main(String[] args) {
        // Showing the polymorphism
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        
        System.out.println("===========================");
        myAnimal.eat(); // Output: The animal eats food.
        
        System.out.println("===========================");
        myCat.eat();    // Output: The cat eats cat food (overridden).
        
        System.out.println("============================");
        myDog.eat();

        // To call the additional methods, we need to cast the object back to its original type
        System.out.println("===============================");
        ((Cat) myCat).sound();
    }
}

