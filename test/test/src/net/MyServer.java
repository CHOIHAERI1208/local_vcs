package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �����ۼ��� : ���ظ�
 * �����ۼ��� : 2021-01-25
 * ���������� : 2021-02-25
 * ���� : ���� ����
 */

public class MyServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5000));
			while (true) {
				Socket socket = serverSocket.accept();
				InetSocketAddress address = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("MyServer�� ����Ǿ����ϴ�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(serverSocket !=null) {
				try {
					serverSocket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
