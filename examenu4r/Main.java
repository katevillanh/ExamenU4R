
package examenu4r;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		boolean continuar = true, continuar2 = true;
		int opcion, numero = 1, elemento;
		
		Object inserta;
		
		Procesos obj = new Procesos();
		Scanner leer = new Scanner (System.in);
	
		while(continuar) {
			System.out.println("");
			System.out.println("Menu de listas enlazadas");
			System.out.println("1.- Insertar");
			System.out.println("2.- Mostrar Pre-orden");
			System.out.println("3.- Mostrar In-orden");
			System.out.println("4.- Mostrar Post-orden");
			System.out.println("5.- Buscar elemento");
			System.out.println("6.- Altura");
			System.out.println("7.- Cantidad de nodos");
			System.out.println("8.- Salir");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
                            Nodo nodoActual;
                            String[] arreglo2=null;                         
     
                            try {
         
                            File archivo= new File ("C:\\Users\\Kate Villanueva\\Desktop\\examenU4R.txt");
                            FileReader fr = new FileReader (archivo);
                            BufferedReader br = new BufferedReader(fr);
         
                            String linea;
                            while((linea=br.readLine())!=null){
                               arreglo2=linea.split(" "); //acomodar en el codigo para que separe el archivo txt
                            }
         
         
                            int arreglo[]=new int[arreglo2.length];
                            for (int i = 0; i < arreglo2.length; i++) {
                                arreglo[i] = Integer.parseInt(arreglo2[i]);
                            } 
                            
                            for(int i=0;i<=arreglo.length;i++){
                                nodoActual = new Nodo(arreglo[i]);
				obj.Insertar(nodoActual);
                            }
                            
                            fr.close();
                          }
      
     
                          catch(Exception e){
                              //System.out.println(e);
                          }
                            
                            
				System.out.println("Numeros insertados");
				
				
				break;
				
			case 2:
				obj.preorden();
				break;
				
			case 3:
				obj.inorden();
				break;
				
			case 4:
				obj.posorden();
				break;
				
			case 5:
				System.out.println("¿Qué número desea buscar?");
				elemento = leer.nextInt();
				obj.Buscar(elemento);
				break;
				
			case 6:
				obj.retornaAltura();
				break;
			
			case 7:
				obj.cantidad();
				break;
			
			case 8:
				continuar = false;
				break;
				
			default:
				break;
			}
		}
	}
}
    

