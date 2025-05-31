public class Dog {
    private String name;
    private String breed;

    // constructor
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    // getter
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    // method
    public void printValues(){
        System.out.println("Dog Name: " + getName());
        System.out.println("Dog Breed: " + getBreed());
    }
}

class Dogimp{
    public static void main(String[] args) {
        Dog dog1 = new Dog("German", "Golden Retriever");
        Dog dog2 = new Dog("Sheperd", "Husky");

        dog1.printValues();
        System.out.println("Updated dog1 info");
        dog1.setName("Tommy");
        dog1.setBreed("Pitbull");

        dog1.printValues();

        dog2.printValues();
        System.out.println("Updated dog2 info");
        dog2.setName("Bella");
        dog2.setBreed("Pug");

        dog2.printValues();
    }
}