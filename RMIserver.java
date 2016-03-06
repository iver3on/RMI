

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author Iver3oN Zhang
 * @date 2016年3月6日
 * Impossible is nothing
 */
public class RMIserver {
	public static void main(String[] args) {
		///* 创建和安装一个安全管理器，令其支持 RMI. 作为 Java 开发包的一部分
		//适用于 RMI 唯一一个是 RMISecurityManager
		/*if(System.getSecurityManager()==null){
			System.setSecurityManager(new SecurityManager());
		}*/
		try {
			//指定本 RMI 服务程序不使用默认端口 1099, 而是使用自己指定的端口8900
			LocateRegistry.createRegistry(8819);
			CalculatorImp cal  = new CalculatorImp();
			/*将远程对象在服务器上注册并指定了将查找远程对象引用的 URL ，
			 *  URL 格式为 //host:port/name 。其中 host 是注册表所在的主机（远程或本地）， 
			 *  port 是注册表接受调用的端口号， name 是未经注册表解释的简单字符串。 
			 *  host 和 port 两者都是可选项。如果省略了 host ，则主机默认为本地主机。
			 *  如果省略了 port ，则端口默认为 1099 ，该端口是 RMI 的注册表 rmiregistry 使用的“著名”端口。*/
			Naming.rebind("//127.0.0.1:8819/SAMPLE-SERVER", cal);
			System.out.println("远程对象注册成功，RMI服务已经启动，等待客户端调用....");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
