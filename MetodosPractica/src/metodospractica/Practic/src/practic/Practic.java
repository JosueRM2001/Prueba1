
package practic;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practic {

    public static void main(String[] args) {
         Scanner numero = new Scanner(System.in);
       //System.out.println("Hola Mundo");
       //System.out.println("Murete");
      /* byte entero = 12;
       short ente =1235;
       int ent=35689;
       long en= 134649795;
       float decimal = 34.544f;
       double decima =3.4578978;
       char caracter = 'a';
       boolean decision = true;*/
      //Integer numero = null;
      // String palabra = "Hola que tal";
       //final int numero = 10;// constante
      /*Scanner entrada = new Scanner (System.in);
      String cadena;
      float numero;
      char letra;
       System.out.print("Diguite una cadena:");
       //cadena = entrada.next();
       //cadena = entrada.nextLine();
       letra = entrada.next().charAt(0);
       System.out.println("La cadena es:" + letra);*/
     
     /* double numero1, numero2, suma, resta , multiplicacion, divicion;
      System.out.println("Resultados Matematicos");
      System.out.print("Ingrese el primer Numero:");
      numero1 = numero.nextDouble();
      System.out.print("Ingrese el Segundo Numero:");
      numero2 = numero.nextDouble();
      suma = numero1 + numero2;
      resta = numero1 - numero2;
      multiplicacion = numero1 * numero2;
      divicion = numero1 / numero2;
      System.out.println("La suma es:" + suma);*/
     //y = x--;
     //double raiz = Math.sqrt(74);
     //double base = 5, exponente = 6;
     //double resultado = Math.pow(base, exponente);
     //float dato = 7.89f;
     //int resultado = Math.round(dato);
      /*System.out.println("Numero de Horas");
      int semanas, resultado, resultado2, resultado3;
      System.out.print("Ingrese el numero de horas que trabaja");
      semanas = numero.nextInt();
      resultado = semanas /168;
      resultado2 = semanas%168 /24;
      resultado3 =  semanas%24 ;
       System.out.println("Numero de semanas:" + resultado);
       System.out.println("Numero de dia"+ resultado2);*/
       
      /*if(valor <= dato){//== , !=, ><, >=<=;
        System.out.println("El numero es menor a 5");
      }
      else{
          System.out.println("El numero es mayor a 5");

      }*/     
         /*switch(dato){
             case 1: System.out.println("Es el numero 1");
             break;
             case 2: System.out.println("Es el numero 2");
             break;
             case 3: System.out.println("Es el numero 3");
             break;
             case 4: System.out.println("Es el numero 4");
             break;
             case 5: System.out.println("Es el numero 5");
             break;
             default: System.out.println("Es el numero no esta en el rango");
             break;
         }  */   
      /*System.out.println("Programa Mayor o Menor ");
      int dato, dato1;
      System.out.print("Ingrese el primer numero:");
      dato = numero.nextInt();
      System.out.print("Ingrese el segundo numero:");
      dato1 = numero.nextInt();
      if(dato > dato1){
          System.out.println("El mayor es:"+ dato);
      } else
      if (dato < dato1){
           System.out.println("El mayor es:"+ dato1);
       }else
        if (dato == dato1){ 
             System.out.println("Sin Iguales");

      }*/
      /* System.out.println("Ordenar");
       double valor,valor1, valor2;
       System.out.print("Ingrese el primero numero:");
       valor = numero.nextDouble();
       System.out.print("Ingrese el segundo numero:");
       valor1 = numero.nextDouble();
       System.out.print("Ingrese el tercer numero:");
       valor2 = numero.nextDouble();

       if ((valor > valor1) &&(valor1 > valor2)) {
          System.out.println("Orden: " + valor + " - "+ valor1+" - "+valor2);
          
       }else
       if ((valor > valor2) &&(valor2 > valor1)){
            System.out.println("Orden: " + valor + " - "+ valor2+" - "+valor1);
             }else
       if ((valor1 > valor) &&(valor > valor2)){
            System.out.println("Orden: " + valor1 + " - "+ valor+" - "+valor2);
          }else
       if ((valor1 > valor2) &&(valor2 > valor)){
            System.out.println("Orden: " + valor1 + " - "+ valor2+" - "+valor);
          }else
       if ((valor2 > valor) &&(valor > valor1)){
            System.out.println("Orden: " + valor2 + " - "+ valor+" - "+valor1);
       } else {
           System.out.println("Orden: " + valor2 + " - "+ valor1+" - "+valor);
       }*/
      /*System.out.println("Fechas");
      int dia, fecha, año;
      System.out.println("Ingrese el dia:");
      dia = numero.nextInt();
      System.out.println("Ingrese el mes:");
      fecha = numero.nextInt();
      System.out.println("Ingrese el Año:");
      año = numero.nextInt();
      System.out.println("La fecha que ingreso:"+ dia + "-"+ fecha +"-"+año);
      if((dia >= 1)&&(dia <= 30)){
          if((fecha >= 1)&&(fecha <= 12)){
              if(año != 0){
              System.out.println("Es correcta");
              }else {
                   System.out.println("Fecha incorrecta, año incorrecto");
                   }
          }else {
          System.out.println("Fecha incorrecta, mes incorrecto");
            }
    
       }else {
          System.out.println("Fecha incorrecta, dia incorrecto");
                
      }*/
            
        
            /*switch(simbolos){
                case '+' : 
                    suma = valor + valor1;
                    System.out.println("La Suma es:"+ suma);
                    break;
                    case '-' : resta = valor - valor1;
                    System.out.println("La Resta es:"+ resta);
                    break;
                    case '*' :multi = valor * valor1; 
                    System.out.println("La Multiplicacion es:"+ multi);
                    break;
                    case '/' : divi = valor / valor1;
                    System.out.println("La Divicion es:"+ divi);
                    break;
                    default: System.out.println("No sea seleciona ningun simbolo ");
                   break;
            } */

            
             /* switch(valor){
                  case 1:
                      System.out.println("Ingrese dinero a depositar:");
                      ingre= numero.nextDouble();
                      dato = sueldo + ingre;
                      System.out.println("Su saldo actual es: "+dato);
                      break;
                      case 2:
                      System.out.println("Ingrese dinero a retirar:");
                      resti = numero.nextDouble();
                      if(resti > sueldo){
                      System.out.println("No cuenta con el saldo sufieciente");
                      System.out.println("Para realisar el retiro");
                      }else{
                      dato1 = sueldo - resti;
                      System.out.println("Su saldo actual es: "+dato1);
                      }
                      break;
                      case 3:
                      System.out.println("Grasias por preferirnos");
                      System.out.println("Vuelva pronto");
                      break;
                      default: System.out.println("Erro no a escogido ninguna opcion");
                      break;*/
                    /*System.out.println("Bucle");
                    int i =1, contador;
                    System.out.print("Diguite cuantos numero quiere:");
                    contador = numero.nextInt();
                    while(i <= contador){
                    System.out.println(i);
                    //i++;
                     i+=2;
                    }*/
                    /*int i=1, contador;
                    System.out.println("Ingrse la cantidad que desea ver");
                    contador = numero.nextInt();
                    do{
                        System.out.println(i);
                        i++;
                    }while(i <= contador);*/
                    /*System.out.print("Ingrdse la cantidad que desa ver:");
                    int contador;
                    contador = numero.nextInt();
                    for(int i=2; i<=contador; i+=2){
                        System.out.println(i);
                    }*/
                    /*System.out.println("Exponente");
                    int valor;
                    System.out.println("Ingrese un numero");
                    valor = numero.nextInt();
                    while(valor !=0){
                    if(valor%2==0){
                        System.out.println("Es un numero par");
                        System.out.println("Ingrese otro numero");
                       valor = numero.nextInt();
                    }else
                        if(valor%1==0){
                        System.out.println("Es un numero impar");
                        System.out.println("Ingrese otro numero");
                        valor = numero.nextInt();*/
                        
                        /*int valor, aliatorio, contador =0;
                        aliatorio =(int)(Math.random()*100);
                        do{
                        System.out.println("Ingrese un numero");
                        valor = numero.nextInt();
                        if(aliatorio > valor){
                        System.out.println("Ingrese un numero mayor");    
                        }else{
                        System.out.println("Ingrese un numero menor");
                        }
                        contador++;
                       }while(valor != aliatorio);
                        System.out.println("Genial Adivinaste el numero de intentos fue: "+ contador);
                 */
                /*System.out.println("Pedir Numeros"); 
                int contador=0, valor, suma =0;
                float media;
                System.out.println("Ingrese un numero:");
                valor = numero.nextInt();
                while(valor >= 0){
                 suma = suma + valor;
                contador++;
                System.out.println("Ingrse un numero:");
                valor = numero.nextInt();
                }
                if(contador ==0){
                 System.out.println("Error la divicion entre 0 no existe");   
                }else{
                    media = (float)suma / contador;
                    System.out.println("La media es:"+media);
                }*/
                /*System.out.println("Numeros");
                int valor, contador=0, suma=0, suma1=0,contador1=0, contador2=0;
                double media, media2;
                System.out.println("Ingrese 10 numeros"); 
                for(int i=1; i<=10; i++){
                System.out.print("Ingrse una numero:");
                valor = numero.nextInt();
                if (valor ==0){
                contador2++;
                }else
                    if(valor > 0){
                 suma += valor;
                 contador++;
                 }else {
                 suma1 += valor;
                contador1++;
                    }
                
                  }
                if(contador == 0){
                     System.out.println("Nose puede sacar la media");
                }else{
                 media = suma / contador;
                System.out.println("La media de los positivos "+ media);
                }
                if(contador1==0){
               System.out.println("Nose puede sacar la media");
                }else{
                 media2 = suma1 / contador1;
                System.out.println("La media de los positivos "+ media2);
                }
                 System.out.println("La cantidad de ceros es:"+contador2);
*/
               /* System.out.println("Sueldos");
                int edad, contador=0, contador1=0, suma=0;
                double altura, media, media1,  suma1=0;
                System.out.println("Ingresen la edad y altura de 5 Alumnos");
                for(int i=1;i<=5; i++){
                System.out.print("Alumno" + i +"Ingresen la edad: ");
                edad = numero.nextInt();
                System.out.print("Alumno" + i + "Ingresen la altura: ");
                altura = numero.nextDouble();
                suma+=edad;
                suma1+= altura;
                if(edad > 18){
                    
                    contador++;
                }
                if(altura > 1.75){
                   
                    contador1++;
                }
                }
               media = suma / 5;
               media1 = suma1 / 5;
                System.out.println("La media de la edad es: "+ media);
                System.out.println("La media de la altura es: "+ media1);
                System.out.println("La cantidad de alumnos mayores a 18 años: "+contador);
                System.out.println("La cantidad de alumnos que miden mas de 1.75 : "+contador1);*/
          /* System.out.println("Facturas");
           int codigo, litros, articulos=0,conteo=0;
           double precio, importeF, factura=0;
           System.out.println("Ingrse 5 Facturas");
           for(int i=1;i <= 5; i++){
            System.out.print("Articulo N°"+i+"Diguite el codigo:");  
            codigo=numero.nextInt();
            System.out.print("Articulo N°"+i+"Diguite la cantidad de litros:");  
            litros=numero.nextInt();
            System.out.print("Articulo N°"+i+"Diguite el precio por litro:");  
            precio=numero.nextDouble();
            importeF=litros*precio;
            factura+=importeF;
            if(codigo == 1){
                articulos+= litros;
            }
            if(importeF > 600){
                conteo++;
            }
           }
           System.out.println("Resumen de ventas");
           System.out.println("Facturacon total:"+ factura);
           System.out.println(" Cantidad e litros vendidos:"+ articulos);
           System.out.println("Facturas mayores a 600:"+ conteo);*/
          
           /*System.out.println("Notas");
           int contador=0,conteo=0, conteo1=0;
           double notas;
           System.out.println("Ingrse 5 Facturas");
           for(int i=1;i <=6; i++){
               do{
            System.out.print("El rango es de 0- 10");
            System.out.print("Ingrese la nota del Alumno:");  
            notas=numero.nextDouble();
               }while(notas <0 || notas >10);
  
            if(notas == 4){
                conteo++;
            }
            else 
                if(notas >=5){
                conteo1++;
                
            }else{
                   contador++; 
                }
           }
           System.out.println("Notas");
           System.out.println("Cantidad de alumnos aporbados"+ conteo1);
           System.out.println("Cantidad de alunos condicionados"+ conteo);
           System.out.println("Cantidad e alumnos suspensos"+ contador);*/
          /* System.out.println("Numeros");
           int  numeros;
           boolean negativos = false;
           for(int i=1;i <=5; i++){
            System.out.print("Ingrese las notas:");  
            numeros =numero.nextInt();
            if (numeros <=5){
                negativos = true;
                        }
           }
           if(negativos == true){
               System.out.print("Si existe un alumno suspendido"); 
           }else{
               System.out.print("No existe ningun alumno suspendido"); 
           }*/
          //int[] numeros = {5,7,9,10};
         // int[]numeros = new int [3];
          /*numeros[0]=7;
          numeros[1]=10;
          numeros[2]=13;*/
         // for(int i=0;i<4;i++){
              //System.out.println(numeros[i]);
          /*int elementos;
              System.out.println("Ingrse la cantidad de elemtos en su areglo");
              elementos = numero.nextInt();
              char[] letras = new char[elementos];
              System.out.println("Digite los elementos del areglo: ");
              for(int i=0; i<elementos; i++){
              System.out.println((i+1)+"Digite un caracter");
              letras[i]= numero.next().charAt(0);
              }
              System.out.println("Lo caracteres del areglo son: ");
              for(int i=0; i<elementos; i++){
              System.out.print(letras[i]+" ");
              }*/
          //String[]nombres ={"Josue", "maria", "Ari", "Maria","Juan"};
          /*for (int i=0; i<nombres.length; i++){
              System.out.println(nombres[i]);*/
          //for(String i:nombres){
             // System.out.println("Nombres: "+i);
         /* System.out.println("Areglos");
          float [] datos = new float [5];
          System.out.println("Digite 5 elementos");
          System.out.println("Digite los elementos del areglo");
          for(int i=0; i<5; i++){
              System.out.print((i+1)+ " Ingrse un dato datos: ");
              datos[i] = numero.nextFloat();
          }
          System.out.println("Los datos son los isguentes");
          for(int i=0; i<5;i++)
          System.out.println(datos[i]);*/
         
          /*System.out.println("Areglos");
          int[] datos = new int[5];
          int contador=0, contador1=0,contador2=0, suma=0, suma1=0;
          double media,media1;
          System.out.println("Diguite 5 Numeros");
          for(int i=0; i<5;i++){
           System.out.print((i+1)+". Ingrese un dato: ");
           datos[i] = numero.nextInt();
           if(datos[i]>0){
              suma+= datos[i];
               contador++;
               
           }else
               if(datos[i]<0){
                 suma1+=datos[i];
                 contador1++;
               }else
                   if(datos[i]== 0){
                      contador2++; 
                   }
          }
          if(contador ==0){
              System.out.println("No se puede scar la media");
          }else{
               media=suma/contador;
               System.out.println("La media de los positivos es: "+media);
          }
          if(contador1==0){
                System.out.println("No se puede scar la media de los negativos");
          }else{
              media1=suma1/contador1;
              System.out.println("La media de los Negativos es: "+media1);
          }
       
          System.out.println("La cantidad de ceros es: "+contador2);*/
         /* System.out.println("Areglos");
          int a[], b[],c[];
          a = new int [10];
          b = new int [10];
          c = new int [20];
          System.out.println("Diguite el primer areglo");
          for(int i=0;i<10;i++ ){
              System.out.print((i+1)+". Diguiete un numero: ");
              a[i]= numero.nextInt();
          }
          System.out.println("Diguite el segundo areglo");
           for(int i=0;i<10;i++ ){
              System.out.print((i+1)+". Diguiete un numero: ");
              b[i]= numero.nextInt();
           }
           int j=0;
           for(int i=0; i<10;i++){
               c[j]=a[i];
               j++;
               c[j]=b[i];
               j++;
           }
           System.out.println("El tercer areglo es: ");
           for(int i=0;i<20;i++ ){
              System.out.print(c[i]+" ");
           }
            System.out.println();*/
         /*System.out.println("Areglos");
         int valor[] = new int[10];
         boolean creciente = false, decreciente = false;
         System.out.println("Diguite 10 numeros");
         for(int i=0; i<10;i++){
             System.out.print((i+1)+". Ingrese un numero: ");
             valor[i]=numero.nextInt();
         }
         for(int i=0; i<9;i++){
             if(valor[i]<valor[i+1]){
                creciente = true; 
             }else
                 if(valor[i]>valor[i+1]){
                   decreciente = true;  
                         
             }
         }
         if(creciente == true && decreciente==false){
          System.out.println(" El Areglo esta en forma creciente");   
         }else
             if(creciente == false && decreciente==true){
          System.out.println("El Areglo esta en forma decreciente");
             }else
                 if(creciente == true && decreciente==true){
                     System.out.println("Areglos esta desrodenado");
                 }else
                     if(creciente == false && decreciente==false){
                        System.out.println("Todos los numero del areglo son iguales");  
                     }*/
        /* System.out.println("Areglos");
         int valor[]=new int[10];
         int ultimo;
         System.out.println("Ingrese 10 valores");
         for(int i=0; i <10; i++){
             System.out.print((i+1)+". Ingrese un numero:");
             valor[i]=numero.nextInt();
         }
         ultimo = valor[9];
         for(int i=8;i>=0;i--){
             valor[i+1]=valor[i];
         }
         valor[0] = ultimo;
         System.out.println("El nuevo areglo es:");
         for(int i=0;i<10;i++){
             System.out.println(i+" Numero: "+valor[i]);
         }*/
        /*System.out.println("Areglos");
        int valor[]=new int[10];
        boolean creciente = true;
        int valor1,sitio=0,j=0;
         System.out.println("Lenar el Arreglo");
         do{
             for(int i=0;i<5;i++){
                  System.out.print((i+1)+" Digete un numero: ");
                  valor[i]=numero.nextInt();
             }
             for(int i=0;i<4;i++){
             if(valor[i]< valor[i+1]){
                 creciente = true;
             }
             if(valor[i]> valor[i+1]){
                creciente = false;
                break;
             }
         }
             if(creciente == false){
                  System.out.println("El Arreglos no esta ordena de forma crecente vuelva a deguitar");
             }
         }while(creciente == false);
          System.out.print("Digite un elemento a insertar:");
          valor1=numero.nextInt();
          while(valor[j]<valor1 && j<5){
              sitio++;
              j++;
          }
          for(int i=4;i>=sitio;i--){
              valor[i+1]=valor[i];
          }
          valor[sitio]=valor1;
           System.out.println("El arreglo queda de esta manera:");
           for(int i=0;i<6;i++){
                System.out.println(valor[i]+" - ");
           }
            System.out.println();*/
        /* System.out.println("Burbuja");
         int valor[],nelementos,aux;
          System.out.print("Ingrese la cantidad de elemntos del arreglo:");
          nelementos=numero.nextInt();
          valor = new int[nelementos];
          for(int i=0; i<nelementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            valor[i]=numero.nextInt();
          }
          for(int i=0;i<nelementos-1;i++){
              for(int j=0;j<nelementos-1;j++){
                  if(valor[j]> valor[j+1]){
                     aux=valor[j];
                     valor[j]=valor[j+1];
                     valor[j+1]=aux;
                  }
              }
          }
           System.out.println("\nArreglo ordenada de forma creceinte:");
           for(int i=0;i<nelementos;i++){
                System.out.print(valor[i]+" - ");
                
           }
           System.out.print("\nArreglo ordenada de forma decreceinte:");
           for(int i=nelementos-1;i>=0;i--){
                System.out.print(valor[i]+" - ");
           }*/
       }        
    
}
