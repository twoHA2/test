package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableSidecar
public class Sidecar_8090_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(Sidecar_8090_StartSpringCloudApp.class, args);
	}
}
