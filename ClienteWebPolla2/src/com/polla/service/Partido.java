/**
 * Partido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polla.service;

public class Partido  implements java.io.Serializable {
    private java.util.Calendar fecha;

    private java.lang.Integer idPais1;

    private java.lang.Integer idPais2;

    private java.lang.Integer idPartido;

    private com.polla.service.Pais pais1;

    private com.polla.service.Pais pais2;

    public Partido() {
    }

    public Partido(
           java.util.Calendar fecha,
           java.lang.Integer idPais1,
           java.lang.Integer idPais2,
           java.lang.Integer idPartido,
           com.polla.service.Pais pais1,
           com.polla.service.Pais pais2) {
           this.fecha = fecha;
           this.idPais1 = idPais1;
           this.idPais2 = idPais2;
           this.idPartido = idPartido;
           this.pais1 = pais1;
           this.pais2 = pais2;
    }


    /**
     * Gets the fecha value for this Partido.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Partido.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the idPais1 value for this Partido.
     * 
     * @return idPais1
     */
    public java.lang.Integer getIdPais1() {
        return idPais1;
    }


    /**
     * Sets the idPais1 value for this Partido.
     * 
     * @param idPais1
     */
    public void setIdPais1(java.lang.Integer idPais1) {
        this.idPais1 = idPais1;
    }


    /**
     * Gets the idPais2 value for this Partido.
     * 
     * @return idPais2
     */
    public java.lang.Integer getIdPais2() {
        return idPais2;
    }


    /**
     * Sets the idPais2 value for this Partido.
     * 
     * @param idPais2
     */
    public void setIdPais2(java.lang.Integer idPais2) {
        this.idPais2 = idPais2;
    }


    /**
     * Gets the idPartido value for this Partido.
     * 
     * @return idPartido
     */
    public java.lang.Integer getIdPartido() {
        return idPartido;
    }


    /**
     * Sets the idPartido value for this Partido.
     * 
     * @param idPartido
     */
    public void setIdPartido(java.lang.Integer idPartido) {
        this.idPartido = idPartido;
    }


    /**
     * Gets the pais1 value for this Partido.
     * 
     * @return pais1
     */
    public com.polla.service.Pais getPais1() {
        return pais1;
    }


    /**
     * Sets the pais1 value for this Partido.
     * 
     * @param pais1
     */
    public void setPais1(com.polla.service.Pais pais1) {
        this.pais1 = pais1;
    }


    /**
     * Gets the pais2 value for this Partido.
     * 
     * @return pais2
     */
    public com.polla.service.Pais getPais2() {
        return pais2;
    }


    /**
     * Sets the pais2 value for this Partido.
     * 
     * @param pais2
     */
    public void setPais2(com.polla.service.Pais pais2) {
        this.pais2 = pais2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Partido)) return false;
        Partido other = (Partido) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.idPais1==null && other.getIdPais1()==null) || 
             (this.idPais1!=null &&
              this.idPais1.equals(other.getIdPais1()))) &&
            ((this.idPais2==null && other.getIdPais2()==null) || 
             (this.idPais2!=null &&
              this.idPais2.equals(other.getIdPais2()))) &&
            ((this.idPartido==null && other.getIdPartido()==null) || 
             (this.idPartido!=null &&
              this.idPartido.equals(other.getIdPartido()))) &&
            ((this.pais1==null && other.getPais1()==null) || 
             (this.pais1!=null &&
              this.pais1.equals(other.getPais1()))) &&
            ((this.pais2==null && other.getPais2()==null) || 
             (this.pais2!=null &&
              this.pais2.equals(other.getPais2())));
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
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getIdPais1() != null) {
            _hashCode += getIdPais1().hashCode();
        }
        if (getIdPais2() != null) {
            _hashCode += getIdPais2().hashCode();
        }
        if (getIdPartido() != null) {
            _hashCode += getIdPartido().hashCode();
        }
        if (getPais1() != null) {
            _hashCode += getPais1().hashCode();
        }
        if (getPais2() != null) {
            _hashCode += getPais2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Partido.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.polla.com/", "partido"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPais1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPais1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPais2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPais2"));
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
        elemField.setFieldName("pais1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.polla.com/", "pais"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.polla.com/", "pais"));
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
