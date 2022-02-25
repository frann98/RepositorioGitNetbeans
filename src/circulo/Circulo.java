package circulo;
import java.util.Scanner;

public class Circulo {

    final static double PI=3.1416;

    public static void main(String[] args) {
        
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce el radio:");
        double r=s.nextDouble();
        System.out.println(" TODO Calculo del area:");
        CalculaArea(r);
        System.out.println(" TODO Calculo de la longitud; ");
        System.out.println(" TODO Calculo del redondeo; ");
        System.out.println("Resultado longitud circulo");
        } catch(Exception e){System.out.println("error");}
        
    }
    public static void CalculaArea(double r) {
        double area=(PI*r*r);
	System.out.printf("El valor del área es %f\n",area);
    }
   
}
