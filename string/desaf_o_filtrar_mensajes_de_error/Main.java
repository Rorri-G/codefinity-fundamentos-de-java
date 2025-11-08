/*Imagina que tienes una lista de mensajes del sistema y necesitas extraer solo aquellos que contienen la palabra "failure".

Escribe un programa que cree un nuevo arreglo solo con estos mensajes y luego los muestre en la consola.

En el método extractFailureLogs(), recorre el arreglo logs y verifica cada mensaje para detectar la presencia de la palabra clave "failure" (sin distinguir mayúsculas, usando el método toLowerCase()).
Cuenta cuántos mensajes contienen la palabra "failure" y almacena el resultado en una variable count.
Recorre nuevamente el arreglo logs y agrega solo los mensajes que contienen "failure" al arreglo errorLogs.
*/
package com.example;

public class Main {
    public static String[] extractFailureLogs(String[] logs) {
        int count = 0;
        for (String log :logs) {
            if (log.toLowerCase().contains("failure")) {
                count++;
            }
        }

        String[] errorLogs = new String[count];
        int index = 0;
        for (String log: logs) {
            if (log.toLowerCase().contains("failure")) {
                errorLogs[index++] = log;
            }
        }

        return errorLogs;
    }

    public static void main(String[] args) {
        String[] logs = {
                "System started successfully",
                "Failure: Disk space is low",
                "User logged in",
                "Warning: High CPU usage",
                "Failure: Unable to connect to server",
                "Backup completed"
        };

        String[] filtered = extractFailureLogs(logs);

        System.out.println("Messages containing the keyword 'failure':");
        for (String log : filtered) {
            System.out.println(log);
        }
    }
}
