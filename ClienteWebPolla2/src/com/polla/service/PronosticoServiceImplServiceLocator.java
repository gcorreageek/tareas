/**
 * PronosticoServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polla.service;

public class PronosticoServiceImplServiceLocator extends org.apache.axis.client.Service implements com.polla.service.PronosticoServiceImplService {

    public PronosticoServiceImplServiceLocator() {
    }


    public PronosticoServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PronosticoServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PronosticoServiceImplPort
    private java.lang.String PronosticoServiceImplPort_address = "http://apppolla.eherreragamarra.cloudbees.net:80/pronosticoServiceImpl";

    public java.lang.String getPronosticoServiceImplPortAddress() {
        return PronosticoServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PronosticoServiceImplPortWSDDServiceName = "PronosticoServiceImplPort";

    public java.lang.String getPronosticoServiceImplPortWSDDServiceName() {
        return PronosticoServiceImplPortWSDDServiceName;
    }

    public void setPronosticoServiceImplPortWSDDServiceName(java.lang.String name) {
        PronosticoServiceImplPortWSDDServiceName = name;
    }

    public com.polla.service.PronosticoServiceImpl getPronosticoServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PronosticoServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPronosticoServiceImplPort(endpoint);
    }

    public com.polla.service.PronosticoServiceImpl getPronosticoServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.polla.service.PronosticoServiceImplPortBindingStub _stub = new com.polla.service.PronosticoServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getPronosticoServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPronosticoServiceImplPortEndpointAddress(java.lang.String address) {
        PronosticoServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.polla.service.PronosticoServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.polla.service.PronosticoServiceImplPortBindingStub _stub = new com.polla.service.PronosticoServiceImplPortBindingStub(new java.net.URL(PronosticoServiceImplPort_address), this);
                _stub.setPortName(getPronosticoServiceImplPortWSDDServiceName());
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
        if ("PronosticoServiceImplPort".equals(inputPortName)) {
            return getPronosticoServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.polla.com/", "PronosticoServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.polla.com/", "PronosticoServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PronosticoServiceImplPort".equals(portName)) {
            setPronosticoServiceImplPortEndpointAddress(address);
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
