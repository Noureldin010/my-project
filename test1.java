/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test1;

/**
 *
 * @author pc
 */
public class test1 {
    static public void main (String [] args ){
         int x,y,z;
         for(x=1;x<=5;x++)
         {
         for(y=x;y<5;y++)
         {
         System.out.print(" ");
         
         }
         for(z=1;z<(x*2);z++)
         {
             System.out.print("*");
         }
         System.out.println(" ");
         
         }
         for (x=4;x>=1;x--)
         {
             for (y=5;y>x;y--)
             {
             System.out.print( " ");
             }
         {
             for(z=1;z<(x*2);z++)
             {
                 
                 System.out.print("*");
             }
         }
             System.out.println();
         }
         
}
    
}
