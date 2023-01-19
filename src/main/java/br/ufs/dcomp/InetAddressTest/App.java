package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com.br";
            InetAddress address[] = InetAddress.getAllByName(name);
            
            for(int i=0; i<address.length; i++){
                System.out.println("Address: " + address[i]);
            }
            
            System.out.println( "Name:      "+ name);
            //System.out.println( "Address:   "+ address.getHostAddress());

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
