import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
//    Escribir un programa en Java para solicitar un número repetidamente mientras éste se encuentre entre
//    1 y 100.
//    Ingresado el valor válido, el programa continúa si el usuario responde Sí a “¿Desea continuar? (Sí/No)”.
//    Si contesta No, el programa termina.
//    Validar los diferentes tipos de respuestas utilizando expresiones regulares (No, no, NO, si, Si, sí, SÍ, Sí)
//    dentro de un bucle while.(clases Pattern & Matching)
    public static void main(String[] args) {
        boolean isContinue = true;
        int numero = 0;

        Scanner sc = new Scanner(System.in);

        while (isContinue) {
            System.out.println("Ingrese un numero de 1 a 100: ");
            numero = sc.nextInt();
            if (numero > 0 && numero <=100) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("¿Desea continuar? (Sí/No)");

                String continuar = sc2.nextLine();

                Pattern regex  = Pattern.compile("[Ss][Iíi]*");

                Matcher matcher = regex.matcher(continuar);


                isContinue = matcher.find();
                System.out.println(isContinue);

            }else {
                isContinue = false;
                System.out.println("Para continuar ingrese numero de 1 y 100");
            }

        }
    }
}
