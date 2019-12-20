package com.JavaProject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AccountMain implements Serializable{
		

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		StoreInfo info = new StoreInfo();
		
		List storelist = new ArrayList();
		
		String[] seoulcoffee = new String[1558];
		String[] seoulwhere = new String[1558];
		String[] seoulid = new String[1558];
		
		Iloveseoul seoul = new Iloveseoul();
		
		AccountImpl aim = new AccountImpl();
		OrderMain omain = new OrderMain();
		Scanner sc = new Scanner(System.in);
		Cafeicon cafeicon = new Cafeicon();
		
		Random rd = new Random();
		int shopindex;
		shopindex = rd.nextInt(1557)+1;
		
		try {
			seoul.start();
			seoul.join();
			cafeicon.start();
			cafeicon.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		XML_Paring xml = new XML_Paring();
		seoulcoffee = xml.seoulcoffeeparing(seoulcoffee);
		seoulwhere = xml.seoulwhereparing(seoulwhere);
		seoulid  = xml.seoulidparing(seoulid);
		
		info.setStoreid(seoulid[shopindex]);
		info.setStorename(seoulcoffee[shopindex]);
		info.setStorewhere(seoulwhere[shopindex]);
		
		storelist.add(info);
		try {
			FileOutputStream fis = new FileOutputStream("d:\\project\\store.txt");
			ObjectOutputStream ois = new ObjectOutputStream(fis);
			ois.writeObject(storelist);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		int menu =0;

		System.out.println();
		System.out.println("ī�� ��ȣ : "+seoulid[shopindex]);
		System.out.println("ī�� �̸� : "+seoulcoffee[shopindex]);
		System.out.println("ī�� ��ġ : "+seoulwhere[shopindex]);
		System.out.println();
		//System.out.println(""+"�ȳ��ϼ��� "+"============");	
		System.out.println("==========�ȳ��ϼ��� "+seoulcoffee[shopindex]+"�Դϴ�.===========");	
		
		while(true) {		
			//System.out. println("1. ȸ������ \n2. �α��� \n3. �޴� \n4. �ֹ��ϱ� \n5. ���� \n6. ���ݱ��� �ֹ��� ���� ");
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("���� ȸ������ ���� �α��� ���� �ֹ� ���� ���� ��");
			System.out.println("������������������������������������������������");
			System.out.print("\n�޴����� �Է��ϼ��� : ");
			menu = sc.nextInt();
			switch(menu){
			case 1 :
				aim.input();break; 
			case 2 :	
				aim.login();
				//aim.loginidmigration(aim.getloginId());
				if(aim.loginSuccess()) {
					omain.ordermain((aim.loginidmigration(aim.getloginId())));
					break;	
				}else {
					System.out.println("�α��� ����");
					break;
				}
			case 3 :
				aim.output();continue;
			case 4 :
				System.exit(0);
			default:
				System.out.println("�޴��� �ٽ� ���� �ϼ��� ");
			}
		}
	}
}
