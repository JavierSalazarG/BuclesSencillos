import java.util.Scanner;		//IMPORTAR SCANNER
public class While {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un valor positivo y par: ");		//SOLICITA VALOR
		int n = teclado.nextInt();		//ALMACENAR VALOR EN N
		int i = 1;		//DEFINIR I COMO 1
		while (i<=(n-1)) {		//MIENTRAS I SEA MENOR O IGUAL A N-1
			System.out.print(i);		//IMPRIMIR NÚMERO
			i=i+2;		//AUMENTAR VALOR EN 2 (PARA QUE SIGA SIENDO IMPAR)
		}

	}

}
