import java.util.Scanner;
/**
 * Created by mr boots on 23/10/2017.
 */
public class Main {
    public static void main(String []args){
        /*Scanner sc = new Scanner(System.in);
        int desicion;

        System.out.println("Elige una opción:");
        System.out.println("1)Insertar\n2)Mostrar\n3)Buscar\n4)Eliminar\n5)Contar\n6)Terminar:");
        desicion=sc.nextInt();*/

        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Hola");

        primer.enlazarSig(segundo);
        primer.obtenerSig().enlazarSig(tercer);

        System.out.println(primer.obtenerSig().obtenerSig().obtenerValor().toString());
    }
}
