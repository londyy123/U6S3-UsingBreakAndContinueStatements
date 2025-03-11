package partA.ex01;

import java.util.Scanner;

public class ComputeSum {

    public static String computeSum() {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.println("enter 0 to exit");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
            count++;
            System.out.println("sum: " + sum);

        }
        scanner.close();


        /**
         * Your code goes here
         */



        return response;
    }

    public static void main(String[] args) {
        String sum = computeSum();
        System.out.print(sum);
    }




    }

