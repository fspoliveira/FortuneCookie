package br.com.bitwaysystem.main;

import java.util.ArrayList;

import br.com.bitwaysystem.bean.Cookie;
import br.com.bitwaysystem.dao.CookieDaoImpl;

public class TestProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CookieDaoImpl cookieDaoImpl = new CookieDaoImpl();

		// cookieDaoImpl.retrieveAllCookies();

		Cookie cookie = new Cookie();
		cookie.setIndex(1);
		// cookie.setCookieMessage("cc");
		cookie = cookieDaoImpl.retrieveCookie(cookie);

		System.out.println(cookie.getCookieMessage());
		
		
		
		
	}

}
