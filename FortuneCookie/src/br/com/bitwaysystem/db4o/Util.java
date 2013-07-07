package br.com.bitwaysystem.db4o;

import com.db4o.Db4oEmbedded;

import com.db4o.ObjectContainer;

public class Util {

	final static String DB4OFILENAME = System.getProperty("user.home")
			+ "/cookies.db4o";

	public ObjectContainer accessDb4o() {
		
			return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),
					DB4OFILENAME);		
	}	
	
}