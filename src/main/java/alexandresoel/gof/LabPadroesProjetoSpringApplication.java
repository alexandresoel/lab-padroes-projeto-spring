package alexandresoel.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//FIXME Field viaCepService in alexandresoel.gof.service.impl.ClienteServiceImpl required a bean of type 'org.springframework.cloud.openfeign.FeignClientFactory' that could not be found.
@SpringBootApplication
@EnableFeignClients
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
