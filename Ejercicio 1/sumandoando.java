import java.util.Scanner;
public class sumandoando{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double res = 0;
	int i = 0;
	double num = 0;
	System.out.println("Se realizará una suma de numeros, ingrese 0 para calcular el resultado.");
	while (i < 10){
	    System.out.println("Ingrese un número: ");
	    num = input.nextDouble();
	    res = res + num;
	    if (num == 0){
		break;
	    }
	    else{
		i++;
	    }
	}
	System.out.println("La suma de los números ingresados es: " + res);
    }
}