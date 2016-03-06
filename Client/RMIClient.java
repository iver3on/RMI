

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author Iver3oN Zhang
 * @date 2016年3月6日
 * Impossible is nothing
 */
public class RMIClient {
	public static void main(String[] args) {
		try {
			String url = "//127.0.0.1:8819/SAMPLE-SERVER";
			Calculator calculator =  (Calculator) Naming.lookup(url);
			System.out.println("调用加法结果："+calculator.calculate(5, 3));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
