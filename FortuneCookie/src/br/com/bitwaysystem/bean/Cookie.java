package br.com.bitwaysystem.bean;

import java.io.Serializable;

public class Cookie implements Serializable {
	
	int index;
	String cookieMessage;	
	
	public Cookie() {
		super();
	}
	public Cookie(int index, String cookieMessage) {
		super();
		this.index = index;
		this.cookieMessage = cookieMessage;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getCookieMessage() {
		return cookieMessage;
	}
	public void setCookieMessage(String cookieMessage) {
		this.cookieMessage = cookieMessage;
	}		

}