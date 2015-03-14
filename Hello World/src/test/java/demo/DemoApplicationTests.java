package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {
	
	final String BASE_URL = "http://localhost:8080/";

	 
	@Test
	public void testSayHelloWorld(){
		RestTemplate rest = new TestRestTemplate();
		String resp = rest.getForObject(BASE_URL, String.class);
	}

	@Test
	public void contextLoads() {
	}

}
