package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coursesoap", propOrder = {
        "idcurso",
        "nomcurso",
        "credito",
        "description"
})
public class Coursesoap {

    protected int idcurso;
    @XmlElement(required = true)
    protected String nomcurso;
    protected int credito;
    protected String description;

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int value) {
        this.idcurso = value;
    }

    public String getNomcurso() {
        return nomcurso;
    }

    public void setNomcurso(String value) {
        this.nomcurso = value;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int value) {
        this.credito = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }
}