/**
 * FullerData_x0020_Fortune_x0020_CookieLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fullerdata.www.FortuneCookie.FortuneCookie_asmx;

public class FullerData_x0020_Fortune_x0020_CookieLocator extends org.apache.axis.client.Service implements com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_Cookie {

/**
 * Simple XML-based fortune cookie
 */

    public FullerData_x0020_Fortune_x0020_CookieLocator() {
    }


    public FullerData_x0020_Fortune_x0020_CookieLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FullerData_x0020_Fortune_x0020_CookieLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FullerData_x0020_Fortune_x0020_CookieSoap
    private java.lang.String FullerData_x0020_Fortune_x0020_CookieSoap_address = "http://www.fullerdata.com/FortuneCookie/FortuneCookie.asmx";

    public java.lang.String getFullerData_x0020_Fortune_x0020_CookieSoapAddress() {
        return FullerData_x0020_Fortune_x0020_CookieSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName = "FullerData_x0020_Fortune_x0020_CookieSoap";

    public java.lang.String getFullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName() {
        return FullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName;
    }

    public void setFullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName(java.lang.String name) {
        FullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName = name;
    }

    public com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoap getFullerData_x0020_Fortune_x0020_CookieSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FullerData_x0020_Fortune_x0020_CookieSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFullerData_x0020_Fortune_x0020_CookieSoap(endpoint);
    }

    public com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoap getFullerData_x0020_Fortune_x0020_CookieSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoapStub _stub = new com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoapStub(portAddress, this);
            _stub.setPortName(getFullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFullerData_x0020_Fortune_x0020_CookieSoapEndpointAddress(java.lang.String address) {
        FullerData_x0020_Fortune_x0020_CookieSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoapStub _stub = new com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoapStub(new java.net.URL(FullerData_x0020_Fortune_x0020_CookieSoap_address), this);
                _stub.setPortName(getFullerData_x0020_Fortune_x0020_CookieSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FullerData_x0020_Fortune_x0020_CookieSoap".equals(inputPortName)) {
            return getFullerData_x0020_Fortune_x0020_CookieSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.fullerdata.com/FortuneCookie/FortuneCookie.asmx", "FullerData_x0020_Fortune_x0020_Cookie");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.fullerdata.com/FortuneCookie/FortuneCookie.asmx", "FullerData_x0020_Fortune_x0020_CookieSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FullerData_x0020_Fortune_x0020_CookieSoap".equals(portName)) {
            setFullerData_x0020_Fortune_x0020_CookieSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
