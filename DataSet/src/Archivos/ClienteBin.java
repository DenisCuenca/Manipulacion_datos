package Archivos;
import Clases.Cliente;
import Logica.MiObjectOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Denis Alexander Cuenca Buele
 * Fecha 15 de junio
 */
public class ClienteBin {
    static String fichero = "Archivos/Clientes.dat";
    public boolean  AgregarCliente(Cliente objCliente, ArrayList<Cliente> ArrayClientes) throws IOException {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero,false));  //elimine o cree
            for (Cliente ObjCliente: ArrayClientes){
                oos.writeObject(ObjCliente);
            } oos.close();  // Se cierra al terminar.
            return true;
        }catch (Exception e){return false;}

    }

    public static void ImportarClienteBin(ArrayList<Cliente> ArrayClientes) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Cliente aux = (Cliente) ois.readObject();
            while (aux!=null){
                if (aux instanceof Cliente) {
                    //System.out.println(aux);
                    ArrayClientes.add((Cliente)aux);
                }
                aux = (Cliente) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de archivo");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
    }
    public static void AddClienteBin (ArrayList<Cliente> ArrayClientes) {
        try {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (Cliente ObjCliente:  ArrayClientes){
                oos.writeUnshared(ObjCliente);
            }
            oos.close();  // Se cierra al terminar.
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
