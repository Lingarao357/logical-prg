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
public class Revprime {
    public static void main(String[] args) {
       int count;
        for(int i=100;i>1;i--){
            count=0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
           count++;
            break;
            }
        
        }
        if(count==0){
            System.out.println(i);
        }
        }
    }
}
