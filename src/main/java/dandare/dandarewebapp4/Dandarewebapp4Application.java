package dandare.dandarewebapp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dandarewebapp4Application {

	public static void main(String[] args) {
		//Utworzenie malej bazy z utworami
		Utwor u1 = new Utwor("Maanam", "Lipstick on the glass", "https://www.youtube.com/watch?v=5lO4ZOqlqJg");
		Utwor u2 = new Utwor("Rezerwat", "Zaopiekuj się mną", "https://www.youtube.com/watch?v=WD7dDfZD1_8");
		Utwor u3 = new Utwor("Doda", "Fake love", "https://www.youtube.com/watch?v=jPy5QYmCPmc");
		Utwor u4 = new Utwor("Sanah", "Ale jazz", "https://www.youtube.com/watch?v=hHb3owr6PQg");
		SpringApplication.run(Dandarewebapp4Application.class, args);
	}

}
