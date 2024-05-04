import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int contAprobados = 0;
        int contDesAprobados = 0;
        int cantNotas = 0;
        int sumNotas = 0;

        int isContinue = -1;
        while (isContinue < 0) {
            Scanner scNota = new Scanner(System.in);
            System.out.println("Ingrese la nota: ");
            int num = scNota.nextInt();
            if(num<0){
                isContinue = 0;
                break;
            }
            if(num>=12){
                contAprobados = contAprobados + 1;

            }else  {
                contDesAprobados = contDesAprobados + 1;
            }
            sumNotas = ( sumNotas + num);
            cantNotas = cantNotas + 1;
        }
        System.out.println("Cantidad de notas ingresadas: " + cantNotas);
        System.out.println("Sumatoria total de notas: " + sumNotas);
        System.out.println("Total de desaprobados 🥲🥲: " + contDesAprobados);
        System.out.println("Total de aprobados 👌👌: " + contAprobados);
        System.out.println("Promedio de notas globales: " + sumNotas / cantNotas);
    }
}
