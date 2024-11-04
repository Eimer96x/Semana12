package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro l1 = new Libro("Muerte de un ruiseñor", "Nelle Harper", 1960, "55555", 281);
        Revista R1 = new Revista("The New York Time", "Henry Jarvis Raymond", 1851, 5, "Septiembre");
        Audiovisual Au1 = new Audiovisual("La sonrisa del futbol", "Andrew Douglas", 2005, "Blue-Ray", 120);


        biblioteca.agregarMaterial(l1);
        biblioteca.agregarMaterial(R1);
        biblioteca.agregarMaterial(Au1);
        System.out.println("********************************************");
        System.out.println("Catálogo de Biblioteca:");
        biblioteca.mostrarCatalogo();


        Material buscado = biblioteca.buscarMaterial("La sonrisa del futbol");
        if (buscado != null) {
            System.out.println("EL material ha sido encontrado:");
            buscado.mostrarInformacion();
        } else {
            System.out.println("El material no ha sido encontrado.");
        }


        l1.prestar();
        l1.devolver();
        l1.mostrarDetallesLibro();

    }
}