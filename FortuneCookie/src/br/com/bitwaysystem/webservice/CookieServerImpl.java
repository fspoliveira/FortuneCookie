package br.com.bitwaysystem.webservice;

import javax.jws.WebService;

import br.com.bitwaysystem.bean.Cookie;
import br.com.bitwaysystem.dao.CookieDao;
//import br.com.bitwaysystem.webservice.CookieServer;
import br.com.bitwaysystem.dao.CookieDaoImpl;


@WebService(endpointInterface = "br.com.bitwaysystem.webservice.CookieServer")
public class CookieServerImpl implements CookieServer {

	private CookieDao cookies = new CookieDaoImpl();	

	@Override
	public Cookie retrieveCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		return cookies.retrieveCookie(cookie);
	}

}
