public class AnimalService {
    Animal[] animals;

    public AnimalService(Animal[] animals) {
        this.animals = animals;
    }

    void sleep() {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

    void dogsGoHunt() {
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.hunt();
                System.out.println(dog.name + " with kills  " + dog.killedEnemies);
            }
        }
    }

    void feedAnimals() {
        System.out.println("Start animal feeding!!!");
        for (Animal animal : animals) {
            animal.eat();
        }
        System.out.println("Finish animal feeding!!!");
    }
//
//    Cat findById(int id) {
//        for (int i = 0; i < cats.length; i++) {
//            Cat currentCat = cats[i];
//            if (currentCat.id == id) {
//                return currentCat;
//            }
//        }
//
//        return null;
//    }
//
//    // remove by id
//    // random generating
//
//
//    Cat removeById(int id) {
//        int indexToRemove = -1;
//        for (int i = 0; i < cats.length; i++) {
//            Cat cat = cats[i];
//            if (cat.id == id) {
//                indexToRemove = i;
//                break;
//            }
//        }
//
//        if (indexToRemove == -1) {
//            return null;
//        }
//        // [cat1, cat2,cat3, cat4,cat5] remove (id= 3)
//        // [cat1   ,cat2 ,cat4  ,cat5  ]
//        Cat[] newCatsArray = new Cat[cats.length - 1];
//
//        int newArrayCounter = 0;
//        for (int i = 0; i < cats.length; i++) { // i = 2, indexToRemove = 2
//            // newArrayCounter = 1;
//            if (i != indexToRemove) {
//                newCatsArray[newArrayCounter] = cats[i];
//                newArrayCounter++;
//            }
//        }
//        Cat removedCat = cats[indexToRemove];
//        cats = newCatsArray;
//        return removedCat;
//    }
}
