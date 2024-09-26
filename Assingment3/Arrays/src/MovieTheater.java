import java.util.ArrayList;

public class MovieTheater {
    static ArrayList<ArrayList<String>> seats;

    public MovieTheater(int x,int y){
        seats = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < y; j++) {
                row.add("Open");
            }
            seats.add(row);
        }
    }

    public static void getSeats(){
        try {
            for (ArrayList<String> row:seats) {
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("array not there");;
        }
    }


    public static void reserveSeats(int x, int y){
        if (seats.get(x).get(y) == "Open"){
            seats.get(x).set(y, "Resv");
            System.out.println("seat is reserved");
        }else {
            System.out.println("seat is already reserved");
        }
    }

    public static void cancelReserveSeats(int x, int y){
        if (seats.get(x).get(y) == "Resv"){
            seats.get(x).set(y, "Open");
            System.out.println("reservation canceled");
        }else {
            System.out.println("seat is not reserved");
        }
    }



    public static void main(String[] args) {
        MovieTheater movieTheater = new MovieTheater(4,4);

        getSeats();
        reserveSeats(0,0);
        reserveSeats(1,2);
        reserveSeats(3,3);
        reserveSeats(2,3);
        reserveSeats(0,3);
        getSeats();
        cancelReserveSeats(0,0);
        getSeats();



    }
}