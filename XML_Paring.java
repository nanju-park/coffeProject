package com.JavaProject;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XML_Paring {

		public String[] seoulcoffeeparing(String[] seoulcoffee) {
		
		try {
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			Document xmlDoc1 = null;
			Document xmlDoc2 = null;
			
			String key = "434a45646674623038316472435579";
			//출력할 리스트 갯수 
			String listCount1 = "1000";
			String listCount2 = "1557";
			//값을 가저올 프로그램 
			String url1 = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1/"+listCount1;
			String url2 = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1000/"+listCount2;
			/*
			 * 1번 커피숍부터터 1000번 커피솝 까지
			 */
			if(url1.indexOf("http://") != -1) {
				URL u1 = new URL(url1);
				InputStream is1 = u1.openStream();
				xmlDoc1 = parser.parse(is1);
			}else {
				xmlDoc1 = parser.parse(url1);
			}
			if(url2.indexOf("http://") != -1) {
				URL u2 = new URL(url2);
				InputStream is2 = u2.openStream();
				xmlDoc2 = parser.parse(is2);
			}else {
				xmlDoc2 = parser.parse(url2);
			}
			;
			seoulcoffee = new String[1558];

			Element root1 = xmlDoc1.getDocumentElement();		
			NodeList nmlist1 = root1.getElementsByTagName("NM");
			
			Element root2 = xmlDoc2.getDocumentElement();		
			NodeList nmlist2 = root2.getElementsByTagName("NM");
			
			for (int i = 0; i < seoulcoffee.length; i++) {
				
				if(i >=0 && i<1000) {
					Node node1 = nmlist1.item(i);
					
					seoulcoffee[i]  = node1.getFirstChild().getNodeValue();	
				
				}else {
					Node node2 = nmlist2.item(i-1000);
					seoulcoffee[i]  = node2.getFirstChild().getNodeValue();
				}
			}	
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
		return seoulcoffee;
	}
		
		public String[] seoulwhereparing(String[] seoulwhere) {
			
			try {
				DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
				DocumentBuilder parser = f.newDocumentBuilder();
				Document xmlDoc1 = null;
				Document xmlDoc2 = null;
				
				
				String key = "434a45646674623038316472435579";
				
				//출력할 리스트 갯수 
				String listCount1 = "1000";
				String listCount2 = "1557";
				//값을 가저올 프로그램 
				String url1 = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1/"+listCount1;
				String url2 = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1000/"+listCount2;
				/*
				 * 1번 커피숍부터터 1000번 커피솝 까지
				 */
				if(url1.indexOf("http://") != -1) {
					URL u1 = new URL(url1);
					InputStream is1 = u1.openStream();
					xmlDoc1 = parser.parse(is1);
				}else {
					xmlDoc1 = parser.parse(url1);
				}
				if(url2.indexOf("http://") != -1) {
					URL u2 = new URL(url2);
					InputStream is2 = u2.openStream();
					xmlDoc2 = parser.parse(is2);
				}else {
					xmlDoc2 = parser.parse(url2);
				}
				
				seoulwhere = new String[1558];
				
				Element root1 = xmlDoc1.getDocumentElement();		
				Element root2 = xmlDoc2.getDocumentElement();		
	
				NodeList wherelist1 = root1.getElementsByTagName("ADDR_OLD");
				NodeList wherelist2 = root2.getElementsByTagName("ADDR_OLD");
				
				for (int i = 0; i < seoulwhere.length; i++) {	
					if(i >=0 && i<1000) {
						Node node1 = wherelist1.item(i);
						Node seoulwherenode1 = wherelist1.item(i);
					
						seoulwhere[i] = seoulwherenode1.getFirstChild().getNodeValue();
					}else {
						Node seoulwherenode2 = wherelist2.item(i-1000);	
						seoulwhere[i] = seoulwherenode2.getFirstChild().getNodeValue();
					}
				}	
			} catch (Exception e) {
				System.out.println(e.toString());
			}		
			return seoulwhere;
		}
		

		public String[] seoulidparing(String[] seoulid) {
		
		try {
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			Document xmlDoc1 = null;
			Document xmlDoc2 = null;
			
			String key = "434a45646674623038316472435579";
			//출력할 리스트 갯수 
			String listCount1 = "1000";
			String listCount2 = "1557";
			//값을 가저올 프로그램 
			String url1 = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1/"+listCount1;
			String url2 = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1000/"+listCount2;
			/*
			 * 1번 커피숍부터터 1000번 커피솝 까지
			 */
			if(url1.indexOf("http://") != -1) {
				URL u1 = new URL(url1);
				InputStream is1 = u1.openStream();
				xmlDoc1 = parser.parse(is1);
			}else {
				xmlDoc1 = parser.parse(url1);
			}
			if(url2.indexOf("http://") != -1) {
				URL u2 = new URL(url2);
				InputStream is2 = u2.openStream();
				xmlDoc2 = parser.parse(is2);
			}else {
				xmlDoc2 = parser.parse(url2);
			}
			;
			seoulid = new String[1558];

			Element root1 = xmlDoc1.getDocumentElement();		
			NodeList nmlist1 = root1.getElementsByTagName("ID");
			
			Element root2 = xmlDoc2.getDocumentElement();		
			NodeList nmlist2 = root2.getElementsByTagName("ID");
			
			for (int i = 0; i < seoulid.length; i++) {
				
				if(i >=0 && i<1000) {
					Node node1 = nmlist1.item(i);
					
					seoulid[i]  = node1.getFirstChild().getNodeValue();	
				
				}else {
					Node node2 = nmlist2.item(i-1000);
					seoulid[i]  = node2.getFirstChild().getNodeValue();
				}
			}	
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
		return seoulid;
	}
}











/*for (int i = 0; i < seoulcoffee.length; i++) {
				System.out.println(i+" : "+seoulcoffee[i]+seoulwhere[i]);
			}	*/
/*	
 * for (int i = 0; i < nmlist.getLength(); i++) {
				Node node1 = nmlist.item(i);
				//Node node2 = wherelist.item(i);
				out1[i] = node1.getFirstChild().getNodeValue();	
				//out2[i] = node2.getFirstChild().getNodeValue();
				//System.out.println(out1);
				//System.out.println(out1[i]+" :  "+out2[i]);	
			}
 */
/*
			for (int i = 0; i < nmlist2.getLength(); i++) {
				Node node1 = nmlist2.item(i);
				//Node node2 = wherelist.item(i);
				out2[i] = node1.getFirstChild().getNodeValue();	
				//out2[i] = node2.getFirstChild().getNodeValue();
				System.out.println(out2[i]);
				//System.out.println(out1[i]+" :  "+out2[i]);	
			}*/