import java.util.Scanner;
public class Numeros_mayor_menor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Pedimos los números que necesitamos
        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int n4 = sc.nextInt();
        System.out.print("Ingrese el quinto número: ");
        int n5 = sc.nextInt();
        System.out.print("Ingrese el sexto número: ");
        int n6 = sc.nextInt();

        // Inicializamos mayor y menor con el primer número
        int mayor = n1;
        int menor = n1;

        // Comprobamos con los demás
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;
        if (n4 > mayor) mayor = n4;
        if (n5 > mayor) mayor = n5;
        if (n6 > mayor) mayor = n6;

        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        if (n5 < menor) menor = n5;
        if (n6 < menor) menor = n6;

        // Mostramos resultados en consola
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        sc.close();
    }
}
