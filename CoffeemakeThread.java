package com.JavaProject;

import javax.swing.plaf.synth.SynthSplitPaneUI;

class MakeCoffee1 extends Thread{
	@Override
	public void run() {
		System.out.println();
		System.out.println();
		try {
			System.out.println();
			System.out.println();
			/*
			 * »¡´ë º° 
			 */
			for (int i = 0; i < 8; i++) {				
				for (int j = 0; j <i;j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <3;j++) {
					System.out.print("#");
					sleep(30);
				}
				System.out.println();
			}
			/*
			 * ¶Ñ°Ï º° 
			 */
			for (int i = 0; i < 8; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i <17;  i++) {
				System.out.print("$");
				sleep(30);
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <17;  i++) {
				System.out.print(" ");
				sleep(30);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i <6; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <19;  i++) {
				System.out.print(" ");
				sleep(30);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <21;  i++) {
				System.out.print(" ");
				sleep(20);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i < 23; i++) {
				System.out.print(" ");
				sleep(20);
			}
			System.out.print("$");
			System.out.println();
			/*
			 * ¾ç¿· ÄÉÀÌ½º 
			 */
			System.out.print(" ");
			for (int j = 0; j <= 1; j++) {
				System.out.print(" ");
				sleep(30);
			}
			//System.out.print("*");
			for (int j = 0; j <27; j++) {
				System.out.print("$");
				sleep(30);
			}
			//System.out.print("*");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i < 23; i++) {
				System.out.print(" ");
				sleep(30);
			}
			System.out.print("$");
			System.out.println();
		}catch (Exception e) {
			System.out.println(e.toString());
		}

	}
		
}


class MakeCoffee2 extends Thread{

	@Override
	public void run() {

		try {
		
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(" ");
				}
				System.out.print("$");
				
				for (int j = 0; j <= 20; j++) {
					System.out.print("*");
				}
				System.out.print("$");	
				sleep(20);
				System.out.println();
			}
			
		}catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
}
class MakeCoffee3 extends Thread{
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 23; i++) {
			System.out.print("$");
			sleep(50);
			}
			System.out.println();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
class BodyThread extends Thread{
	
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 15; i++) {
				sleep(50);
				System.out.print("*");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}

class MakeCoffee4 extends Thread{

