

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Iver3oN Zhang
 * @date 2016��3��6��
 * Impossible is nothing
 */
public class CalculatorImp extends UnicastRemoteObject implements Calculator {

	private static final long serialVersionUID = 1L;
	public CalculatorImp()  throws RemoteException{
		super();
	}
	//// ����Զ��ʵ�ַ��������׳� RemoteException
	@Override
	public int calculate(int x,int y) throws RemoteException {
		return x+y;
	}
}
