package com.JavaProject;

import java.io.Serializable;

public class OrderVO implements Serializable{

	private static final long serialVersionUID = 1L;

	//ī�� �ֹ� ����
	private String drink; //���� ����
	private String size; //������
	private String mode; //HOT/ICE
	private int su; //����
	private int price;
	private int tot;
	private int priceCafe;//ī���
	private int priceAme;//�Ƹ޸�ī�� ���� 
	private int priceCapu;//īǪġ��
	private int priceredcake;
	private int pricetiracake;
	private String setmakecake;
	
	public String getSetmakecake() {
		return setmakecake;
	}
	public int getPriceCafe() {
		return priceCafe;
	}
	public void setPriceCafe(int priceCafe) {
		this.priceCafe = 3000*priceCafe;
	}
	public int getPriceAme() {
		return priceAme;
	}
	public void setPriceAme(int priceAme) {
		this.priceAme = 2500*priceAme;
	}
	public int getPriceCapu() {
		return priceCapu;
	}
	public void setPriceCapu(int priceCapu) {
		this.priceCapu = 3000*priceCapu;
	}
	public void setSetmakecake(String setmakecake) {
		this.setmakecake = setmakecake;
	}
	public int getPriceamea() {
		return priceCafe;
	}	
	public int getPriceredcake() {
		return priceredcake;
	}
	public void setPriceredcake(int priceredcake) {
		this.priceredcake = 3000*priceredcake;
	}
	public int getPricetiracake() {
		return pricetiracake;
	}
	public void setPricetiracake(int pricetiracake) {
		this.pricetiracake = 5000*pricetiracake;
	}
	public int getTot() {	
		tot += priceCafe+priceAme+priceCapu+priceredcake+pricetiracake;
		return tot;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	@Override
	public String toString() { 
		//���� ����ũ��, ����ũ�� �� �̷��� ����
		if(size==null || mode==null) {
			return String.format("%s %dea ", setmakecake, su);
		}
		if(setmakecake == null) {
			return String.format("%s %s %s %dea",drink, size, mode, su);	
		}else if (drink == null) {
			return String.format("%s %s %s %dea",setmakecake, size, mode, su);
		}else {
			return String.format("%s %s %s %s %dea",drink,setmakecake, size, mode, su);
		}
		
	}
}
