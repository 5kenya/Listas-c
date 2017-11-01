package com.company;
import java.util.Scanner;

/**
 * Created by mr boots on 23/10/2017.
 */
public class Lista {
    Nodo cabeza;
    int size;
    Scanner sc = new Scanner(System.in);

    public void setSize(int size) {
        this.size = size;
    }

    public Lista(){
        cabeza = null;
    }

    public boolean estaVacio(){
        return (cabeza==null)? true:false;
    }
    public int getSize(){
        return size;
    }
    public Object obtener(int index){
        int contador =0;
        Nodo temporal = cabeza;
        while (contador < index){
            temporal = temporal.obtenerSig();
            contador++;
        }
        return temporal.obtenerValor();
    }
    public void addPrimero(Object obj){
        if (cabeza==null) {
            cabeza = new Nodo(obj);
        }else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSig(temp);
            cabeza = nuevo;
        }
        size++;
    }
    public void Mostrar(){
        Nodo temp = cabeza;
        if (temp!=null){
            System.out.println("Estos son los datos: ");
            while(temp!=null){
                System.out.println(temp.valor.toString()+" ");
                temp = temp.obtenerSig();
            }
        }
    }
    public void MostrarMenu(){
        int decision;
        String valor;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1)Insertar\n2)Mostrar\n3)Buscar\n4)Eliminar\n5)Contar\n6)Terminar");
            decision = sc.nextInt();
            switch (decision) {
                case 1: {
                    System.out.println("Inserta un valor:");
                    valor = sc.next();
                    addPrimero(valor);
                    decision = 2;
                    break;
                }
                case 2: {
                    System.out.println("----------------------------");
                    if (estaVacio() == true)
                        System.out.println("La lista está vacía");
                    else
                        Mostrar();
                    System.out.println("----------------------------");
                    break;
                }
                case 3: {
                    System.out.println("Ingresa lo que quieres buscar:");
                    valor = sc.next();
                    System.out.println("El valor que buscas está en la pocición "+buscar(valor));
                    break;
                }
                case 5: {
                    System.out.println("Contar los nodos: "+Cuantos());
                    break;
                }
                case 6:{
                    System.exit(0);
                }
                default: {
                    System.out.println("Vuelve a elegir la opción");
                    break;
                }
            }
        } while (decision!=6);
    }
    public int Cuantos(){
        Nodo aux = null;
        aux = cabeza;
        int i= 0;
        while (aux!=null) {
            aux = aux.obtenerSig();
            i++;
        }
        return i;
    }


    public String buscar (Object valor){
        Nodo aux = cabeza;
        int i=0;
        String texto=null;
        if (aux.obtenerValor().equals(valor)){
            cabeza=cabeza.obtenerSig();
            texto ="encontrado en posición "+i;
        }else{
            boolean a=false;
            i=0;
            Nodo temp = cabeza;
            while (a==false){
                if (temp.obtenerValor().equals(valor)){
                    texto ="encontrado en posición "+i;
                    cabeza=cabeza.obtenerSig();
                    i=-1;
                    a=true;
                }
                i++;
            }
        }
        return texto;
    }
}
