import java.util.Scanner;

public class Numeros{
    public static void main(String [] args){
        int ceros = 0;
        int Vmax = 0;
        int Ntotal = 0;
        int rango = 0;
        int Vtotal = 0;
        int Numtotal = 0;  
        int leidos = 0;
        int numero = 0;    

        Scanner X = new Scanner(System.in);
        
        System.out.print("Introduce num: ");
        numero = X.nextInt();

        while (numero >= 0) {
            leidos = leidos + 1;
            if(numero == 0){
                ceros = ceros + 1;
            }
            if(numero > Vmax){
                Vmax = numero;
            }
            Ntotal++;
            if(numero >= 10 && numero<= 20){
                rango++;
            }
            Vtotal = Vtotal + numero;
            Numtotal++;

            System.out.print("Introduce num: ");
            numero = X.nextInt();
        }

        if (leidos > 0){
            int media = Vtotal/Numtotal;
            System.out.println("Se han leído un total de : " + ceros + " ceros.");
            System.out.println("El valor máximo leído ha sido de : " + Vmax + ".");
            System.out.println("La cantidad de números leídos ha sido de : " + Ntotal + ".");
            System.out.println("La cantidad de números leídos entre el rango de 10 a 20 ha sido de : " + rango + ".");
            System.out.println("La media de los números leídos ha sido de : " + media + ".");
        }
        else {
			System.out.println("No se han leído valores...");
		}
    }
}