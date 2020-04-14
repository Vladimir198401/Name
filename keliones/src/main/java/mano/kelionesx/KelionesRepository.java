package mano.kelionesx;

import org.springframework.data.repository.CrudRepository;
/**
 * Duomenu bazes lenteles <i>keliones</i> JPA repositorija
 * 
 * @see <a href="https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html">JPA repositorija</a>
 * {@link Keliones}
 * @author Toma
 *
 */
public interface KelionesRepository extends CrudRepository<Keliones,Integer> {
	
}
