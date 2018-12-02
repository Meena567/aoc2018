import java.util.*;
import java.lang.*;

public class Day1{
    public static void main(String [] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            int toAdd = Integer.parseInt(sc.nextLine());
            total += toAdd;
        }
        System.out.println("Total is: " + total);
    }
}
