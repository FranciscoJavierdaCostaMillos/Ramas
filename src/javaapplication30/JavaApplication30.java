
package javaapplication30;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class JavaApplication30 {

 
      public static void main(String[] args) {
                
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce operacion"));
        switch (opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Lado"));
                JOptionPane.showMessageDialog(null,lado*lado);
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));                
                JOptionPane.showMessageDialog(null,altura*base/2);
                break;
            case 3:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Radio"));
                JOptionPane.showMessageDialog(null,Math.PI * Math.pow(radio, 2) );
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion incorrecta.");
                break;
            }
        } 
    }
    

