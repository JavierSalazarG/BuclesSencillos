import java.util.Scanner;		//IMPORTAR SCANNER
public class For {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un valor positivo y par: ");		//SOLICITA VALOR
		int n = teclado.nextInt();		//ALMACENAR VALOR EN N
		for (int i=1;i<=(n/2-1);i++) {		//PARA N/2-1 VECES
			System.out.print('-');		//IMPRIMIR -
		}

	}
}
