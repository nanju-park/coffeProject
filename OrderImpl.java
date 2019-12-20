package com.JavaProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderImpl implements Order {

	private static final long serialVersionUID = 1L;
	
	List<OrderVO> lists = new ArrayList<OrderVO>();
	Scanner sc = new Scanner(System.in);

	String m1 = "americano"; 			//�Ƹ޸�ī��
	String m2 = "caffeaate"; 			//ī���
	String m3 = "cappuccino"; 	        //īǪġ��
	String m4 = "redvelvetcake"; 		//���座��
	String m5 = "tiramisu";				//Ƽ��̽�
	
	List<OrderVO> priceList = new ArrayList<OrderVO>();
	List storelist = new ArrayList();
	StoreInfo info = new StoreInfo();
	
	String storeid;
	String storename;
	String storewhere;
	int tot = 0;
	//2.�޴��� ���� ���̱�
	@Override
	public void order() {
		
		ButtonClass btn = new ButtonClass();
		OrderVO vo = new OrderVO();
		System.out.println();
		System.out.println("��������������������������������");
		System.out.println("���� �����ֹ� ��������ũ �ֹ� ��");
		System.out.println("��������������������������������");
		System.out.print("�޴����� �������ּ��� : ");
		int o = sc.nextInt();

		if(o==1) {
			//�ֹ� �޴� ����
			//System.out.println("\n������� �������ּ���! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "�� �����ϼ̽��ϴ�");		
			//System.out.println("\n����� �����ϼ���! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"�� �����ϼ̽��ϴ�");
			//System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "�� �����ϼ̽��ϴ�");
			System.out.println();
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
			vo.setSu(sc.nextInt());

			//���� �κ�
			//���� ��Ʈ���� �����ص� ��Ʈ���� ������ vo�� �ش��ϴ� �� �߰�?\
			//����: if������ ���� ��Ʈ���� �޴��� �ִ� ��Ʈ�� ���� ������ ���? ������?
			//���� �ٸ��� ������ �ٽ� ��޶�� �޼���? ����

			if(vo.getDrink().equals(m1)) { //�Ƹ޸�ī��
				//���� �߰� ����
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPriceAme(vo.getSu());
			}else if(vo.getDrink().equals(m2)) {//ī���
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceCafe(vo.getSu());
			}else { //īǪġ��
				//vo.setPrice(3500*vo.getSu());
				vo.setPriceCapu(vo.getSu());
			}
			lists.add(vo);
			//����?�� ����..?
			System.out.println();
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ��Ϸ� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴����� �������ּ��� : ");

			int resu = sc.nextInt();

			if(resu==1) {
				reOrder();
			}
			else if(resu==2) {
				chul();
				payMent();
				chul2();
			}
			else if(resu==3) {
				cancel();
			}
		}
		else if(o==2) {

			vo.setSetmakecake(btn.cake());
			//System.out.println("����ũ�� �������ּ���! ");

			System.out.println();
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
			vo.setSu(sc.nextInt());

			if(vo.getSetmakecake().equals(m4)) {
				vo.setPriceredcake(vo.getSu());
			}else {
				vo.setPricetiracake(vo.getSu());
			}
			lists.add(vo);
			System.out.println();
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ��Ϸ� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴����� �������ּ��� : ");
			System.out.println();
			int resu = sc.nextInt();
		
			if(resu==1) {
				reOrder();
			}
			else if(resu==2) {
				chul();
				payMent();			
				chul2();
			}
			else if(resu==3) {
				cancel();
			}
		}
	}
	@Override
	public void reOrder() {

		System.out.println();
		System.out.println("��������������������������������");
		System.out.println("���� �����ֹ� ��������ũ �ֹ� ��");
		System.out.println("��������������������������������");
		System.out.print("�޴��� �������ּ��� : ");
		int o = sc.nextInt();

		OrderVO vo = new OrderVO();
		ButtonClass btn = new ButtonClass();

		if(o==1) {
			//System.out.println("\n������� �������ּ���! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "�� �����ϼ̽��ϴ�");		
			//System.out.println("\n����� �����ϼ���! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"�� �����ϼ̽��ϴ�");
			//System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "�� �����ϼ̽��ϴ�");
			System.out.println();
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
			vo.setSu(sc.nextInt());

			if(vo.getDrink().equals(m1)) { 
				//���� �߰� ����
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPriceAme(vo.getSu());
			}else if(vo.getDrink().equals(m2)) {
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceCafe(vo.getSu());
			}else{ 
				//vo.setPrice(3500*vo.getSu());
				vo.setPriceCapu(vo.getSu());
			}
			lists.add(vo);
		}else if(o==2) {
			vo.setSetmakecake(btn.cake());
			System.out.println();
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
			vo.setSu(sc.nextInt());
			if(vo.getSetmakecake().equals(m4)) {
				vo.setPriceredcake(vo.getSu());
			}else{
				vo.setPricetiracake(vo.getSu());
			}
			lists.add(vo);
		}else{
			System.out.println("�߸����� �Ͽ����ϴ� ");
			return;
		}

		System.out.println();	
		System.out.println("��������������������������������������������");
		System.out.println("���� �߰��ֹ� ���� �ֹ��Ϸ� ���� �ֹ���� ��");
		System.out.println("��������������������������������������������");
		System.out.print("�޴����� �������ּ��� : ");

		while(true) {
			//System.out.print("  ");
			int resu = sc.nextInt();
			if(resu==1) {
				reOrder();
				break;
			}
			else if(resu==2) {
				chul();
				payMent();
				chul2();
				break;
			}
			else if(resu==3){
				cancel();
				break;
			}else {

			}System.out.println("�߸��Է��Ͽ����ϴ� ");
		}
	}

	public void payMent() {

		while(true) {


			System.out.println("������ ���� �帱��� ? ");
			System.out.println();
			System.out.println("����������������������");
			System.out.println("���� �� ���� �ƴϿ� ��");
			System.out.println("����������������������");
			System.out.print(" : ");
			int payMent = sc.nextInt();
			if(payMent==1) {
				break;
			}
			else if(payMent==2) {
				reOrder();
				break;
			}else {
				System.out.println("�߸������Ͽ����ϴ�");
			}		
		}
	}

	@Override
	public void cancel() {
		//���
		System.out.println("�ֹ� �ý����� �����մϴ�");
		System.exit(0);
	}
	@Override
	public void menu() {
		//�޴� �κ�
		for (int i = 0; i < 2; i++) {

			System.out.println();
		}
		System.out.println("\t\t  	         ��MENU��						");
		System.out.println(" ��--------------------------------------------------------------------��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��    ��Coffee��           Americano     : 2,500��                    ��");
		System.out.println(" ��                                                                    ��"); 
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                         Caffe Late    : 3,000��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                         Cappuccino    : 3,000��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��    ��Cake��             RedvelvetCake : 3,000��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                         Tiramisu	  : 5,000��	                   ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��--------------------------------------------------------------------��");

	}

	@Override
	public void chul() {
		
		//������ ���?
		//price���� ���ϱ�? ���� �޴��϶� ������ int ���� ���ϱ�
		//������ ���� ���ݺ���
		//����Ʈ �״�� ����ϱ�!!
		//�迭�� �� ���� ���
		//int tot = 0;
		Iterator<OrderVO> ov = lists.iterator();

		System.out.println();
		System.out.println("===========================================");
		System.out.println("               ���� ���� Ȯ��               ");
		System.out.println("-------------------------------------------");
		System.out.println();
		
		while(ov.hasNext()) {
			OrderVO vo = ov.next();	
			System.out.println(vo.toString());
			tot += vo.getTot();
			System.out.println();
		}
		System.out.println();
		System.out.println("===========================================");
		System.out.println("�� �� : "+tot);
		System.out.println("===========================================");
		System.out.println();
		//���� ��� �κ�
		//if(����ũ) { ���� price} + if(����) { ���� price} => �����ϳ��� �༭ ���?
	}
	public void chul2() {
		Iterator<OrderVO> ov = lists.iterator();

		storeid=readstoreid(storeid);
		storename=readstorename(storename);
		storewhere=readstorewhere(storewhere);
		
		System.out.println();
		
		System.out.println("===========================================");
		System.out.println("               ������		               ");
		System.out.println();
		System.out.println("             "+storename);
		System.out.println();
		System.out.println(storewhere);
		System.out.println("                                         ");
		System.out.println("                                         ");
		System.out.printf( "  %1$tF                   %1$tT \n", Calendar.getInstance());
		System.out.println("-------------------------------------------");
		System.out.println();
		
		while(ov.hasNext()) {
			OrderVO vo = ov.next();	
			
			System.out.print(vo.toString());
			//if(vo.getDrink().equals(m1)) {
			/*	System.out.println("............ "+vo.getPriceAme());
			}else if(vo.getDrink().equals(m2)) {
				System.out.println("............ "+vo.getPriceCafe());
			}else if(vo.getDrink().equals(m3)) {
				System.out.println("............ "+vo.getPriceCapu());
			}else if(vo.getDrink().equals(m4)) {
				System.out.println("............ "+vo.getPriceredcake());
			}else {
				System.out.println("............ "+vo.getPricetiracake());
			}
*/			System.out.println();
		}
		System.out.println("===========================================");
		System.out.println("�� ���űݾ� : "+tot);
		System.out.println("===========================================");
		System.out.println("	�̿����ּż� �����մϴ�        		   ");
		System.out.println("===========================================");
		System.out.println();
		
		//���� ��� �κ�
		//if(����ũ) { ���� price} + if(����) { ���� price} => �����ϳ��� �༭ ���?
	}
	public void MakeCoffee() {
		MakeCoffee1 mc1= new MakeCoffee1();
		MakeCoffee2 mc2= new MakeCoffee2();
		MakeCoffee3 mc3= new MakeCoffee3();
		MakeCoffee4 mc4= new MakeCoffee4();
		BodyThread bt1 = new BodyThread();
		Cakeicon cakethread = new Cakeicon();

		Iterator<OrderVO> oit = lists.iterator();

		boolean countingdrink = false;
		boolean countingcake = false;

		while(oit.hasNext()) {

			OrderVO ov = oit.next();

			if(ov.getDrink() != null && ov.getSetmakecake() == null) {
				countingdrink = true;
			}else if(ov.getSetmakecake() != null && ov.getSetmakecake() != null) {
				countingcake = true;
			}else {
				countingdrink = true;
				countingcake = true;
			}
		}
		if(countingdrink && !countingcake) {
			try {
				mc4.start();
				mc4.join();

				mc1.start();
				mc1.join();

				mc2.start();
				mc2.join();

				mc3.start();
				mc3.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("\n\n�ڡ����ᰡ �غ� �Ǿ����ϴ�!�ڡ�\n\n");
		}else if(countingcake && !countingdrink) {

			try {
				cakethread.start();
				cakethread.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("\n\n�ڡ�����ũ�� �غ� �Ǿ����ϴ�!�ڡ�\n\n");
		}else {
			try {
				mc4.start();
				mc4.join();

				mc1.start();
				mc1.join();

				mc2.start();
				mc2.join();

				mc3.start();
				mc3.join();

				cakethread.start();
				cakethread.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("\n\n�ڡ������ ������ �غ� �Ǿ����ϴ�!�ڡ�\n\n");
		}
	}
	public String readstoreid(String storeid) {
		
		try {
			FileInputStream fis = new FileInputStream("d:\\project\\store.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			
			storelist = (List)oos.readObject();
			
			Iterator<StoreInfo> storeit = storelist.iterator();
			
			while(storeit.hasNext()) {
				
				StoreInfo sif = storeit.next();
				storeid = sif.getStoreid();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return storeid;
		
	}
	public String readstorename(String storename) {
			
			try {
				FileInputStream fis = new FileInputStream("d:\\project\\store.txt");
				ObjectInputStream oos = new ObjectInputStream(fis);
				storelist = (List)oos.readObject();
				Iterator<StoreInfo> storeit = storelist.iterator();
				
				while(storeit.hasNext()) {
					
					StoreInfo sif = storeit.next();
					storename = sif.getStorename(); 
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return storename;
		}
	public String readstorewhere(String storewhere) {
		
		try {
			FileInputStream fis = new FileInputStream("d:\\project\\store.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			storelist = (List)oos.readObject();
			Iterator<StoreInfo> storeit = storelist.iterator();
			
			while(storeit.hasNext()) {
				
				StoreInfo sif = storeit.next();
				storewhere = sif.getStorewhere(); 
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return storewhere;
	}
}

class ButtonClass {

	Scanner sc = new Scanner(System.in);
	public String coffee() {

		System.out.println();
		System.out.println("��---------------------------��");
		System.out.println("��(a) Americano              ��");
		System.out.println("��(b) Caffe Late             ��");
		System.out.println("��(c) Cappuccino             ��");
		System.out.println("��---------------------------��");
		String coffee = null;
		while(true) {

			System.out.print("���Ḧ �������ּ��� : ");
			coffee = sc.next();
			String[] menu = {"a","b","c"};

			if(coffee.equals(menu[0])) {
				coffee = "americano";
				break;
			}else if(coffee.equals(menu[1])) {
				coffee = "caffeaate";
				break;
			}else if(coffee.equals(menu[2])) {
				coffee = "cappuccino ";
				break;
			}else{
				System.out.println("�޴��� �ٽ� ������ �ּ���");
				continue;
			}
		}
		return coffee;
	}

	public String cake() {
		System.out.println();
		System.out.println("��---------------------------��");
		System.out.println("��(a) redvelvetcake          ��");
		System.out.println("��(b) tiramisu               ��");
		System.out.println("��---------------------------��");
		System.out.println();
		String cake = null;

		while(true) {
			System.out.print("����ũ�� �������ּ��� : ");
			cake = sc.next();
			String[] menu = {"a","b"};
			if(cake.equals(menu[0])) {
				cake = "redvelvetcake";
				break;
			}else if(cake.equals(menu[1])){
				cake = "tiramisu";
				break;
			}else{
				System.out.println("�߸��Է��Ͽ����ϴ� ");
				System.out.println();
				continue;
			}
		}
		return cake;
	}
	public String Size() {

		String size = null;	
		System.out.println();
		System.out.println("��---------------------------��");
		System.out.println("��(a) Regular                ��");
		System.out.println("��(b) Large                  ��");	
		System.out.println("��---------------------------��");

		while(true) {
			System.out.print("����� �������ּ��� : ");
			String[] menu = {"a","b"};
			size = sc.next();
			if(size.equals(menu[0])) {
				size = "R";
				break;
			}
			if(size.equals(menu[1])) {
				size = "L";
				break;
			}else {
				System.out.println("�߸��Է��Ͽ����ϴ� ");
				System.out.println();
				continue;
			}
		}
		return size;
	}
	public String temperature() {

		String temperature = null;	
		System.out.println();
		System.out.println("��---------------------------��");
		System.out.println("��(a) ice                    ��");
		System.out.println("��(b) hot                    ��");	
		System.out.println("��---------------------------��");

		while(true) {
			System.out.print("�µ��� �������ּ��� : ");
			String[] menu = {"a","b"};
			temperature = sc.next();
			if(temperature.equals(menu[0])) {
				temperature = "ice";
				break;
			}else if(temperature.equals(menu[1])) {
				temperature = "hot";
				break;
			}else {
				System.out.println("�߸��Է��Ͽ����ϴ� ");
				continue;
			}
		}
		return temperature;
	}


}

