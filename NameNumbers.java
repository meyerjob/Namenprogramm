/*
 * @author Job Meyer
 * @date 15.10.2025
 * @version 1.0
 * @description This program prints a greeting and then prints the first 30 odd numbers starting from 1.
 */

public class NameNumbers {
    public static void main(String[] greeting) {
        System.out.println("Guten Tag, Job Meyer!");
        Number(1);


    }

    

    public static void Number(int number) {

        for (int i = 1; i < 31; i++) {
            System.out.println(i + ": " + number);
            number += 2; 
        }
        return;
    }
}
