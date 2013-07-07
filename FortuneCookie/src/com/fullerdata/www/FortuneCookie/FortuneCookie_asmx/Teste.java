package com.fullerdata.www.FortuneCookie.FortuneCookie_asmx;

import java.rmi.RemoteException;

public class Teste   {

	
	public static void main(String args[]){
		FullerData_x0020_Fortune_x0020_CookieSoapProxy fortuneCookie = new FullerData_x0020_Fortune_x0020_CookieSoapProxy();
		try {
			
			
			for(int i=0; i <fortuneCookie.countCookies() ; i++){
				System.out.println("Index: "+ i + " " + fortuneCookie.getSpecificCookie(i));
			}	
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}}	