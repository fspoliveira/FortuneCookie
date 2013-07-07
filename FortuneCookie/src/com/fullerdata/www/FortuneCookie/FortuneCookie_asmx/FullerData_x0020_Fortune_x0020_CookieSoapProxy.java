package com.fullerdata.www.FortuneCookie.FortuneCookie_asmx;

public class FullerData_x0020_Fortune_x0020_CookieSoapProxy implements com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoap {
  private String _endpoint = null;
  private com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoap fullerData_x0020_Fortune_x0020_CookieSoap = null;
  
  public FullerData_x0020_Fortune_x0020_CookieSoapProxy() {
    _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
  }
  
  public FullerData_x0020_Fortune_x0020_CookieSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
  }
  
  private void _initFullerData_x0020_Fortune_x0020_CookieSoapProxy() {
    try {
      fullerData_x0020_Fortune_x0020_CookieSoap = (new com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieLocator()).getFullerData_x0020_Fortune_x0020_CookieSoap();
      if (fullerData_x0020_Fortune_x0020_CookieSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fullerData_x0020_Fortune_x0020_CookieSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fullerData_x0020_Fortune_x0020_CookieSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fullerData_x0020_Fortune_x0020_CookieSoap != null)
      ((javax.xml.rpc.Stub)fullerData_x0020_Fortune_x0020_CookieSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fullerdata.www.FortuneCookie.FortuneCookie_asmx.FullerData_x0020_Fortune_x0020_CookieSoap getFullerData_x0020_Fortune_x0020_CookieSoap() {
    if (fullerData_x0020_Fortune_x0020_CookieSoap == null)
      _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
    return fullerData_x0020_Fortune_x0020_CookieSoap;
  }
  
  public int readNodeCount() throws java.rmi.RemoteException{
    if (fullerData_x0020_Fortune_x0020_CookieSoap == null)
      _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
    return fullerData_x0020_Fortune_x0020_CookieSoap.readNodeCount();
  }
  
  public java.lang.String getFortuneCookie() throws java.rmi.RemoteException{
    if (fullerData_x0020_Fortune_x0020_CookieSoap == null)
      _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
    return fullerData_x0020_Fortune_x0020_CookieSoap.getFortuneCookie();
  }
  
  public int countCookies() throws java.rmi.RemoteException{
    if (fullerData_x0020_Fortune_x0020_CookieSoap == null)
      _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
    return fullerData_x0020_Fortune_x0020_CookieSoap.countCookies();
  }
  
  public java.lang.String getSpecificCookie(int index) throws java.rmi.RemoteException{
    if (fullerData_x0020_Fortune_x0020_CookieSoap == null)
      _initFullerData_x0020_Fortune_x0020_CookieSoapProxy();
    return fullerData_x0020_Fortune_x0020_CookieSoap.getSpecificCookie(index);
  }
  
  
}