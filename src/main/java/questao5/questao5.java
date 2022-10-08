/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao5;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class questao5 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int[] uniqueWritingNumbers = new int[5];
        boolean[] writingNumbers = new boolean[5];
        int currentNumberIndex = 0;
        while(true) {
            System.out.println("Insira um valor para o " + (currentNumberIndex + 1) + "º número: ");
            var numberInsert = input.nextInt();
            if (writingNumbers[currentNumberIndex] != true) {
                uniqueWritingNumbers[currentNumberIndex] = numberInsert;
                writingNumbers[currentNumberIndex] = true;
            }
            System.out.println("O valor atual do " + (currentNumberIndex + 1) + "º número é " + uniqueWritingNumbers[currentNumberIndex] + ".");
            if (currentNumberIndex < 4)
                currentNumberIndex++;
            else
                currentNumberIndex = 0;
        }
    }
}
