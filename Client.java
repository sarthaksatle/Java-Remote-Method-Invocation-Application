import static java.lang.System.out;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client 
{
            public static void main(String[] args)throws Exception 
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter server name");
                String serverName=sc.next();
                System.out.println("Enter port no");
                int portNo=sc.nextInt();
                System.out.println("Enter unique id");
                String uniqueId=sc.next();
                System.out.println("Enter user id ");
                String userId=sc.next();
                System.out.println("Enter password");
                String passsword=sc.next();
                
                Registry reg= LocateRegistry.getRegistry(serverName,portNo); //Server.java
                
                LoginInterface li=(LoginInterface)reg.lookup("AUTH"); //Server.java
                //down casting
                
                boolean bool=li.check(userId, passsword);
                if(bool)
                {
                    out.println("Hello World");
                    
                }
                else
                {
                    System.exit(0);
                    
                }
            }
}