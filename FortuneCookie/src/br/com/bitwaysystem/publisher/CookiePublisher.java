package br.com.bitwaysystem.publisher;

import javax.xml.ws.Endpoint;

import br.com.bitwaysystem.dao.CookieDaoImpl;

public class CookiePublisher {	

	public static void main(String[] args) {
		Endpoint.publish("http://192.168.1.11:9110/cookies", new CookieDaoImpl());
	}
}