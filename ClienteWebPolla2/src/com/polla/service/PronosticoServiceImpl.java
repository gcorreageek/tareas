/**
 * PronosticoServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polla.service;

public interface PronosticoServiceImpl extends java.rmi.Remote {
    public com.polla.service.Partido[] consultaPartido(java.lang.String fecha) throws java.rmi.RemoteException;
    public com.polla.service.Pronostico registrarPronostico(int idPartido, int resultadoPais1, int resultadoPais2) throws java.rmi.RemoteException;
    public com.polla.service.Pais[] listarPaises() throws java.rmi.RemoteException;
    public com.polla.service.Pronostico getPronostico(int idPais) throws java.rmi.RemoteException;
}
