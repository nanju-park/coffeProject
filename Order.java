package com.JavaProject;

import java.util.List;

public interface Order {

	//주문
	public void order(); //주문
	//재주문 및 메뉴
	public void reOrder(); //다시주문
	public void cancel(); //주문 취소
	public void menu(); //메뉴판
	public void chul();
	
	/*//회원가입 및 로그인 영역
	public void input();
	public void filestore(List aclists);
	public void accountstore(List aclists);
	public void output();
	public void login();*/
	
	

	

}
