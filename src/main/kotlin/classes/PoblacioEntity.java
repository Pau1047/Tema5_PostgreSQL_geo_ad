package classes;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "poblacio", schema = "public", catalog = "geo_ad")
public class PoblacioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_m")
    private int codM;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "poblacio")
    private Integer poblacio;
    @Basic
    @Column(name = "extensio")
    private BigDecimal extensio;
    @Basic
    @Column(name = "altura")
    private Integer altura;
    @Basic
    @Column(name = "longitud")
    private String longitud;
    @Basic
    @Column(name = "latitud")
    private String latitud;
    @Basic
    @Column(name = "llengua")
    private String llengua;
    @Basic
    @Column(name = "nom_c")
    private String nomC;
    @OneToMany(mappedBy = "poblacioByCodM")
    private Collection<InstitutEntity> institutsByCodM;
    @ManyToOne
    @JoinColumn(name = "nom_c", referencedColumnName = "nom_c")
    private ComarcaEntity comarcaByNomC;

    public int getCodM() {
        return codM;
    }

    public void setCodM(int codM) {
        this.codM = codM;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(Integer poblacio) {
        this.poblacio = poblacio;
    }

    public BigDecimal getExtensio() {
        return extensio;
    }

    public void setExtensio(BigDecimal extensio) {
        this.extensio = extensio;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLlengua() {
        return llengua;
    }

    public void setLlengua(String llengua) {
        this.llengua = llengua;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoblacioEntity that = (PoblacioEntity) o;
        return codM == that.codM && Objects.equals(nom, that.nom) && Objects.equals(poblacio, that.poblacio) && Objects.equals(extensio, that.extensio) && Objects.equals(altura, that.altura) && Objects.equals(longitud, that.longitud) && Objects.equals(latitud, that.latitud) && Objects.equals(llengua, that.llengua) && Objects.equals(nomC, that.nomC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codM, nom, poblacio, extensio, altura, longitud, latitud, llengua, nomC);
    }

    public Collection<InstitutEntity> getInstitutsByCodM() {
        return institutsByCodM;
    }

    public void setInstitutsByCodM(Collection<InstitutEntity> institutsByCodM) {
        this.institutsByCodM = institutsByCodM;
    }

    public ComarcaEntity getComarcaByNomC() {
        return comarcaByNomC;
    }

    public void setComarcaByNomC(ComarcaEntity comarcaByNomC) {
        this.comarcaByNomC = comarcaByNomC;
    }
}
