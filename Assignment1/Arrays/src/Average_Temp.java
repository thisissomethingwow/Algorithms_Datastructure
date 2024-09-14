import java.util.ArrayList;
import java.util.Scanner;

public class Average_Temp {
    /**
     * calc the avg temp and give how many days are above the avg
     * 1. take an input from the user (eg.5) so five diff temps
     * 2. prompt the user to enter all the 5 numbs
     * 3. calc the avg temp
     * 4.given the avg temp how many of the numbers in part 2 are above the avg
     */
    public static void main(String[] args) {
        Scanner arrSizeInput = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = 0;
        if (arrSizeInput.hasNextInt()){
            size = arrSizeInput.nextInt();
        }
        double[] temps = new double[size];
        Scanner inputs = new Scanner(System.in);

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Enter number(s)");
            temps[i] = inputs.nextDouble();
        }
        double avg = avgTemp(temps);
        System.out.println("The average temperature is: "+avg);

        System.out.println("The temperatures that are above the average are: "+aboveAvgTemp(avg,temps));

    }
    public static double avgTemp(double[] temps){
        double avg = 0;
        for (int i = 0; i < temps.length; i++) {
            avg +=temps[i];
        }
        return avg/temps.length;
    }
    public static ArrayList<Double> aboveAvgTemp(double avg, double[] temps){
        ArrayList<Double> above = new ArrayList<>();
        for (int i = 0; i < temps.length; i++) {
            if (temps[i]>avg){
                above.add(temps[i]);
            }
        }
        return above;
    }
}
