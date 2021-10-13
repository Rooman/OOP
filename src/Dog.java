public class Dog extends Animal {
    int killedEnemies;

    public Dog() {
    }

    public Dog(int id, String name, int age, double weight, int killedEnemies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.killedEnemies = killedEnemies;
    }

    void play() {
        System.out.println(name + " is playing");
    }

    void eat() {
        System.out.println(name + " is eating");
        killedEnemies++;
        weight += 0.7;
    }

    void hunt() {
        killedEnemies++;
    }

    @Override
    public String toString() {
        return "Privet alena!";
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
    }
    //    public static void main(String[] args) {
//        Dog dog = null;
//        dog.toS
//    }
}
