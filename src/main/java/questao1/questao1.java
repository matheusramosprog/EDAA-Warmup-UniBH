/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author matheus
 */
public class questao1 {
    public static void main(String[] args) {
        var tabuada = new int[10][10];
        fazerTabuada(tabuada);
        mostrarTabuada(tabuada);
    }
    private static void fazerTabuada(int[][] tabuada) {
        for(int pX=0; pX < 10; pX++) {
            int vX = pX + 1;
            
            for(int pY=0; pY < 10; pY++) {
                int vY = pY + 1;
                
                tabuada[pX][pY] = vX + vY;
            }
        }
    }
    private static void mostrarTabuada(int[][] tabuada) {
        for(int pY=0; pY < 10; pY++) {
            System.out.print("|");
            for(int pX=0; pX < 10; pX++) {
                int valElement = tabuada[pX][pY];
                
                if (valElement < 10)
                    System.out.print("0" + tabuada[pX][pY]);
                else
                    System.out.print(tabuada[pX][pY]);
                
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
