package io.pivotal.cloudcache.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableSsl;
import org.springframework.geode.config.annotation.EnableClusterAware;

@SpringBootApplication
@EnableClusterAware
@EnableEntityDefinedRegions
public class PccSampleAppPizzaStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PccSampleAppPizzaStoreApplication.class, args);
	}

	@Profile("tls")
	@EnableSsl(useDefaultContext = true)
	class TLSConfig{}
}


//@ClientCacheApplication(servers = @ClientCacheApplication.Server(host="localhost", port = 40404))