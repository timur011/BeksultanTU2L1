public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {
        if(age < 7){
            System.out.println("Hello my name is " + name + "and I am a younger cat");
        }
        else {
            System.out.println("Hello my name is " + name + "and i am an older cat");
        }

    }

    public void heavyOrNot(){
        if(weight > 10){
            System.out.println(name + " is a heavy cat!");
        }
        else{
            System.out.println(name + " is a light cat!");
        }

    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
