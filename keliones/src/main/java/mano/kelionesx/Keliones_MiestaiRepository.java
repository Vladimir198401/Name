package mano.kelionesx;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Keliones_MiestaiRepository extends CrudRepository<Keliones_Miestai,Integer>  {
	List<Keliones_Miestai> findByKelionesId(Integer id_keliones);
	
	/*@Query(value="SELECT id, pav, kilme FROM produktai WHERE maistines_medz=1", nativeQuery = true)
	List<Miestai> findAllQuery();	*/
}
