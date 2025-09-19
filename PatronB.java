public class PatronB {
    public static void main(String[] args) {
        // Primera línea completa
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Dos líneas con solo un asterisco a la izquierda
        for (int i = 0; i < 2; i++) {
            System.out.println("*");
        }

        // Línea completa al centro
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Dos líneas con el asterisco desplazado a la derecha
        for (int i = 0; i < 2; i++) {
            System.out.println("        *"); // Espacios para alinear
        }

        // Última línea completa
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}