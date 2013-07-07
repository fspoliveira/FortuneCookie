package br.com.bitwaysystem.db4o;

import java.util.List;

import br.com.bitwaysystem.bean.Cookie;

public interface CookieDao {

	public void save(Cookie cookie);

	public Cookie getAtendimento(long id);

	public List<Cookie> list();

	public void remove(Cookie cookie);

	public void update(Cookie cookie);

}