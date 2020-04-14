package mano.kelionesx;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@Entity
public class Keliones_Miestai {
    private static final long serialVersionUID = -6790693372846798580L;	
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	

	private Integer id;
	private Integer miestai_id;
	private Integer keliones_id;
	
    @JsonIgnoreProperties("keliones_Miestai")
    @ManyToOne
    @JoinColumn(insertable=false, updatable=false)
    private Miestai miestai;

    // @JsonIgnoreProperties("patiekalu_produktai")
    @ManyToOne
    @JoinColumn(insertable=false, updatable=false)
    private Keliones keliones;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMiestai_id() {
		return miestai_id;
	}

	public void setMiestai_id(Integer miestai_id) {
		this.miestai_id = miestai_id;
	}

	public Integer getKeliones_id() {
		return keliones_id;
	}

	public void setKeliones_id(Integer keliones_id) {
		this.keliones_id = keliones_id;
	}

	public Miestai getMiestai() {
		return miestai;
	}

	public void setMiestai(Miestai miestai) {
		this.miestai = miestai;
	}

	public Keliones getKeliones() {
		return keliones;
	}

	public void setKeliones(Keliones keliones) {
		this.keliones = keliones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 	
    
    
}
