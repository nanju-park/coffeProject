package com.JavaProject;


/*	interface : Account 
 * 	Account 인터페이스 파일은  AccountImpl클래스 파일에서 필수적으로 구현해야할 메소드 명 정보가 있습니다. 
 *	input() : 회원가입 기능을 담당하는 메소드 : 회원 가입이 된 회원은 account.txt 파일에 ArrayList형식으로 저장 
 *	filestore(List aclist) : 회원 정보를 객체의 직렬화를이용하여 d:\\project\\account.txt 파일에 저장 
 *	output() : 회원 가입된 회원 정보를 출력하는 기능한 메소드 
 *  login() : 로그인 기능을 담당하는 메소드: 로그인이 되었을경우 OrderMain으로 메뉴가 넘어갑니다. 
 */
import java.io.ObjectInputStream;
import java.util.List;

public interface Account {

	public void input();
	public void filestore(List aclists);
	public void output();
	public void login();
	
}
