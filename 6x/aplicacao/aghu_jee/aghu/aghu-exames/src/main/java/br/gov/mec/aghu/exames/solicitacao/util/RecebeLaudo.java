//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.17 at 07:27:21 PM BRT 
//


package br.gov.mec.aghu.exames.solicitacao.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="laudo" type="{}Laudo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "laudo"
})
@XmlRootElement(name = "recebeLaudo")
public class RecebeLaudo {

    @XmlElement(required = true)
    protected Laudo laudo;

    /**
     * Gets the value of the laudo property.
     * 
     * @return
     *     possible object is
     *     {@link Laudo }
     *     
     */
    public Laudo getLaudo() {
        return laudo;
    }

    /**
     * Sets the value of the laudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Laudo }
     *     
     */
    public void setLaudo(Laudo value) {
        this.laudo = value;
    }

}
