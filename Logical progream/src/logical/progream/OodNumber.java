/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.progream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Linga357
 */
public class OodNumber {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList();
        for(int i=1;i<=100;i+=2){
            li.add(i);
            
//            System.out.println(i);
            
        }
        Iterator <Integer> il= li.iterator();
        while(il.hasNext()){
                    System.out.println(il.next());

        }
        
    }
}
