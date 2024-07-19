import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server
{
    public static void main(String...ar)throws Exception
    {
        Registry reg= LocateRegistry.createRegistry(2000);
        System.out.println("SERVER IS READY");
        CheckLogin cl= new CheckLogin();
        reg.bind("AUTH",cl);
    }
}