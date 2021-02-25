package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * �����ۼ��� : ���ظ�
 * �����ۼ��� : 2021-01-25
 * ���������� : 2021-02-25
 * ���� : ���� ����
 */

public class MyClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5000));
			System.out.println("MyServer�� ���ӵǾ����ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(socket !=null) {
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}