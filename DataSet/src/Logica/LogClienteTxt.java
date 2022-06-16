package Logica;
import Archivos.ClienteTxt;
import Clases.Cliente;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Denis Alexander Cuenca Buele
 * Fecha 15 de junio
 */
public class LogClienteTxt {
    ClienteTxt objClienteTxt = new ClienteTxt();
    public boolean  ValidarId(Cliente objCliente) throws IOException {
        if (objCliente.getId() > 0){
            return objClienteTxt.AgregarCliente(objCliente);
        }return false;}
    public void ListarClientes(ArrayList<Cliente> ArrayClientes) {
        objClienteTxt.LeerCliente(ArrayClientes);
    }
}
