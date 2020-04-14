package mano.kelionesx;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;

@Entity
public class Miestai {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    private String pav;
    
    private String kodas_salies;
    
    private String apras;	
  
    
    @JsonIgnoreProperties("miestai")    
    @OneToMany(mappedBy = "miestai",cascade = CascadeType.ALL)
    private List<Keliones_Miestai> miestaiKeliones;    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String getKodas_salies() {
		return kodas_salies;
	}

	public void setKodas_salies(String kodas_salies) {
		this.kodas_salies = kodas_salies;
	}

	public String getApras() {
		return apras;
	}

	public void setApras(String apras) {
		this.apras = apras;
	}

	public Iterable<Keliones_Miestai> getMiestaiKeliones() {
		return miestaiKeliones;
	}

	public void setMiestaiKeliones(List<Keliones_Miestai> miestaiKeliones) {
		this.miestaiKeliones = miestaiKeliones;
	}
}
