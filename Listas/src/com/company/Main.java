package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);/*
        System.out.println("Esta: vacia "+lista.estaVacio());
        lista.addPrimero("Jorge");
        lista.addPrimero(20);
        lista.addPrimero("Hola que tal");
        lista.addPrimero(3);
        System.out.println("primer elemento: "+lista.obtener(0));
        System.out.println("último elemento: "+lista.obtener(lista.getSize()-1));
        System.out.println("index 2: "+lista.obtener(2));
        System.out.println("Está vacia: "+lista.estaVacio());
        System.out.println("Tamaño: "+lista.getSize());*/
        lista.MostrarMenu();
    }
}
