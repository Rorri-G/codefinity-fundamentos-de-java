/*
Imagina que trabajas en un almacén y te entregan un arreglo que contiene los pesos de los paquetes.
Tu tarea es escribir un programa que verifique si hay paquetes con pesos negativos.

Utiliza un bucle for-each para recorrer todos los pesos de los paquetes.
Dentro del bucle, verifica si el peso actual es negativo (< 0).
Si se encuentra un peso negativo, sal del bucle y devuelve false.
Si todos los valores son no negativos, devuelve true.

*/

package com.example;

public class Main {
    public static boolean allWeightsPositive(int[] packageWeights) {
        for (int element : packageWeights) {
            if (element  < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] packageWeights = {15, 22, 18, -4, 30, 25};

        if (allWeightsPositive(packageWeights)) {
            System.out.println("All packages have positive weights");
        } else {
            System.out.println("There are packages with negative weights");
        }
    }
}