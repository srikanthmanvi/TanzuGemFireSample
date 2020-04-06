
## Pizza app exposes the below apis

- /preheatOven -> Creates pizzas (put data into region)
- /pizzas -> Lists pizzas (get data from region)
- /cleanSlate -> clears data (clear data from region)

### To bind to a service instance
Provide the name of the service instance that has been created in [manifest.yml](/manifest.yml#L9) (ex: `dev-si`).

### To bind to a TLS enabled service instance
In addition to providing the name of the service instance in the manifest as mentioned in the above section, 
you need to activate the spring profile which is used in this sample app to configure client side tls.
You can activate the spring profile by using [SPRING_PROFILES_ACTIVE in the manifest.yml](manifest.yml#L8). In this sample the name of the spring profile which which turns on TLS is `tls`. Hence to connect to a TLS service instance update the manifest  `SPRING_PROFILES_ACTIVE: tls`, if you are connecting to a non-tls service instance don't set any value for `SPRING_PROFILES_ACTIVE`.
