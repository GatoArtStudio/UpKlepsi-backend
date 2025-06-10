package art.gatoartstudio.upklepsi;

import org.springframework.boot.SpringApplication;

public class TestUpklepsiApplication {

	public static void main(String[] args) {
		SpringApplication.from(UpklepsiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
