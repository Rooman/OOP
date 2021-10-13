// Animal
// inheritance -> is-a


public class Cat extends Animal {

    boolean hungry;

    Cat() {
        System.out.println("WARNING! Cat creation in progress!");
    }

    Cat(int id, String name, int age,
        double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void play() {
        System.out.println(name + " is playing");
        hungry = true;
        weight -= 1.2;
        age -= 1;
    }

//    void eat() {
//        System.out.println(name + " is eating");
//        hungry = false;
//        weight += 0.7;
//    }

    public String toString() {
        String info = "This is the cat! " +
                "id = " + id +
                ", age = " + age +
                ", name = " + name +
                ", weight = " + weight +
                ", isHungry = " + hungry;
        return info;
    }
}
