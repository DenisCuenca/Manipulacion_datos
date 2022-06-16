/**
 * Redefinicion de la clase ObjectOutputStream para que no escriba una cabecera
 * al principio del Stream.
 */
package Logica;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Denis Alexander Cuenca Buele
 *15/06/2022
 */
public class MiObjectOutputStream extends ObjectOutputStream
{

    public MiObjectOutputStream(OutputStream out) throws IOException
    {super(out);}


    protected MiObjectOutputStream() throws IOException, SecurityException
    {super();}


    protected void writeStreamHeader() throws IOException {}

}
