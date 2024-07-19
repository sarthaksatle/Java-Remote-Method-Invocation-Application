import java.rmi.Remote;
import java.rmi.RemoteException;
public interface LoginInterface extends Remote
{
public boolean check(String userId,String pass) throws RemoteException;
}
