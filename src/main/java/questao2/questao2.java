/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;
import java.util.Random;

/**
 *
 * @author matheus
 */
public class questao2 {
    public static void main(String[] args) {
        var nRandom = gNumber();
        System.out.println();
        System.out.println();
        avNumbers(nRandom);
    }
    private static int[] gNumber() {
        final int nMax = 1000;
        var randomGenerate = new Random();
        var nRandom = new int[10];
        System.out.println("Todos os números");
        System.out.print("|");
        for(int i=0; i<10; i++) {
            var newNumber = randomGenerate.nextInt(nMax);  
            nRandom[i] = newNumber;               
            System.out.print(newNumber);
            System.out.print("|");
        }
        return nRandom;
    }
    private static boolean numeroPrimo(int num) {
        if (num <= 1)
            return false;
        for(int d=2; d<num; d++) {
            if (num % d == 0) {
                return false;
            }
        }
        return true;
    }
    private static void avNumbers(int[] nums) {
        System.out.println("Avaliação de Números");
        for(int i=0; i<10; i++) {
            var num = nums[i];  
            if (numeroPrimo(num))
                System.out.println("O número " + num + " na posição " + i + " é primo.");
            else
                System.out.println("O número " + num + " na posição " + i + " NÃO é primo.");
        }
    }
}
