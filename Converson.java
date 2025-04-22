import java.util.Scanner;
import com.google.gson.JsonObject;


public class Conversor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JsonObject tasas = obtencionDatos.obtenerCambio();

        if (tasas == null) {
            System.out.println("No se pudo obtener las tasas de cambio.");
            return;
        }

        while (true) {
            System.out.println("""
            **************************************************************************
                        Sea bienvenido/a al Conversor de Moneda =)

                        1.- Dolar =>> Peso Argentino
                        2.- Peso Argentino =>> Dolar
                        3.- Dolar =>> Real Brasileño
                        4.- Real Brasileño =>> Dolar
                        5.- Dolar =>> Peso Chileno
                        6.- Peso Chileno =>> Dolar
                        7.- Salir
                        Digite una opcion Valida:
            **************************************************************************
            """);

            String opcion = scanner.nextLine();

            if (opcion.equals("7")) {
                System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = Double.parseDouble(scanner.nextLine());

            switch (opcion) {
                case "1":
                    System.out.printf("%.2f USD = %.2f ARS%n", monto, monto * tasas.get("ARS").getAsDouble());
                    break;
                case "2":
                    System.out.printf("%.2f ARS = %.2f USD%n", monto, monto / tasas.get("ARS").getAsDouble());
                    break;
                case "3":
                    System.out.printf("%.2f USD = %.2f BRL%n", monto, monto * tasas.get("BRL").getAsDouble());
                    break;
                case "4":
                    System.out.printf("%.2f BRL = %.2f USD%n", monto, monto / tasas.get("BRL").getAsDouble());
                    break;
                case "5":
                    System.out.printf("%.2f USD = %.2f CLP%n", monto, monto * tasas.get("CLP").getAsDouble());
                    break;
                case "6":
                    System.out.printf("%.2f CLP = %.2f USD%n", monto, monto / tasas.get("CLP").getAsDouble());
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
            }
            System.out.println("Desea realizar otra conversion? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (!respuesta.equals("s")){

                System.out.println("Gracias por usar el conversor. ¡ Hasta la Proxima");
                break;
            }
        }

        scanner.close();
    }
}
