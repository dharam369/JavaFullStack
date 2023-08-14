package com.techlabs.facadedesignpattern;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indianhotel=new IndianHotel();
		IMenu indianmenu=indianhotel.getMenu();
		indianmenu.displayMenu();
	}
	public void getItalianMenu() {
		IHotel italianhotel=new ItalianHotel();
		IMenu italianmenu=italianhotel.getMenu();
		italianmenu.displayMenu();
	}
	public void getChineseMenu() {
		IHotel chinesehotel=new ChineseHotel();
		IMenu chinesemenu=chinesehotel.getMenu();
		chinesemenu.displayMenu();
	}
	
}
