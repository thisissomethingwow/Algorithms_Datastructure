import java.util.Objects;

public class AnimalShelter {
    private  Animal[] arr;
    private int backOfQueue;
    private  int nAnimal;
    int startOfQueue;

    public AnimalShelter(int size){
        this.arr = new Animal[size];
        this.backOfQueue = -1;
        this.startOfQueue = -1;
        this.nAnimal = 0;
        System.out.println("animal shelter is made");
    }

    public boolean isFull(){
        if (backOfQueue == arr.length-1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        return (nAnimal ==0);
    }


    public void enQueue(Animal animal){
        if (isFull()){
            System.out.println("no more room in shelter");
        } else if (isEmpty()) {
            startOfQueue = 0;
            backOfQueue++;
            nAnimal++;
            arr[backOfQueue] = animal;
            System.out.println(animal.getName()+" has been added to shelter");
        }else {
            backOfQueue++;
            nAnimal++;
            arr[backOfQueue] = animal;
            System.out.println(animal.getName()+" has been added to shelter");
        }
    }

    public int deQueueCat(Animal animal){
        if (isEmpty()){
            System.out.println("there is nothing in the shelter");
            return -1;
        }else {
            int index = startOfQueue;
            String cat = "cat";
            int result = 0;
            if (Objects.equals(arr[index].getType(), cat)) {
                result = arr[index].getArrival();
                startOfQueue++;
                System.out.println(animal.getName()+" has been adopted");
            } else {
                index++;
            }
            if (startOfQueue > backOfQueue) {
                startOfQueue = backOfQueue = -1;
            }
            nAnimal--;
            return result;
        }
    }

    public int deQueueDog(Animal animal){
        if (isEmpty()){
            System.out.println("there is nothing in the shelter");
            return -1;
        }else {
            int index = startOfQueue;
            String dog = "dog";
            int result = 0;
            if (Objects.equals(arr[index].getType(), dog)) {
                result = arr[index].getArrival();
                startOfQueue++;
                System.out.println(animal.getName()+" has been adopted");
            } else {
                index++;
            }
            if (startOfQueue > backOfQueue) {
                startOfQueue = backOfQueue = -1;
            }
            nAnimal--;
            return result;
        }
    }

    public int deQueueAny(){
        if (isEmpty()){
            System.out.println("there is nothing in the shelter");
            return -1;
        }  else {
            String animalName = arr[startOfQueue].getName();
            int result = arr[startOfQueue].getArrival();
            startOfQueue++;
            System.out.println(animalName+" has been adopted");
            if (startOfQueue > backOfQueue) {
                startOfQueue = backOfQueue = -1;
            }
            nAnimal--;
            return result;
        }
    }



}
