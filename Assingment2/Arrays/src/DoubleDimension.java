import java.util.Arrays;

public class DoubleDimension {
    static int[][] arr = null;

    public DoubleDimension(int x,int y){
        arr=new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int newVal, int x, int y){
        try {
            if (arr[x][y]==Integer.MIN_VALUE){
                arr[x][y] = newVal;
                System.out.println("value added");
            }else {
                System.out.println("index at "+x+" "+y+" is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid indexes");
        }
    }

    public void traverse(){
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j]);
                }
            }
        } catch (Exception e) {
            System.out.println("array not there");;
        }
    }

    public void search(int valToSearch){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (valToSearch == arr[i][j]){
                    System.out.println("Value is at index "+i+","+j);
                    return;
                }
            }
        }
        System.out.println(valToSearch +" not found");
    }

    public void delete(int x,int y){
        arr[x][y] = Integer.MIN_VALUE;
        System.out.println("the value has benn deleted");
    }

    public static void main(String[] args) {
        DoubleDimension doubleDimension = new DoubleDimension(2,2);
        doubleDimension.insert(1,0,0);
        doubleDimension.insert(2,0,1);
        doubleDimension.insert(3,1,0);
        doubleDimension.insert(4,1,1);

        doubleDimension.traverse();


       for(int[] row : arr){
           System.out.println(Arrays.toString(row));
       }

       doubleDimension.search(4);
       doubleDimension.delete(1,1);
       doubleDimension.search(4);

    }



}
