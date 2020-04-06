
## Pizza app exposes the below apis

- /preheatOven -> Creates pizzas (put data into region)
- /pizzas -> Lists pizzas (get data from region)
- /cleanSlate -> clears data (clear data from region)

### To bind to a service instance
Provide the name of the service instance that has been created in [manifest.yml](/manifest.yml#L9) (ex: `dev-si`).

### To bind to a TLS enabled service instance
In addition to providing the name of the service instance in the manifest as mentioned in the above section, 
you add `spring.data.gemfire.security.ssl.use-default-context=true` to [application.properties](src/main/resources/application.properties).
