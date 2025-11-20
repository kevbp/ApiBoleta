package Clinica.ApiBoleta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCit;
    private Long idPac;
    private String fec;
    private String hor;
    private double preTot;
    private Long idEmp;

    public Boleta() {
    }

    public Boleta(Long id, Long idCit, Long idPac, String fec, String hor, double preTot, Long idEmp) {
        this.id = id;
        this.idCit = idCit;
        this.idPac = idPac;
        this.fec = fec;
        this.hor = hor;
        this.preTot = preTot;
        this.idEmp = idEmp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCit() {
        return idCit;
    }

    public void setIdCit(Long idCit) {
        this.idCit = idCit;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }

    public double getPreTot() {
        return preTot;
    }

    public void setPreTot(double preTot) {
        this.preTot = preTot;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

}
