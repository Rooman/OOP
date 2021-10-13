import java.util.Random;

public class AnimalFactory {
    Cat[] getDefaultCats() {
        Cat sharikCat = new Cat();
        sharikCat.id = 1;
        sharikCat.name = "Sharik";
        sharikCat.age = 13;
        sharikCat.weight = 7.5;

        Cat kotCat = new Cat(2, "Kot",
                3, 9.5);


        Cat[] cats = {kotCat, sharikCat};
        return cats;
    }

    Cat[] getRandomCats(int size) {
        String[] catNames = {"Kot", "Emka", "Tom", "MV"};
        Random random = new Random();
        Cat[] randomCats = new Cat[size];

        for (int i = 0; i < size; i++) {
            Cat cat = new Cat();
            cat.id = i + 1;
            cat.age = random.nextInt(9) + 1;
            cat.weight = random.nextDouble() * 10 + 3;
            cat.name = catNames[random.nextInt(catNames.length)];
            // catNames.length = 4; random.nextInt(4) -> [0, 3]

            randomCats[i] = cat;
        }

        return randomCats;
    }

    Dog[] getRandomDogs(int size) {
        String[] catNames = {"Kot", "Emka", "Tom", "MV"};
        Random random = new Random();
        Dog[] randomDogs = new Dog[size];

        for (int i = 0; i < size; i++) {
            Dog dog = new Dog();
            dog.id = i + 1;
            dog.age = random.nextInt(9) + 1;
            dog.weight = random.nextDouble() * 10 + 3;
            dog.name = catNames[random.nextInt(catNames.length)];
            dog.killedEnemies = random.nextInt(10_000);

            randomDogs[i] = dog;
        }

        return randomDogs;
    }

    Animal[] getRandomAnimals(int size) {
        Random random = new Random();
        int catsCount = random.nextInt(size); // [0.. 10]
        int dogsCount = size - catsCount; // 10 - [0..10]
        Cat[] cats = getRandomCats(catsCount);
        Dog[] randomDogs = getRandomDogs(dogsCount);

        Animal[] animals = new Animal[size];
        int index = 0;
        for (Cat cat : cats) {
            animals[index] = cat;
            index++;
        }

        for (Dog randomDog : randomDogs) {
            animals[index] = randomDog;
            index++;
        }

        return animals;
    }
}
