/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

import javax.swing.JOptionPane;

/**
 *
 * @author cloweling
 */
public class PruebaGithub {
    
    public static int suma(int num, int num2){
        
        return num+num2;
    }

    /**
     * @param args the command line arguments
     */
    
    public static void ballenitatumama(){
        int prueba = 5;
        
        for( int i = 0; i <= prueba; i++){
            if(prueba != 2){
                 JOptionPane.showMessageDialog(null, "TU MAMA ES BALLENITA");
            }else{
                JOptionPane.showMessageDialog(null, "TU MAMA ES LA SAMI");
            }
        }
        
    }
    
    public static void resta(){
        
    }
    
    public static void main(String[] args) {  
      // TODO code application logic here
      System.out.println(""+suma(1,2));
      ballenitatumama();
      ballenitatumama();
    }
    
}
