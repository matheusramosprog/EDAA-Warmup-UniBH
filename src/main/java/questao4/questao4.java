/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class questao4 {
     public static void main(String[] args) {
        System.out.println("Roubo Banco HSVC");
        var valueSuspects = getValueSuspects();
        var valueRobberConfessed = getValueRobberConfessed();       
        var robber = evaluateSuspect(valueSuspects, valueRobberConfessed);
        int totalValueStolen = 0;
        for(int i=0; i<robber.length; i++) {
            int robberIndex = robber[i];   
            System.out.println("O suspeito de numero " + (robberIndex + 1) + " é um dos assaltantes");  
            totalValueStolen += valueSuspects[robberIndex];
        }
        System.out.println();
        System.out.print("Ao todo os assaltantes roubaram R$" + totalValueStolen + ",00");
    }  
    private static int[] getValueSuspects() {
        final Scanner input = new Scanner(System.in);
        var val = new int[10];
        int qtdSuspects = 0;
        while(qtdSuspects < 10) {
            int suspectNum = qtdSuspects + 1;
            System.out.print("Insira o valor contido pelo suspeito nº " + suspectNum + ": ");
            int valueContained = input.nextInt();
            if (valueContained < 0) {
                System.out.println();
                System.out.print("Favor inserir um valor válido. Tente novamente");
                continue;
            }
            val[qtdSuspects] = valueContained;
            qtdSuspects++;
            System.out.println("O suspeito de numero " + qtdSuspects + " continha R$" + valueContained + ",00");
        }
        return val;
    } 
    private static int getValueRobberConfessed() {
        System.out.println();
        final Scanner input = new Scanner(System.in);
        int confessedValue = 0;
        while(confessedValue == 0) {
            System.out.print("Insira o valor contido pelo assaltante confessado: ");
            int valorContido = input.nextInt();
            if (valorContido <= 0 || valorContido % 10 != 0) {
                System.out.println();
                System.out.print("Favor inserir um valor válido. Os assaltantes continham apenas notas de 10.");
                continue;
            }
            System.out.println();
            confessedValue = valorContido;
        }
        return confessedValue;
    }    
    private static int[] evaluateSuspect(int[] suspiciousValues, int valueRobberConfessed) {
        var suspectedRobbersIndex = new int[0];
        for(int i=0; i<suspiciousValues.length; i++) {
            var valueC = suspiciousValues[i];
            if (valueC % 10 != 0 || valueC < valueRobberConfessed)
                continue;
            suspectedRobbersIndex = adicionarAssaltante(suspectedRobbersIndex, i);
        }
        return suspectedRobbersIndex;
    }
    private static int[] adicionarAssaltante(int[] robberIndex, int newRobberIndex) {
        int newArraySize = robberIndex.length + 1;
        var updatedRobbersIndex= new int[newArraySize];
        for(int i=0; i<robberIndex.length; i++)
            updatedRobbersIndex[i] = robberIndex[i];
        updatedRobbersIndex[newArraySize - 1] = newRobberIndex;
        return updatedRobbersIndex;
    }
}
