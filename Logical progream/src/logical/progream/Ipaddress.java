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


import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linga357
 */
public class Ipaddress {
    public static void main(String[] args) 
          throws Exception {
        InetAddress myIp= InetAddress.getLocalHost();
              System.out.println("My IP Address is:");
      System.out.println(myIp.getHostAddress());

    }
}
