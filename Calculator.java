

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Iver3oN Zhang
 * @date 2016��3��6��
 * Impossible is nothing
 */
 interface Calculator extends Remote{
	int calculate(int x,int y) throws RemoteException;
}
