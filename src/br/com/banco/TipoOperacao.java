
package br.com.banco;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoOperacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoOperacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPOSITO"/>
 *     &lt;enumeration value="SAQUE"/>
 *     &lt;enumeration value="SALDO"/>
 *     &lt;enumeration value="EXTRATO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoOperacao")
@XmlEnum
public enum TipoOperacao {

    DEPOSITO,
    SAQUE,
    SALDO,
    EXTRATO;

    public String value() {
        return name();
    }

    public static TipoOperacao fromValue(String v) {
        return valueOf(v);
    }

}
