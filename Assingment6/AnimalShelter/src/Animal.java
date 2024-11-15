public class Animal {
    String name;
    String type;
    int arrival;
    public Animal(String name, String type, int arrival) {
        this.name = name;
        this.type = type;
        this.arrival = arrival;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getArrival() {
        return arrival;
    }
    public void setArrival(int arrival) {
        this.arrival = arrival;
    }
}
