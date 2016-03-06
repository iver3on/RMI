

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Iver3oN Zhang
 * @date 2016年3月6日
 * Impossible is nothing
 */
//客户端和服务端的代码都必须定义或能够访问一个接口，
//该接口中申明了可以远程调用的方法，并且两者还可以设置一个安全管理器。
public interface Calculator extends Remote{
	int calculate(int x,int y) throws RemoteException;
}
