/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.progream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linga357
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> lit=new ArrayList();
        List<Integer> lit2=new ArrayList();
        int count;
        for(int i=1;i<=100;i++){
            count=0;
        for(int j=2;j<=i/2;j++){
        if(i%j==0){
        count++;
        break;
        }}
        if(count==0){
                lit.add(i);
        }
        else{
          lit2.add(i) ; 
        }
        }
         System.out.println(lit);
         System.out.println(lit2);

    }
  
}
