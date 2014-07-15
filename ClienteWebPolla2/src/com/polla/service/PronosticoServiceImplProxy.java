package com.polla.service;

public class PronosticoServiceImplProxy implements com.polla.service.PronosticoServiceImpl {
  private String _endpoint = null;
  private com.polla.service.PronosticoServiceImpl pronosticoServiceImpl = null;
  
  public PronosticoServiceImplProxy() {
    _initPronosticoServiceImplProxy();
  }
  
  public PronosticoServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPronosticoServiceImplProxy();
  }
  
  private void _initPronosticoServiceImplProxy() {
    try {
      pronosticoServiceImpl = (new com.polla.service.PronosticoServiceImplServiceLocator()).getPronosticoServiceImplPort();
      if (pronosticoServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pronosticoServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pronosticoServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pronosticoServiceImpl != null)
      ((javax.xml.rpc.Stub)pronosticoServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.polla.service.PronosticoServiceImpl getPronosticoServiceImpl() {
    if (pronosticoServiceImpl == null)
      _initPronosticoServiceImplProxy();
    return pronosticoServiceImpl;
  }
  
  public com.polla.service.Partido[] consultaPartido(java.lang.String fecha) throws java.rmi.RemoteException{
    if (pronosticoServiceImpl == null)
      _initPronosticoServiceImplProxy();
    return pronosticoServiceImpl.consultaPartido(fecha);
  }
  
  public com.polla.service.Pronostico registrarPronostico(int idPartido, int resultadoPais1, int resultadoPais2) throws java.rmi.RemoteException{
    if (pronosticoServiceImpl == null)
      _initPronosticoServiceImplProxy();
    return pronosticoServiceImpl.registrarPronostico(idPartido, resultadoPais1, resultadoPais2);
  }
  
  public com.polla.service.Pais[] listarPaises() throws java.rmi.RemoteException{
    if (pronosticoServiceImpl == null)
      _initPronosticoServiceImplProxy();
    return pronosticoServiceImpl.listarPaises();
  }
  
  public com.polla.service.Pronostico getPronostico(int idPais) throws java.rmi.RemoteException{
    if (pronosticoServiceImpl == null)
      _initPronosticoServiceImplProxy();
    return pronosticoServiceImpl.getPronostico(idPais);
  }
  
  
}