package ejercicio_enunciado1;
import java.util.*;

public class Ejercicio_enunciado1 {

    public static double dinero_recibido (int ht, double Sh){
        double St= 0;
        if (ht<=40){
            St=ht*Sh;
        }else if (ht > 40 && ht <= 48){
            St=(40*Sh)+((ht-40)*(2*Sh));
        } else {
            St=(40*Sh)+(8*(2*Sh))+((ht-48)*(3*Sh));
        }
        return St;
    }
    public static void main(String[] args) {
       Scanner flujoEnt = new Scanner(System.in);
       String nombre = null;
       int ht = 0; /*horas trabajados*/
       double Sh = 0; /*valor del salario x hora*/
       System.out.println("Nombre: ");
       nombre= flujoEnt.next();
       System.out.println("horas trabajadas: ");
       ht = flujoEnt.nextInt();
       System.out.println("Salario recibido por hora: ");
       Sh = flujoEnt.nextDouble();
       System.out.println("El salario semanal recibido de " + nombre + " es: \n" + dinero_recibido(ht,Sh) + "  pesos");
   
    }
    
}
