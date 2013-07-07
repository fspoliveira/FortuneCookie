/**
 * FullerData_x0020_Fortune_x0020_CookieSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fullerdata.www.FortuneCookie.FortuneCookie_asmx;

public interface FullerData_x0020_Fortune_x0020_CookieSoap extends java.rmi.Remote {

    /**
     * Display the number of nodes specified in fortune XML document
     */
    public int readNodeCount() throws java.rmi.RemoteException;

    /**
     * Get a random fortune cookie from the XML document
     */
    public java.lang.String getFortuneCookie() throws java.rmi.RemoteException;

    /**
     * Count the actual number of nodes in the XML document of fortunes
     */
    public int countCookies() throws java.rmi.RemoteException;

    /**
     * Get a specific cookie by the XML node number
     */
    public java.lang.String getSpecificCookie(int index) throws java.rmi.RemoteException;
}
