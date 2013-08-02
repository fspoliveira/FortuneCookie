package br.com.bitwaysystem.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.bitwaysystem.bean.Cookie;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CookieServer {
	@WebMethod Cookie retrieveCookie(Cookie cookie);	
}
