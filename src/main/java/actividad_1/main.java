package actividad_1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) throws IOException {
        String usuario, password;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca el usuario, porfavor:(* para salir)");
            usuario = sc.next();
            if ("*".equals(usuario)) {
                break;
            }
            System.out.println("Introduzca la contraseña, porfavor:");
            password = sc.next();

            FTPCliente c = new FTPCliente("localhost", 21, usuario, password);

            if (c.open()) {
                System.out.println("Acceso correcto!");
                c.writeLog();
                c.close();
            }else{
                System.out.println("Acceso incorrecto");
            }

        } while (!"*".equals(usuario));

    }
}
