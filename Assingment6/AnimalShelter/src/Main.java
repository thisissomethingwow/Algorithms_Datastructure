
public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter(5);
        Animal cat1 = new Animal("cat1","cat",1);
        Animal dog1 = new Animal("dog1","dog",2);
        Animal cat2 = new Animal("cat2","cat",3);
        animalShelter.enQueue(cat1);
        animalShelter.enQueue(dog1);
        animalShelter.enQueue(cat2);
        animalShelter.deQueueAny();
        animalShelter.deQueueAny();
        animalShelter.deQueueAny();



    }

    // An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
}
