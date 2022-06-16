package Logica;
import Archivos.ClienteBin;
import Clases.Cliente;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Denis Alexander Cuenca Buele
 * Fecha 15 de junio
 */
public class LogClienteBin {
    ClienteBin objClienteBin = new ClienteBin();
    public boolean  ValidarId(Cliente objCliente) throws IOException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        if (objCliente.getId() > 0){
            ArrayClientes.add(objCliente);
            return objClienteBin.AgregarCliente(objCliente, ArrayClientes);
        }
        return false;
    }
    public void ListarClientes(ArrayList<Cliente> ArrayClientes) throws IOException, ClassNotFoundException {
        objClienteBin.ImportarClienteBin(ArrayClientes);
    }
}
