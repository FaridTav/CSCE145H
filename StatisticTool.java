// Copyright 2024 Farid Tavakoli
//

import java.util.Scanner;
import java.util.Arrays;

public class StatisticTool {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        
        int capacity = 2; 
        int count = 0;
        double[] data = new double[capacity]; 

        int input;

       
        do {
            
            System.out.println("Statistic Tool");
            System.out.println("1. Add Data");
            System.out.println("2. Calculate Max");
            System.out.println("3. Calculate Min");
            System.out.println("4. Print Data");
            System.out.println("5. Quit");
            System.out.print("$> ");
            input = stdin.nextInt();

            switch (input) {
                case 1:
                	System.out.print("Enter Datum: ");
                    double value = stdin.nextDouble();

                    if (count >= capacity) {
                        capacity *= 2;
                        data = Arrays.copyOf(data, capacity);
                    }

                    data[count] = value; 
                    count++; 
                    	break;

                case 2:
                    if (count > 0) {
                        double max = data[0];
                        for (int i = 1; i < count; i++) {
                            if (data[i] > max) {
                                max = data[i];
                            }
                        }
                        System.out.println("Max datum: " + max);
                    } 
                    	break;

                case 3:
                    if (count > 0) {
                        double min = data[0];
                        for (int i = 1; i < count; i++) {
                            if (data[i] < min) {
                                min = data[i];
                            }
                        }
                        System.out.println("Min datum: " + min);
                    } 
                    
                    	break;

                case 4:
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            System.out.print(data[i] + " ");
                        }
                        System.out.println();
                    }
                    	break;
            }

        } while (0 < input && input < 5);
        	System.out.println("Goodbye!");
        	stdin.close();
    }
}
