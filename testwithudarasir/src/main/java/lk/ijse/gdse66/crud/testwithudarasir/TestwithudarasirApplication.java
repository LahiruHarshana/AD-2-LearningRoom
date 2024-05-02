package lk.ijse.gdse66.crud.testwithudarasir;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestwithudarasirApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestwithudarasirApplication.class, args);
	}

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
