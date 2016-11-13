
package co.edu.javeriana.aes.modval.pagos.artifacts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenciaFactura", propOrder = {"referenciaFactura"})
public class ReferenciaFactura {

    @XmlElement(required = true)
    protected String referenciaFactura;

    public ReferenciaFactura() {
    }

    public ReferenciaFactura(String referenciaFactura) {
        this.referenciaFactura = referenciaFactura;
    }

    /**
     * Gets the value of the referenciaFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaFactura() {
        return referenciaFactura;
    }

    /**
     * Sets the value of the referenciaFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaFactura(String value) {
        this.referenciaFactura = value;
    }

}
