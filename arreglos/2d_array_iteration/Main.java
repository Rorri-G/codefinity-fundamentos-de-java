/*
Calcular el promedio de temperatura para cada día de la semana utilizando datos de varias estaciones.

Se proporcionan los siguientes datos:

Estación 1: {20, 22, 24, 19, 21, 23, 25}
Estación 2: {18, 20, 22, 19, 20, 22, 24}
Estación 3: {21, 23, 25, 22, 24, 26, 28}
Estación 4: {19, 21, 23, 20, 22, 24, 26}
Tarea:
Escribir un método llamado calculateDailyAverages(int[][] temperatures) que devuelva un double[].
En este método:
Recorrer cada día (columnas del arreglo bidimensional).
Para cada día, inicializar totalTemp para almacenar la suma de las temperaturas.
Utilizar un ciclo interno para recorrer todas las estaciones (filas).
Sumar las temperaturas de cada estación para el día actual.


*/
package com.example;

public class Main {
    public static double[] calculateDailyAverages(int[][] temperatures) {
        int days = temperatures[0].length;//numero de columnas
        int stations = temperatures.length;//numero de filas
        double[] dailyAverages = new double[days];

        for (int j=0; j< days; j++) {
            int totalTemp = 0;
            for (int i=0; i< stations; i++) {
                totalTemp += temperatures[i][j];
            }
            dailyAverages[j] = totalTemp/(double) stations;
        }

        return dailyAverages;
    }

    public static void main(String[] args) {
        int[][] temperatures = {
                {20, 22, 24, 19, 21, 23, 25},
                {18, 20, 22, 19, 20, 22, 24},
                {21, 23, 25, 22, 24, 26, 28},
                {19, 21, 23, 20, 22, 24, 26}
        };

        double[] averages = calculateDailyAverages(temperatures);
        for (int day = 0; day < averages.length; day++) {
            System.out.println("Average temperature on day " + (day + 1) + ": " + averages[day]);
        }
    }
}
