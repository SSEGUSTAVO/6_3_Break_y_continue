import java.util.Scanner;

public class megasuma{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int res = 0;
	int i = 0;
	int cuenta = 0;
	System.out.print("Se realizará la suma de los números impares enteros de 0 a 1000, ingrese un número si quiere terminar la suma en otro valor: ");
	double num = input.nextDouble();
	while (i <= 1000){
	    i++;
	    if (res >= num){
		break;
	    }
	    else if (i % 2 == 0){
		continue;
	    }
	    else{
	    	res = res + i;
		cuenta++;
	    	System.out.println(cuenta);
	    }
	}
	System.out.println("La suma generada es: " + res);
	System.out.println("Se sumaron " + cuenta + " números.");
    }
}