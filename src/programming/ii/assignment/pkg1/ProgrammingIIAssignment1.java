/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.ii.assignment.pkg1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Antonio
 */
public class ProgrammingIIAssignment1 {


    public static void main(String[] args) {
       
        /*initialized 7 arrays with a length of 12 with no elements
        int[] r1 = new int[12];
        int[] r2 = new int[12];
        int[] r3 = new int[12];
        int[] r4 = new int[12];
        int[] r5 = new int[12];
        int[] r6 = new int[12];
        int[] r7 = new int[12];
                */
    
       
    }
   
    public static Scanner scnr;
    
    public void openFile(){
        try{
            scnr = new Scanner(new File("G:\\Users\\Antonio\\Downloads\\ass1in.txt"));
        }
        catch(Exception e){
            System.out.println("Could not find file.");
        }
    }
    
    public static int[] r1 = new int[12];
    public static int[] r2 = new int[12];
    public static int[] r3 = new int[12];
    public static int[] r4 = new int[12];
    public static int[] r5 = new int[12];
    public static int[] r6 = new int[12];
    public static int[] r7 = new int[12];
    public static int y = 0;
    public static int z = 0;
    
    public static void readFile(){
        
        int c = 0;
       
        while(scnr.hasNext()){
            
            char x = scnr.next().charAt(c);
            y = scnr.nextInt();
            z = scnr.nextInt();
         
            switch (x){
                case 'I': I.insert();
                        ++c;
                        break;
                case 'D': D.delete();
                        ++c;
                        break;
                case 'E': E.empty();
                        ++c;
                        break;
                case 'F': F();
                        ++c;
                        break;
                case 'C': C.combine();
                        ++c;
                        break;
                case 'M': M();
                        ++c;
                        break;
                case 'O': O();
                        ++c;
                        break;
                default: ++c;
                        break;
            } //end of switch
          
        } //end of while
        
        System.out.println(Arrays.toString(r3));
      
    } // readfile
}
