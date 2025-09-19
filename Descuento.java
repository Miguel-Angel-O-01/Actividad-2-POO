import java.util.Scanner;
public class Descuento{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       double total = 0.0;
       String continuar ;
       
        do {
            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();

            total += precio * cantidad;

            System.out.println("Desea ingresar otro producto si o no");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nTotal de la compra: $" + total);

        double descuento = 0;
        if (total >= 20 && total <= 35) {
            descuento = 0.05;
        } else if (total >= 36 && total <= 50) {
            descuento = 0.08;
        } else if (total > 50) {
            descuento = 0.10;
        }

        double montodescuento = total * descuento;
        double nuevototal = total - montodescuento;

        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Monto de descuento: $" + montodescuento);
        } else {
            System.out.println("No se aplica descuento.");
        }

        System.out.println("Total a pagar: $" + nuevototal);

        sc.close();
        
    }
    
}
