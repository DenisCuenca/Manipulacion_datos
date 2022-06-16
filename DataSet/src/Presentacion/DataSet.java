package Presentacion;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Denis Alexander Cuenca Buele
 * Fecha 15 de junio
 */
public class DataSet {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArchivoTexto objArchivoTexto = new ArchivoTexto();
        int op = 0;
        while (op < 4){
            System.out.println("texto        1");
            System.out.println("bin  2");
            System.out.println("DB    3");
            System.out.println("salir 4");
            op = sc.nextInt();

            switch (op){
                case 1: objArchivoTexto.menuArchivoTexto(); break;
                case 2: menuBin(); break;
                case 3: menuDB(); break;
            }
        }
    }
    private static void menuTxt() {

    }
    private static void menuBin() {
    }
    private static void menuDB() {
    }
}
