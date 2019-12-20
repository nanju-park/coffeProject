package com.JavaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountImpl implements Account{

	List<AccountVO> aclists = null;
	
	
	
	Scanner asc = new Scanner(System.in);
	
	private String accountfilepath = "d:\\project\\"; 
	private String accountfilename = null;
	private String accountmanagefilepath = "d:\\project\\account.txt";
	private File f;
	boolean logincheck = false;
	
	//로그인을 했을때 해당 id 값을 저장 
	private String loginid;
	/*
	 * 아이디값 처리하기 
	 */
	public void setloginId(String loginid) {
		this.loginid = loginid;
	}
	public String getloginId() {
		return loginid;
	}
	public AccountImpl() {
		
		f = new File(accountmanagefilepath);
		
		try {
			if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
			}
			if(!f.exists()) {
				aclists = new ArrayList<AccountVO>();
				System.out.println("회원정보가 없습니다.");
			}else{
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				aclists = (List<AccountVO>)ois.readObject();
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void input() {
		
		AccountVO avo = new AccountVO();
	//	System.out.println(loginid);
	
	//	System.out.println("회원 정보를 입력하세요 : ");
		System.out.println();
		System.out.println("사용할 ID 를 입력하세요  ");
		System.out.println("[영문자 숫자 혼합하여 8~12까지 입력하세요]");
		System.out.print(" :");
		avo.setId(asc.next());
		
		if(!OverlapID(avo)){
			System.out.println("중복이 된 아이디가 있습니다.");
			System.out.println("다른 아이디를 입력하세요");
			return;
		}
		if(!FormatIDCheck(avo)) {
			System.out.println("영문자 숫자혼합하여 8~12이내로 적어주세요");
			return;
		}
		System.out.println("사용할 패스워드를 입력하세요 ");
		System.out.print(" :");
		avo.setPassword(asc.next());
		//System.out.println("이름을 입력하세요 ");
		//System.out.print(" :");
		aclists.add(avo);
		filestore(aclists);
		
	}
	@Override
	public void filestore(List aclist) {
		
		Iterator ait =  aclist.iterator();
		AccountVO avo = (AccountVO)ait.next();
		accountfilename = avo.getId(); 
		try{	
			FileOutputStream fos = new FileOutputStream(accountmanagefilepath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(aclist);
			System.out.println("회원가입이 성공적으로 되었습니다");
		
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	@Override
	public void output() {	
		System.out.println("아직 로그인을 하지 않았습니다");
		System.out.println("로그인 먼저 하세요 !!!!");
	}
	@Override
	public void login() {
		
		AccountVO avo = new AccountVO();
		Iterator ait = aclists.iterator();
		System.out.print("아이디를 입력하세요 : ");
		avo.setId(asc.next());
		System.out.print("패스워드를 입력하세요 : ");
		avo.setPassword(asc.next());
		
		try{
			/*
			 * login - > id and password check 
			 */
			while(ait.hasNext()) {
				/*
				 * id 값 null 유무 체크 
				 */
				if(avo.getId().equals(null)) {
					System.out.println("아이디를 입력하세요");
					continue;
				}
				AccountVO asvo = (AccountVO)ait.next();
				if(asvo.getId().equals(avo.getId())) {
					if(asvo.getPassword().equals(avo.getPassword())) {
						loginid = avo.getId();
						setloginId(loginid);
						logincheck = true;
					}else {
						logincheck = false;
					}
				}
			}	
		} catch (Exception e) {
			System.out.println("입력한 아이디가 패스워드가 맞지 않습니다. ");
		}
	}
	
	public boolean OverlapID(AccountVO avo) {
		
		Iterator<AccountVO> ait = aclists.iterator();
		while(ait.hasNext()) {	
			AccountVO checkid = ait.next();
			if(checkid.getId().equals(avo.getId())) {
				return false;
			}
		}
		return true;
	}
	/* 1. 아이디 길이 체크 
	 * 2. 영문자 숫자 혼합 아이디 
	 */
	public boolean FormatIDCheck(AccountVO avo) {
		int charcounting=0;
		int numbercounting=0;
		// 아이디 길이 체크 
		if(avo.getId().length() < 8 || avo.getId().length()> 12) {
			return false;
		}
		//영문자 숫자자 혼합인지 체크 
		for (int i = 0; i < avo.getId().length(); i++) {
			
			if((avo.getId().charAt(i) >= 'a' && avo.getId().charAt(i) <= 'z')  || (avo.getId().charAt(i) >= 'A' && avo.getId().charAt(i) <= 'Z') ) {
				charcounting++;
			}
			if((avo.getId().charAt(i) >= '1' && avo.getId().charAt(i) <= '9')) {
				numbercounting++;
			}
		}
		if(charcounting == avo.getId().length() || numbercounting == avo.getId().length()) {
			return false;
		}
		return true;
	}
	
	public boolean loginSuccess() {
		if(!logincheck) {
			System.out.println("아이디와 패스워드가 일치하지않습니다. ");
			
		}else {	
			System.out.println();
			System.out.println("     "+getloginId() +"님 안녕하세요     ");
			System.out.println("=======================================");
		
		}
		return logincheck;
	}
	public String  loginidmigration(String loginid) {
		loginid  = getloginId();
		return loginid;
	}
}


































//회원검색 기능 주석처리 
/*
	public void searchAccount() {
		
		String searchname = asc.next();
		System.out.print("찾을 ID를 입력하세요");
		
		try {	
			FileInputStream fis = new FileInputStream(accountfilepath+searchname+".txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			AccountVO avo = new AccountVO();
			Iterator ait = aclists.iterator();
			
			try {
				while(ait.hasNext()) {
					aclists = (List<AccountVO>)ois.readObject();
					avo = (AccountVO)ait.next();
					if(ait.next() == null) {
						break;
					}	
					System.out.println(avo.toString());
				}				
			}catch (Exception e) {
				System.out.println(e.toString());
			}
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println("사용자를 찾을수가 없습니다.");
		}
	}
 */