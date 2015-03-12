/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.ii.assignment.pkg1;

/**
 *
 * @author Antonio
 */
public class E extends ProgrammingIIAssignment1{
    public static void empty(){
        
         boolean empty = true;
        
        for (int i = 0; i < r1.length; i++) {
            if (r1[i] != 0) {
                empty = false;
                break;
            }
        }
        
        System.out.println("r1 empty: " + empty);
        
        
    }
}
