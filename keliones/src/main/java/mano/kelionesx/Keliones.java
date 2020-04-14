package mano.kelionesx;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
/**
 * Duomenu bazes lenteles <i>keliones</i> 1-o iraso klase
 * 
 * @author 
 */
@Entity
public class Keliones {
	/**
	 * Iraso id
	 */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	/**
	 * Keliones pavadinimas
	 */
    private String pav;
	/**
	 * Keliones aprasymas
	 */  
    private String apras;
	/**
	 * Pozymis rodantis ar kelione yra poilsine
	 */ 
    private Integer flagPoilsines;	
	/**
	 * Pozymis rodantis ar kelione yra pazintine
	 */
    private Integer flagPazintines;	
	/**
	 * Pozymis rodantis ar kelione yra su viskuom iskaiciuota
	 */
    private Integer flagViskasIsk;	
	/**
	 * Keliones kaina
	 */  
    private Double kaina;
	/**
	 * Keliones trukme valandomis
	 */
    private Integer trukmeVal;
	/**
	 * Id getter'is
	 * 
	 * @return id iraso Id
	 */ 
	public Integer getId() {
		return id;
	}
	/**
	 * Id setter'is
	 * 
	 * @param id iraso Id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Pavadininimo (laukelis <i>pav</i>) getter'is
	 * 
	 * @return pav pavadinimo (laukelis <i>pav</i>)
	 */
	public String getPav() {
		return pav;
	}
	/**
	 * Pavadininimo (laukelis <i>pav</i>) setter'is
	 * 
	 * @param pav pavadinimas (laukelis <i>pav</i>)
	 */
	public void setPav(String pav) {
		this.pav = pav;
	}
	/**
	 * Aprasymo (laukelis <i>apras</i>) getter'is
	 * 
	 * @return apras (laukelis <i>apras</i>)
	 */
	public String getApras() {
		return apras;
	}
	/**
	 * Aprasymo (laukelis <i>apras</i>) setter'is
	 * 
	 * @param apras aprašymas (laukelis <i>apras</i>)
	 */
	public void setApras(String apras) {
		this.apras = apras;
	}
	
	 /* Pozymio, kad kelione poilsine (laukelis <i>flag_poilsines</i>) getter'is
	 * 
	 * @return flagPoilsines (laukelis <i>flag_poilsines</i>)
	 */	
	public Integer getFlagPoilsines() {
		return flagPoilsines;
	}
	/**
	 * Pozymio, kad kelione poilsine (laukelis <i>flag_poilsines</i>) setter'is
	 * 
	 * @param flagPoilsines (laukelis <i>flag_poilsines</i>)
	 */	
	public void setFlagPoilsines(Integer flagPoilsines) {
		this.flagPoilsines = flagPoilsines;
	}
	/**
	 * Pozymio, kad kelione pažintine (laukelis <i>flag_pazintines</i>) getter'is
	 * 
	 * @return flagPazintines (laukelis <i>flag_pazintines</i>)
	 */	
	public Integer getFlagPazintines() {
		return flagPazintines;
	}
	/**
	 * Pozymio, kad kelione pazintine (laukelis <i>flag_pazintines</i>) setter'is
	 * 
	 * @param flagPazintines (laukelis <i>flag_pazintines</i>)
	 */
	public void setFlagPazintines(Integer flagPazintines) {
		this.flagPazintines = flagPazintines;
	}
	/**
	 * Pozymio, kad i keliones kaina viskas iskaiciuota (laukelis <i>flag_viskas_isk</i>) getter'is
	 * 
	 * @return flagViskasIsk (laukelis <i>flag_viskas_isk</i>)
	 */	
	public Integer getFlagViskasIsk() {
		return flagViskasIsk;
	}
	/**
	 * Pozymio, kad i keliones kaina viskas iskaiciuota (laukelis <i>flag_viskas_isk</i>) setter'is
	 * 
	 * @param flagViskasIsk (laukelis <i>flag_viskas_isk</i>)
	 */	
	public void setFlagViskasIsk(Integer flagViskasIsk) {
		this.flagViskasIsk = flagViskasIsk;
	}
	/**
	 * Kainos (laukelis <i>kaina</i>) getter'is
	 * 
	 * @return kaina (laukelis <i>kaina</i>)
	 */
	public Double getKaina() {
		return kaina;
	}
	/**
	 * Kainos (laukelis <i>kaina</i>) setter'is
	 * 
	 * @param kaina (laukelis <i>kaina</i>)
	 */
	public void setKaina(Double kaina) {
		this.kaina = kaina;
	}
	/**
	 * Trukmes, valandomis (laukelis <i>trukme_val</i>) getter'is
	 * 
	 * @return trukmeVal (laukelis <i>trukme_val</i>)
	 */
	public Integer getTrukmeVal() {
		return trukmeVal;
	}
	/**
	 * Trukmes, valandomis (laukelis <i>trukme_val</i>) setter'is
	 * 
	 * @param trukmeVal (laukelis <i>trukme_val</i>)
	 */
	public void setTrukmeVal(Integer trukmeVal) {
		this.trukmeVal = trukmeVal;
	}

}
