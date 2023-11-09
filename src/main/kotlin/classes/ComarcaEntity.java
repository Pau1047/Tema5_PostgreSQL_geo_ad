package classes;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "comarca", schema = "public", catalog = "geo_ad")
public class ComarcaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nom_c")
    private String nomC;
    @Basic
    @Column(name = "provincia")
    private String provincia;

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComarcaEntity that = (ComarcaEntity) o;
        return Objects.equals(nomC, that.nomC) && Objects.equals(provincia, that.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomC, provincia);
    }
}
