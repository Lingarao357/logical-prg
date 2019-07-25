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
public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        List<Integer> li2=new ArrayList<Integer>();
        
        for(int i=100;i>=0;i-=2){
            li.add(i);
//            System.out.println(i);
        }
        System.out.println(li);
        for(int j=0;j<=100;j+=2){
            li2.add(j);
//            System.out.println(j);
        }
        System.out.println(li2);
    }
}
