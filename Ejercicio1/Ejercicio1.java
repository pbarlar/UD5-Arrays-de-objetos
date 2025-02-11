import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String matricula,modelo;
        float potenciaCV;
        int numeroPlazas;
        Autobus[] autobuses=new Autobus[4];

      for (int i = 0; i < autobuses.length; i++) {
        System.out.println("Dime la matricula del coche: ");
        matricula=entrada.nextLine();
        System.out.println("Dime el modelo del coche: ");
        modelo=entrada.nextLine();
        System.out.println("Dime la potencia en CV del coche: ");
        potenciaCV=entrada.nextFloat();
        System.out.println("Dime el numero de plazas del coche: ");
        numeroPlazas=entrada.nextInt();

        autobuses[i]=new Autobus(matricula, modelo, potenciaCV, numeroPlazas);
        autobuses[i].display();
      }
      entrada.close();
    }
}