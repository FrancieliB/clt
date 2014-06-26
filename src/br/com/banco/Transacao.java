
package br.com.banco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conta" type="{http://banco.com.br/}conta" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="saldoAnterior" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tipoOperacao" type="{http://banco.com.br/}tipoOperacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transacao", propOrder = {
    "conta",
    "data",
    "saldo",
    "saldoAnterior",
    "tipoOperacao"
})
public class Transacao {

    protected Conta conta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected double saldo;
    protected double saldoAnterior;
    protected TipoOperacao tipoOperacao;

    /**
     * Gets the value of the conta property.
     * 
     * @return
     *     possible object is
     *     {@link Conta }
     *     
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conta }
     *     
     */
    public void setConta(Conta value) {
        this.conta = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the saldo property.
     * 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     */
    public void setSaldo(double value) {
        this.saldo = value;
    }

    /**
     * Gets the value of the saldoAnterior property.
     * 
     */
    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    /**
     * Sets the value of the saldoAnterior property.
     * 
     */
    public void setSaldoAnterior(double value) {
        this.saldoAnterior = value;
    }

    /**
     * Gets the value of the tipoOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacao }
     *     
     */
    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    /**
     * Sets the value of the tipoOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacao }
     *     
     */
    public void setTipoOperacao(TipoOperacao value) {
        this.tipoOperacao = value;
    }

}
