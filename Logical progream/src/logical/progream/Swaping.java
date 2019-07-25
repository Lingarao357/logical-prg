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
public class Swaping {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap two numbers:"+"x="+x+ " y="+y);
    }
}
