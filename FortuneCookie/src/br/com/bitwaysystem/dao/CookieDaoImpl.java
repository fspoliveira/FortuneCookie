package br.com.bitwaysystem.dao;

import java.util.List;

import javax.jws.WebService;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.foundation.Queue4;

import com.db4o.query.Query;

import br.com.bitwaysystem.db4o.Util;
import br.com.bitwaysystem.bean.Cookie;


@WebService(endpointInterface = "br.com.bitwaysystem.webservice.CookieServer")
public class CookieDaoImpl extends Util implements CookieDao {
	@Override
	public void storeCookie(Cookie cookie) {
		ObjectContainer db = accessDb4o();
		db.store(cookie);
		db.close();
	}

	@Override
	public void retrieveAllCookies() {
		// TODO Auto-generated method stub
		ObjectContainer db = accessDb4o();
		@SuppressWarnings("rawtypes")
		ObjectSet result = db.queryByExample(Cookie.class);
		listResult(result);
		db.close();
	}

	public static void listResult(List<?> result) {
		System.out.println("Total Records from Class: " + result.size());
		for (Object o : result) {
			Cookie c = (Cookie) o;
			// System.out.println(o);
			System.out.println("Index " + c.getIndex() + " "
					+ c.getCookieMessage());
		}
	}

	@Override
	public Cookie retrieveCookie(Cookie cookie) {
		ObjectContainer db = accessDb4o();			
		Query query = db.query();
		 
	        query.constrain(Cookie.class);	       
	        query.descend("index").constrain(cookie.getIndex());
	        ObjectSet result=query.execute();
	        Cookie cookieResponse;	        
	        cookieResponse = (Cookie) result.next();
	        db.close();
	        return cookieResponse;
		
	}
}