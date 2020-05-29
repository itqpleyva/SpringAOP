package Main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Main.DestinationClass.FirstService;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	FirstService firstService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
		

	}

	@Override
	public void run(String... args) throws Exception {
				
		firstService.method1(100);
		firstService.method2("Pepe");
		firstService.method3();
		firstService.method4();
	}

}
