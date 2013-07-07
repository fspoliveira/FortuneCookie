package br.com.bitwaysystem.main;

import java.rmi.RemoteException;
import br.com.bitwaysystem.bean.Cookie;
import br.com.bitwaysystem.dao.CookieDaoImpl;

import com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoapProxy;

public class ConsumerWS {

	private static CookieDaoImpl cookieDaoImpl = null;

	public static void main(String args[]) {
		FullerData_x0020_Fortune_x0020_CookieSoapProxy fortuneCookie = new FullerData_x0020_Fortune_x0020_CookieSoapProxy();
		try {

			// for(int i=0; i <fortuneCookie.countCookies() ; i++){
			for (int i = 0; i < 3; i++) {
				System.out.println("Index: " + i + " "
						+ fortuneCookie.getSpecificCookie(i));

				Cookie cookie = new Cookie(i,
						fortuneCookie.getSpecificCookie(i));

				cookieDaoImpl = new CookieDaoImpl();
				cookieDaoImpl.storeCookie(cookie);

			}
			cookieDaoImpl.retrieveAllCookies();

		} catch (RemoteException e) {
			// TODO Auto-gener.ated catch block
			e.printStackTrace();
		}
	}
}