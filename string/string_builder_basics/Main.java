/*Estás creando una visualización de productos para una página web. Cada producto tiene un nombre y un precio, y se almacenan en un arreglo bidimensional. Debes formatear toda la lista en una cadena estructurada de manera clara utilizando un StringBuilder.

Crear un método llamado buildProductList(String[][] products) que devuelva una String formateada.
Inicializar un StringBuilder y añadir el encabezado: "Product List:\n"
Recorrer el arreglo products utilizando un ciclo for-each.
Para cada producto:
Extraer el nombre (product[0])
Extraer el precio (product[1])
Añadir una línea al StringBuilder con el formato: ProductName - $Price\n
Devolver la String completa del StringBuilder.
    */

package com.example;

public class Main {
    public static String buildProductList(String[][] products) {
        StringBuilder productList = new StringBuilder();
        productList.append("Product List:\n");

        for (String[] product: products) {
            String name = product[0];
            String price = product[1];
            productList.append(name)
                        .append(" - $")
                        .append(price)
                        .append("\n");
        }

        return productList.toString();
    }

    public static void main(String[] args) {
        String[][] products = {
                {"Laptop", "999.99"},
                {"Phone", "499.49"},
                {"Tablet", "299.99"}
        };

        String result = buildProductList(products);
        System.out.println(result);
    }
}