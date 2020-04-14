package mano.kelionesx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Pavyzdine mokomoji web aplikacija - kelioniu informacine sistema
 * Leidzia ivesti kelioniu pavadinimus, aprasymus, kaina, trukme,
 * pazymeti pagal tipa ar poilsine, ar pazintine kelione,
 * ar viskas iskaiciuota
 * ir kokie miestai yra aplankomi keliones metu
 * 
 * @author Toma
 *
 */
@SpringBootApplication
public class KelionesxApplication {

	public static void main(String[] args) {
		SpringApplication.run(KelionesxApplication.class, args);
	}

}
