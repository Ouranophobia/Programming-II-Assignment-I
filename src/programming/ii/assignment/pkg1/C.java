/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.ii.assignment.pkg1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author asuar199
 */
public class C extends ProgrammingIIAssignment1{
    
    public static int[] fridgex = new int[12];
    public static int[] fridgey = new int[12];
    public static int[] fridgexy = new int[24];
    
    
    
    
    public static void combine(){
      
        if(y==1){
            fridgex = r1;
        }
        
        if(y==2){
            fridgex = r2;
        }
        
        if(y==3){
            fridgex = r3;
        }
        
        if(y==4){
            fridgex = r4;
        }
        
        if(y==5){
            fridgex = r5;
        }
        
        if(y==6){
            fridgex = r6;
        }
        
        if(y==7){
            fridgex = r7;
        }
        
        if(z==1){
            fridgey = r1;
        }
        
        if(z==2){
            fridgey = r2;
        }
        
        if(z==3){
            fridgey = r3;
        }
        
        if(z==4){
            fridgey = r4;
        }
        
        if(z==5){
            fridgey = r5;
        }
        
        if(z==6){
            fridgey = r6;
        }
        
        if(z==7){
            fridgey = r7;
        }
    
        fridgexy = ArrayUtils.addAll(fridgex, fridgey);
    }
   
}
