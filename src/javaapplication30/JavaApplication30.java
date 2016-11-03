
package javaapplication30;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class JavaApplication30 {

 
      public static void main(String[] args) {
                
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce case para calcular"));
        switch (opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Lado"));
                System.out.println(lado*lado);
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));                
                System.out.println(altura*base/2);
                break;
            case 3:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Radio"));
                System.out.println(Math.PI * Math.pow(radio, 2) );
                break;
            default:
                System.out.println("Incorrecto");
                break;
            }
        } 
    }
    

