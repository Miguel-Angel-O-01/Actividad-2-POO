import java.util.Scanner;

public class Areacilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el radio del cilindro: ");
        double r = entrada.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double h = entrada.nextDouble();

        // Calcular el área del cilindro con la fórmula: 2πr(r+h)
        double area = 2 * Math.PI * r * (r + h);

        // Mostrar el resultado con 2 decimales
        System.out.printf("El area del cilindro es: %.2f\n", area);

        entrada.close();
    }
}
