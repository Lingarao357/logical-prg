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
import java.util.Scanner;
public class Revessting {
    public static void main(String[] args) {
        System.out.println("Enter  string to reves: ");
        Scanner read=new Scanner(System.in);
        String str=read.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=str.length() -1;i>=0;i--){
        sb.append(str.charAt(i));
        }
        System.out.println("After Reves:");
        System.out.println(sb.toString());
    }
}
