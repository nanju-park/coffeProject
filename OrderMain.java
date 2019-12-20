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
					System.out.println("┌──────┯──────┐");
					System.out.println("│① 주문하기 │ ② 결제하기│");
					System.out.println("└──────┻──────┘");
					//System.out.println();
					System.out.print("메뉴얼을 선택하세요 : ");
					ch = sc.nextInt();
				}while(ch<1);
				
				switch (ch) {
				case 1:
					ob.menu();
					ob.order();
					ordercheck= true;
				case 2:		
					if(!ordercheck) {
						System.out.println("아직 주문을 하지 않았습니다 ");
						System.out.println("주문을 해주세요 ");
						continue;
					}
					ob.MakeCoffee();
					System.out.println("이용해주셔서 감사합니다.");
					System.exit(0);
				default:
					System.exit(0);
			}
		}
	}		
}