	@Override
	public void run() 	{
		
		System.out.print("\n\nÀ½·á Á¦Á¶Áß");

		for(int i=0;i<=16;i++) {	
			System.out.print("*¨¬");

			try {

				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Iloveseoul extends Thread{
	@Override
	public void run() {
		
		try {
			
			System.out.println();
			System.out.println(":::::::::::      :::   :::        ::::::::    ::::::::::   :::    :::    ::::::::    :::       ");        
			sleep(150);
			System.out.println("    :+:       :+:   :+:   :+:    :+:    :+:   :+: :+:      :+:    :+:   :+:    :+:   :+:       ");        
			sleep(150);
			System.out.println("    +:+      +:+     +     +:+   +:+          +:+          +:+    +:+   +:+    +:+   +:+       ");        
			sleep(150);
			System.out.println("    +#+       +#+         +:+    +#++:++#++   +#++:++#     +#+    +:+   +#+    +:+   +#+       ");        
			sleep(150);
			System.out.println("    +#+         +#+      +#+            +#+   +#+          +#+    +#+   +#+    +#+   +#+       ");        
			sleep(150);
			System.out.println("    #+#           #+#+#+#        #+#    #+#   #+#          #+#    #+#   #+#    #+#   #+#       ");        
			sleep(150);
			System.out.println(" ###########        ###           ########    ##########    ########     ########    ##########"); 
			
		/*	System.out.println("d888888b   d8b    d8b   .d8888. d88888b db    db  .d88b.  db      ");      
			sleep(150);
			System.out.println("  '88'    88  'YP'  88  88'  YP 88'     88    88 .8P  Y8. 88      ");      
			sleep(150);
			System.out.println("   88     Y8        8P  `8bo.   88ooooo 88    88 88    88 88      ");     
			sleep(150);
			System.out.println("   88      `8b    d8'     `Y8b. 88~~~~~ 88    88 88    88 88      ");    
			sleep(150);
			System.out.println("  .88.      `8b  d8'    db   8D 88.     88b  d88 `8b  d8' 88booo. ");
			sleep(150);
			System.out.println("Y888888P       YP       `8888Y' Y88888P ~Y8888P'  `Y88P'  Y88888P ");*/
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
}
class Cafeicon extends Thread{
	@Override
	public void run() {
		try {
			
			System.out.println(" ::::::::        :::       ::::::::::   ::::::::::  ");
			sleep(150);
			System.out.println(":+:    :+:     :+: :+:     :+:          :+:         ");    
			sleep(150);
			System.out.println("+:+           +:+   +:+    +:+          +:+         ");    
			sleep(150);
			System.out.println("+#+          +#++:++#++:   :#::+::#     +#++:++#    ");   
			sleep(150);
			System.out.println("+#+          +#+     +#+   +#+          +#+         ");  
			sleep(150);
			System.out.println("#+#    #+#   #+#     #+#   #+#          #+#         ");  
			sleep(150);
			System.out.println(" ########    ###     ###   ###          ##########  ");
			System.out.println();
			System.out.println();
			System.out.print("¼­¿ï Ä«Æä¸¦ Å½»öÇÕ´Ï´Ù. ");
			for (int i = 0; i < 15; i++) {
				System.out.print(".");
				sleep(150);
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
class Cakeicon extends Thread{
	@Override
	public void run() {
		
		try {
			System.out.println();
			System.out.println("                     ,~~  .              ");
			sleep(50);
			System.out.println("                    .:-~;:-:             ");
			sleep(50);
			System.out.println("                   .;-,~~----            ");
			sleep(50);
			System.out.println("                  .;--,-::,~~            ");
			sleep(50);
			System.out.println("                 .!~----:! -~            ");
			sleep(50);
			System.out.println("                 ,*~,,,,~- :~            ");
			sleep(50);
			System.out.println("                ,~;--,--~,.!;            ");
			sleep(50);
			System.out.println("              .-,,~:~,--:-;;:~.          ");
			sleep(50);
			System.out.println("             .~. :..*;:;;*;-!.~,         ");
			sleep(50);
			System.out.println("            ,~   ...  ~. ,.,-  --        ");
			sleep(50);
			System.out.println("           ,-    .---  , ,--..,,!        ");
			sleep(50);
			System.out.println("          ~,      ..,~~-~-,:~,,.:        ");
			sleep(50);
			System.out.println("         :             .~:~-::;.~.       ");
			sleep(50);
			System.out.println("       .~         .,,-:~-~~,. -.~        ");
			sleep(50);
			System.out.println("      ,-       ,---~:~-,,. ..,;.:        ");
			sleep(50);
			System.out.println("     --    .~:~-:::-... ..-:~-;.;        ");
			sleep(50);
			System.out.println("    --..,::~-~:-..  ...-::-~~~;.;        ");
			sleep(50);
			System.out.println("   -:-:::---,. ...---::~--,...; :        ");
			sleep(50);
			System.out.println("   ~:~,,,.  ..,~~~::~-,... .,~! ~        ");
			sleep(50);
			System.out.println("   .,......~::~~:~..  ...-;:~~* ~        ");
			sleep(50);
			System.out.println("   .-,,-~::--~-.....---::~-~-,! -        ");
			sleep(50);
			System.out.println("   ,~~::~-,,.  .,~~-~:~-,,. ..*~,        ");
			sleep(50);
			System.out.println("   ,:,....  ..~:-~::,..   ,::~.          ");
			sleep(50);
			System.out.println("   .. ..,,,~::~~~,....,,-~-              ");
			sleep(50);
			System.out.println("   ,----~:~---,. ..----,.                ");
			sleep(50);
			System.out.println("   ,::::-,.. ..,:~~..                    ");
			sleep(50);
			System.out.println("   ,-..  ...,::-                         ");
			sleep(50);
			System.out.println("   .,.,,----,                            ");
			sleep(50);
			System.out.println("   .:-,..                                ");
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
