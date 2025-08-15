package lec3_variable;
//Chương trình nhập giá trị boolean và in ra giá trị đã nhập.

import java.util.Scanner;

public class exercise5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.print("True/False: ");
        boolean giaTri = scanner.nextBoolean();

        System.out.println("User Entered: " + giaTri);
        scanner.close();
    }
}
