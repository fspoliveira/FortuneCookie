package br.com.bitwaysystem.dao;

import java.util.List;

import br.com.bitwaysystem.bean.Cookie;

public interface CookieDao {

	public void storeCookie(Cookie cookie);
	public  void retrieveAllCookies();
}