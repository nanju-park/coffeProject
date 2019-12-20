package com.JavaProject;


/*	interface : Account 
 * 	Account �������̽� ������  AccountImplŬ���� ���Ͽ��� �ʼ������� �����ؾ��� �޼ҵ� �� ������ �ֽ��ϴ�. 
 *	input() : ȸ������ ����� ����ϴ� �޼ҵ� : ȸ�� ������ �� ȸ���� account.txt ���Ͽ� ArrayList�������� ���� 
 *	filestore(List aclist) : ȸ�� ������ ��ü�� ����ȭ���̿��Ͽ� d:\\project\\account.txt ���Ͽ� ���� 
 *	output() : ȸ�� ���Ե� ȸ�� ������ ����ϴ� ����� �޼ҵ� 
 *  login() : �α��� ����� ����ϴ� �޼ҵ�: �α����� �Ǿ������ OrderMain���� �޴��� �Ѿ�ϴ�. 
 */
import java.io.ObjectInputStream;
import java.util.List;

public interface Account {

	public void input();
	public void filestore(List aclists);
	public void output();
	public void login();
	
}
