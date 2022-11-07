import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        

        for (int i = 1; i < 100; i++) {
            if (i == 1) {
                System.out.println(i + " is a Prime Number.");
            }
            int check = 0;
            for (int j = 2; j <= i; j++) {
                check = i % j;
                if (check == 0 && j != i) {
                    j = i + 1;
                } else if (check == 0 && j == i) {
                    System.out.println(i + " is a Prime Number.");
                }

            }

        }
    }

}
