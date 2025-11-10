package com.example;
/*
Está desarrollando un sistema que procesa correos electrónicos de empleados.
Algunas entradas de correo pueden estar ausentes (null).
La tarea consiste en validar y procesar solo los correos no nulos y correctamente formateados.

Se proporciona un arreglo de correos electrónicos de empleados.
Recorrer cada email en el arreglo.
Para cada entrada:
Verificar que el email no sea null
Y comprobar que contenga el símbolo @
Si ambas condiciones se cumplen, imprimir el correo electrónico en la consola.
De lo contrario, imprimir:
"Invalid or missing email"
toggleAyuda
toggleSolución
    */
public class Main {
    public static void validateEmails(String[] emails) {
        for (String element:emails ) {
            if (element!=null && element.contains("@")) {
                System.out.println(element);
            } else {
                System.out.println("Invalid or missing email");
            }
        }
    }

    public static void main(String[] args) {
        String[] employeeEmails = {"alice@company.com", null, "bob@company.com", null, "charlie@company.com"};

        validateEmails(employeeEmails);
    }
}