

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author Iver3oN Zhang
 * @date 2016��3��6��
 * Impossible is nothing
 */
public class RMIserver {
	public static void main(String[] args) {
		///* �����Ͱ�װһ����ȫ������������֧�� RMI. ��Ϊ Java ��������һ����
		//������ RMI Ψһһ���� RMISecurityManager
		/*if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
		}*/
		try {
			//ָ���� RMI �������ʹ��Ĭ�϶˿� 1099, ����ʹ���Լ�ָ���Ķ˿�8900
			LocateRegistry.createRegistry(8819);
			CalculatorImp cal  = new CalculatorImp();
			/*��Զ�̶����ڷ�������ע�Ტָ���˽�����Զ�̶������õ� URL ��
			 *  URL ��ʽΪ //host:port/name ������ host ��ע������ڵ�������Զ�̻򱾵أ��� 
			 *  port ��ע�����ܵ��õĶ˿ںţ� name ��δ��ע�����͵ļ��ַ����� 
			 *  host �� port ���߶��ǿ�ѡ����ʡ���� host ��������Ĭ��Ϊ����������
			 *  ���ʡ���� port ����˿�Ĭ��Ϊ 1099 ���ö˿��� RMI ��ע��� rmiregistry ʹ�õġ��������˿ڡ�*/
			Naming.rebind("//127.0.0.1:8819/SAMPLE-SERVER", cal);
			System.out.println("Զ�̶���ע��ɹ���RMI�����Ѿ��������ȴ��ͻ��˵���....");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
