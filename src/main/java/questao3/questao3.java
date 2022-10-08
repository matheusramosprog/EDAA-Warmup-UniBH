/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;
import java.text.DecimalFormat;

/**
 *
 * @author matheus
 */
public class questao3 {
    private static final DecimalFormat decFormat = new DecimalFormat("0.00");
    public static void main(String[] args) {
        var modelCar = searchModel();
        var consCar = searchUsage();
        System.out.println("Modelos de Carro vs. KM por Litro de Gasolina");
        for(int i=0; i<5; i++) {
            var carro = modelCar[i];
            var kmLitro = consCar[i];
            
            System.out.println(carro + " - " + kmLitro + "Km/L");
        }
        System.out.println();
        
        compareConsModelCars(modelCar, consCar);
    }
    private static String[] searchModel() {
        return new String[] {"Palio", "Caravan", "Onix", "Jipe", "Corolla"};
    }
    private static double[] searchUsage() {
        return new double[] {12.7, 14.5, 11.4, 13.6, 13.9};
    }
    private static void compareConsModelCars(String[] cars, double[] cons) {
        double minQuanLGasto = Integer.MAX_VALUE;
        String modelEconomic = null;
        System.out.println("Modelos de carro x Quantidade de litros gastos por 1000km");
        for(int i=0; i<5; i++) {
            var car = cars[i];
            var KML = cons[i];
            double consMKm = 1000 / KML;
            System.out.println(car + " - " + decFormat.format(consMKm) + " litros");
            if (consMKm < minQuanLGasto) {
                minQuanLGasto = consMKm;
                modelEconomic = car;
            }
        }
        System.out.println();
        System.out.println("Modelo mais econômico");
        System.out.println("O modelo de carro mais econômico é o " + modelEconomic );
    }
}
