package Archivos;
import Clases.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Denis Alexander Cuenca Buele
 * Fecha 15 de junio
 */
public class ClienteTxt {
    public boolean  AgregarCliente(Cliente objCliente) throws IOException {
        File f = new File("Cliente.txt");
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(objCliente.getId());
        bw.write(objCliente.getNombre());
        String.valueOf(bw);
        bw.write(String.valueOf(objCliente.getFecNac()) + "\n");
        bw.close();
        fw.close();
        return true;
    }
    public static ArrayList<Cliente>
    LeerCliente(ArrayList<Cliente> ArrayClientes){
        File f = new File("Clientes.txt");
        StringTokenizer st;
        Scanner entrada = null;
        String cadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                cadena = entrada.nextLine();
                st = new StringTokenizer(cadena, ",");
                while (st.hasMoreTokens()){
                    Cliente Objtmp = new Cliente(Integer.valueOf(st.nextToken()), st.nextToken(), st.nextToken());
                    ArrayClientes.add(Objtmp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return ArrayClientes;
    }

    public void LeerClienteTxt(){}
}
