package br.com.bitwaysystem.dao;

import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import br.com.bitwaysystem.db4o.Util;
import br.com.bitwaysystem.bean.Cookie;

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
		ObjectSet result = db.queryByExample(Cookie.class);
        listResult(result);
        db.close();
	}
	
	public static void listResult(List<?> result){
	    System.out.println(result.size());
	    for (Object o : result) {
	    	Cookie c = (Cookie) o;
	        //System.out.println(o);
	    	System.out.println("Index +"+ c.getIndex() + " " + c.getCookieMessage());
	    }
	}

	
}