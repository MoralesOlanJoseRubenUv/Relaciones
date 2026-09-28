import java.util.Scanner;
import asociacion.EjemploAsociacion;
import agregacion.EjemploAgregacion;
import composicion.EjemploComposicion;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Relaciones POO ====");
        System.out.println("1) Asociacion");
        System.out.println("2) Agregacion");
        System.out.println("3) Composicion");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                EjemploAsociacion.ejecutar();
                break;
            case 2:
                EjemploAgregacion.ejecutar();
                break;
            case 3:
                EjemploComposicion.ejecutar();
                break;
            default:
                System.out.println("Opcion no valida.");
        }
        scanner.close();
    }
}