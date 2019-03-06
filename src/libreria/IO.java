
package libreria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class IO {

public static final int CONSOLA = 1;
public static final int VENTANA = 2;

public static int introducir(int tipo){
    
    Scanner scan = new Scanner(System.in);
    int numero=0;
    switch(tipo){
        case CONSOLA :
            numero = scan.nextInt();
            break;
        case VENTANA :
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un int"));
            break;
                    
    } 
    return numero;
}   
public static void mostrar(int tipo){
   
    System.out.println(tipo);
}  
    public static void mostrar(String tipo){
    
        JOptionPane.showMessageDialog(null, "tu numero es: "+tipo);
}
}
