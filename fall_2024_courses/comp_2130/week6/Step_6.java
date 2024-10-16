class Person {
    String name;
    int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name; // Initialize name
        this.age = age;   // Initialize age
        System.out.println("Person constructor called: " + name + ", Age: " + age);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

class Student extends Person {
    String major;

    // Constructor for Student class
    public Student(String name, int age, String major) {
        super(name, age); // Call the superclass constructor to initialize name and age
        this.major = major; // Initialize the major for the student
        System.out.println("Student constructor called: " + name + ", Major: " + major);
    }

    // Add this part to the introduction of a person who is a student
    // I am studying <major> 
    
    //your code here


    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study " + major);
    }
}

//creat a subclass for Teacher with `String subject` attribute
//your code here

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
}

public class Step_6 {
    public static void main(String[] args) {
        //create student name: "Alice", age: 20, major: "Computer Science" and call introduce;
        Student s1 = new Student("Alice", 20, "Computer Science");
        Teacher t1 = new Teacher("Finley", 35, "Computer Logic");
        s1.introduce();
        t1.introduce();


    }
}
