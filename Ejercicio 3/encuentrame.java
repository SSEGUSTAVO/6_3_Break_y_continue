import java.util.Scanner;

public class encuentrame{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int res = 0;
	int i = 0;
	int cuenta = 0;
	System.out.print("Ingrese un n�mero entero positivo para determinar sus n�meros divisores: ");
	int num = input.nextInt();
	while (i < num){
	    i++;
	    if (num % i != 0){
		continue;
	    }
	    else{
	    	System.out.println("El n�mero " + i + " es divisor de " + num +".");
	    }
	}
    }
}