package Presentacion;
import Clases.Cliente;
import Logica.LogClienteBin;
import Logica.LogClienteTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static Presentacion.ArchivoTexto.objLogClienteTxt;

/**
 * @author Denis Alexander Cuenca Buele
 * Fecha 15 de junio
 */
public class ArchivoBin {
    private static LogClienteBin objLogClienteBin;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AgregarClienteBin();
        ListarClienteBin();
    }
    void menuArchivoBin() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op < 4){
            System.out.println("Agregar  1");
            System.out.println("Eliminar    2");
            System.out.println("Listar clientes  3");
            System.out.println("Salir         4");
            op = sc.nextInt();
            switch (op){
                case 1: AgregarClienteBin(); break;
                case 2: EliminarClienteBin(); break;
                case 3: ListarClienteBin(); break;
            }
        }
    }
    private static void AgregarClienteBin() throws IOException {
        LogClienteTxt objLogClienteTxt = new LogClienteTxt();
        Cliente objCliente = new Cliente();
        objCliente.setId(1);
        objCliente.setNombre("user");
        objCliente.setFecNac(new Date().toString());
        if (objLogClienteTxt.ValidarId(objCliente)){
            System.out.println("Cliente Agregado");
        } else {
            System.out.printf("Codigo Cliente No Valido");
        }
    }
    private void EliminarClienteBin() {
    }
    private static void ListarClienteBin() throws IOException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = new ArrayList();
        objLogClienteBin.ListarClientes(ArrayClientes);
        for (Cliente tmpCliente : ArrayClientes){
            System.out.println(tmpCliente.toString());
        }
    }
}
