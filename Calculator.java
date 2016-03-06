

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Iver3oN Zhang
 * @date 2016Äê3ÔÂ6ÈÕ
 * Impossible is nothing
 */
 interface Calculator extends Remote{
	int calculate(int x,int y) throws RemoteException;
}
