package lec3_variable;

import java.util.Scanner;

public class exercise4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Dou1: ");
            double so1 = scanner.nextDouble();

            System.out.print("Enter Dou2: ");
            double so2 = scanner.nextDouble();

            double trungBinh = (so1 + so2) / 2;
            System.out.println("Average: " + trungBinh);
            scanner.close();
    }
}
