/**
 * Pronostico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polla.service;

public class Pronostico  implements java.io.Serializable {
    private java.lang.Integer estadoEmpate;

    private java.lang.Integer estadoGano;

    private java.lang.Integer estadoPais;

    private java.lang.Integer estadoPerdio;

    private java.lang.Integer idPartido;

    private java.lang.Integer idPronostico;

    private com.polla.service.Partido partido;

    private java.lang.String resultadoPais1;

    private java.lang.String resultadoPais2;

    public Pronostico() {
    }

    public Pronostico(
           java.lang.Integer estadoEmpate,
           java.lang.Integer estadoGano,
           java.lang.Integer estadoPais,
           java.lang.Integer estadoPerdio,
           java.lang.Integer idPartido,
           java.lang.Integer idPronostico,
           com.polla.service.Partido partido,
           java.lang.String resultadoPais1,
           java.lang.String resultadoPais2) {
           this.estadoEmpate = estadoEmpate;
           this.estadoGano = estadoGano;
           this.estadoPais = estadoPais;
           this.estadoPerdio = estadoPerdio;
           this.idPartido = idPartido;
           this.idPronostico = idPronostico;
           this.partido = partido;
           this.resultadoPais1 = resultadoPais1;
           this.resultadoPais2 = resultadoPais2;
    }


    /**
     * Gets the estadoEmpate value for this Pronostico.
     * 
     * @return estadoEmpate
     */
    public java.lang.Integer getEstadoEmpate() {
        return estadoEmpate;
    }


    /**
     * Sets the estadoEmpate value for this Pronostico.
     * 
     * @param estadoEmpate
     */
    public void setEstadoEmpate(java.lang.Integer estadoEmpate) {
        this.estadoEmpate = estadoEmpate;
    }


    /**
     * Gets the estadoGano value for this Pronostico.
     * 
     * @return estadoGano
     */
    public java.lang.Integer getEstadoGano() {
        return estadoGano;
    }


    /**
     * Sets the estadoGano value for this Pronostico.
     * 
     * @param estadoGano
     */
    public void setEstadoGano(java.lang.Integer estadoGano) {
        this.estadoGano = estadoGano;
    }


    /**
     * Gets the estadoPais value for this Pronostico.
     * 
     * @return estadoPais
     */
    public java.lang.Integer getEstadoPais() {
        return estadoPais;
    }


    /**
     * Sets the estadoPais value for this Pronostico.
     * 
     * @param estadoPais
     */
    public void setEstadoPais(java.lang.Integer estadoPais) {
        this.estadoPais = estadoPais;
    }


    /**
     * Gets the estadoPerdio value for this Pronostico.
     * 
     * @return estadoPerdio
     */
    public java.lang.Integer getEstadoPerdio() {
        return estadoPerdio;
    }


    /**
     * Sets the estadoPerdio value for this Pronostico.
     * 
     * @param estadoPerdio
     */
    public void setEstadoPerdio(java.lang.Integer estadoPerdio) {
        this.estadoPerdio = estadoPerdio;
    }


    /**
     * Gets the idPartido value for this Pronostico.
     * 
     * @return idPartido
     */
    public java.lang.Integer getIdPartido() {
        return idPartido;
    }


    /**
     * Sets the idPartido value for this Pronostico.
     * 
     * @param idPartido
     */
    public void setIdPartido(java.lang.Integer idPartido) {
        this.idPartido = idPartido;
    }


    /**
     * Gets the idPronostico value for this Pronostico.
     * 
     * @return idPronostico
     */
    public java.lang.Integer getIdPronostico() {
        return idPronostico;
    }


    /**
     * Sets the idPronostico value for this Pronostico.
     * 
     * @param idPronostico
     */
    public void setIdPronostico(java.lang.Integer idPronostico) {
        this.idPronostico = idPronostico;
    }


    /**
     * Gets the partido value for this Pronostico.
     * 
     * @return partido
     */
    public com.polla.service.Partido getPartido() {
        return partido;
    }


    /**
     * Sets the partido value for this Pronostico.
     * 
     * @param partido
     */
    public void setPartido(com.polla.service.Partido partido) {
        this.partido = partido;
    }


    /**
     * Gets the resultadoPais1 value for this Pronostico.
     * 
     * @return resultadoPais1
     */
    public java.lang.String getResultadoPais1() {
        return resultadoPais1;
    }


    /**
     * Sets the resultadoPais1 value for this Pronostico.
     * 
     * @param resultadoPais1
     */
    public void setResultadoPais1(java.lang.String resultadoPais1) {
        this.resultadoPais1 = resultadoPais1;
    }


    /**
     * Gets the resultadoPais2 value for this Pronostico.
     * 
     * @return resultadoPais2
     */
    public java.lang.String getResultadoPais2() {
        return resultadoPais2;
    }


    /**
     * Sets the resultadoPais2 value for this Pronostico.
     * 
     * @param resultadoPais2
     */
    public void setResultadoPais2(java.lang.String resultadoPais2) {
        this.resultadoPais2 = resultadoPais2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pronostico)) return false;
        Pronostico other = (Pronostico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoEmpate==null && other.getEstadoEmpate()==null) || 
             (this.estadoEmpate!=null &&
              this.estadoEmpate.equals(other.getEstadoEmpate()))) &&
            ((this.estadoGano==null && other.getEstadoGano()==null) || 
             (this.estadoGano!=null &&
              this.estadoGano.equals(other.getEstadoGano()))) &&
            ((this.estadoPais==null && other.getEstadoPais()==null) || 
             (this.estadoPais!=null &&
              this.estadoPais.equals(other.getEstadoPais()))) &&
            ((this.estadoPerdio==null && other.getEstadoPerdio()==null) || 
             (this.estadoPerdio!=null &&
              this.estadoPerdio.equals(other.getEstadoPerdio()))) &&
            ((this.idPartido==null && other.getIdPartido()==null) || 
             (this.idPartido!=null &&
              this.idPartido.equals(other.getIdPartido()))) &&
            ((this.idPronostico==null && other.getIdPronostico()==null) || 
             (this.idPronostico!=null &&
              this.idPronostico.equals(other.getIdPronostico()))) &&
            ((this.partido==null && other.getPartido()==null) || 
             (this.partido!=null &&
              this.partido.equals(other.getPartido()))) &&
            ((this.resultadoPais1==null && other.getResultadoPais1()==null) || 
             (this.resultadoPais1!=null &&
              this.resultadoPais1.equals(other.getResultadoPais1()))) &&
            ((this.resultadoPais2==null && other.getResultadoPais2()==null) || 
             (this.resultadoPais2!=null &&
              this.resultadoPais2.equals(other.getResultadoPais2())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEstadoEmpate() != null) {
            _hashCode += getEstadoEmpate().hashCode();
        }
        if (getEstadoGano() != null) {
            _hashCode += getEstadoGano().hashCode();
        }
        if (getEstadoPais() != null) {
            _hashCode += getEstadoPais().hashCode();
        }
        if (getEstadoPerdio() != null) {
            _hashCode += getEstadoPerdio().hashCode();
        }
        if (getIdPartido() != null) {
            _hashCode += getIdPartido().hashCode();
        }
        if (getIdPronostico() != null) {
            _hashCode += getIdPronostico().hashCode();
        }
        if (getPartido() != null) {
            _hashCode += getPartido().hashCode();
        }
        if (getResultadoPais1() != null) {
            _hashCode += getResultadoPais1().hashCode();
        }
        if (getResultadoPais2() != null) {
            _hashCode += getResultadoPais2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pronostico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.polla.com/", "pronostico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoEmpate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoEmpate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoGano");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoGano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoPais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoPerdio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoPerdio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPartido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPartido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPronostico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPronostico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.polla.com/", "partido"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoPais1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoPais1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoPais2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoPais2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
