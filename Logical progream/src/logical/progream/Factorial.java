/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.progream;

/**
 *
 * @author Linga357
 */
public class Factorial {
    public static void main(String[] args) {
        int number=5;
       double fact=1;
       for(int i=1;i<number;i++){
        fact=fact*i;
       }
        System.out.println("factorial no"+number+"is:"+fact);
    }
}
