import java.util.Scanner;

public class OrdenarNumeros {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int cantidad;
		      int numeroA;
		      int i;
		      int j;
		    
	        System.out.print("INGRESE 4 NÚMEROS DISTINTOS ");
	        System.out.print("\n");
	        cantidad = 4;
	        int[] numeros = new int[cantidad + 1];
	        for(i = 1; i <= cantidad; i++)
	        {
	      	
	        System.out.print("Ingrese un número ("+ i + ") : ");
	        numeros[i] = sc.nextInt();
	        }
	        for(i = 1; i <= cantidad; i++)
	        {
	        for(j = i; j <= cantidad; j++)
	        {
	        if(numeros[i] < numeros[j])
	        {
	        numeroA = numeros[i];
	        numeros[i] = numeros[j];
	        numeros[j] = numeroA;
	        }
	        }
	        }
	        System.out.println("\nLos números de mayor a menor son:");
	        for(i = 1; i <= cantidad; i++)
	        {
	        System.out.println(numeros[i]);
	        }
	    }    }
	     
	       
