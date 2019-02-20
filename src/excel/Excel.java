/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import java.util.Scanner;

/**
 *
 * @author mariajose
 */
public class Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pedir=new Scanner(System.in);
        
         System.out.println("Ingrese columnas:");
        int num=pedir.nextInt();
        
        
        String [] columnNames = generar(num);
        for (String columnName : columnNames){
        System.out.print(columnName + " ");
        }
    }
    
    
    
    public static String [] generar (int ContadorCol){
        
      
          String[] NombresCol = null;
        
        if(ContadorCol >=1 && ContadorCol<=10000){
            NombresCol = new String[ContadorCol];

            int A = 65, Z = 90, ABC = A, pos = 0;
            String temp = "";

            for(int i=0; i<ContadorCol; i++){
                NombresCol[i] = temp+(char)ABC;

                ABC++;

                if(ABC>Z){
                    ABC=65;
                    temp=NombresCol[pos];
                    pos++;
                }
            }
        }

            return NombresCol;
    }
    
    
    
    
    
}
