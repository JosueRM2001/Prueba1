
package metodos;
import java.util.Scanner;
public class Metodos {

    public static void main(String[] args) {
      Scanner dato = new Scanner (System.in);
      double a, b, c, solucion, solucion2, mul, raiz, solucion3;
      
      System.out.println("Raizes Reales y Complejas");
      System.out.print("Ingrese el valor de a: ");
      a = dato.nextDouble();
      System.out.print("Ingrese el valor de b: ");
      b = dato.nextDouble();
      System.out.print("Ingrese el valor de c: ");
      c = dato.nextDouble();
      mul= b*b-4*a*c;
      raiz = Math.sqrt(mul);
      if(mul >= 0){
      solucion = (-b + raiz)/2*a;
      solucion2 = (-b - raiz)/2*a;
      System.out.println("La Raiz es Real");
       System.out.println("El valor de X1: "+ solucion);
       System.out.println("El valor de X2: "+ solucion2);  
      }else{
      System.out.println("La Raiz es Compleja");
      solucion = (-b + ((raiz)*-1))/2*a;
      solucion2 = (-b - ((raiz)*-1))/2*a;
      System.out.println("El valor de X1: "+ solucion);
       System.out.println("El valor de X2: "+ solucion2);  
      }
    }
    
}
