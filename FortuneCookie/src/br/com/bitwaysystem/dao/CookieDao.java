package br.com.bitwaysystem.dao;

import br.com.bitwaysystem.bean.Cookie;

public interface CookieDao {

	public void storeCookie(Cookie cookie);
	public  void retrieveAllCookies();
	public Cookie retrieveCookie(Cookie cookie);
}