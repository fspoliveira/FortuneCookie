package br.com.bitwaysystem.publisher;

import javax.xml.ws.Endpoint;

import br.com.bitwaysystem.dao.CookieDaoImpl;

public class CookiePublisher {	

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9107/cookies", new CookieDaoImpl());
	}
}