
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String [] [] array = new String[6] [6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " " + j;
            }
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
