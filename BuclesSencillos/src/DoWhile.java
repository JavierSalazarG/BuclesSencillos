import java.util.Scanner;		//IMPORTAR SCANNER
public class DoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un valor positivo y par: ");		//SOLICITA VALOR
		int n = teclado.nextInt();		//ALMACENAR VALOR EN N 
		int i = 1;		//DEFINIR VARIABLE CENTINELA I = 1
		do {		//HACER
			System.out.print('-');		//IMPRIMIR - 
			i=i+1;		//AUMENTAR CENTINELA EN 1
		}  while (i<n-1);		//MIENTRAS CENTINELA SEA MENOR QUE N-1

	}

}
