package com.JavaProject;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OrderMain {
		
	
		public OrderMain() {
		
		}
		public void ordermain(String loginid) {
				
			Scanner sc = new Scanner(System.in);
			OrderImpl ob = new OrderImpl();
			boolean ordercheck = false;
			int ch;
			
			while(true) {
				do { 				
					System.out.println("������������������������������");
					System.out.println("���� �ֹ��ϱ� �� �� �����ϱ⦢");
					System.out.println("������������������������������");
					//System.out.println();
					System.out.print("�޴����� �����ϼ��� : ");
					ch = sc.nextInt();
				}while(ch<1);
				
				switch (ch) {
				case 1:
					ob.menu();
					ob.order();
					ordercheck= true;
				case 2:		
					if(!ordercheck) {
						System.out.println("���� �ֹ��� ���� �ʾҽ��ϴ� ");
						System.out.println("�ֹ��� ���ּ��� ");
						continue;
					}
					ob.MakeCoffee();
					System.out.println("�̿����ּż� �����մϴ�.");
					System.exit(0);
				default:
					System.exit(0);
			}
		}
	}		
}
