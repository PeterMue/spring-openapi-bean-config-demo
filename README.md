Demo for OpenAPI Bean with ConfigurationProperties
==================================================

This demo utilizes `org.sprindoc:springdoc-openapi-ui` to generate a OpenAPI documentation based on the OAS Annotations
used in `MyApi` interface.

In addition a spring bean is populated via spring-boots `@ConfigurationProperties` with values from a openapi yaml 
(`application-openapi.yaml`) to enhance the api documentation with more general documenation stuff that annoying to
wirte as annotation (e.g. large, formatted strings like a full blown description).

# Run

Start SpringBootApplication `SpringOpenapiBeanConfigDemoApplication`


Navigate your Browser to http://localhost:8080/swagger-ui.html

or

```
curl localhost:8080/docs.yaml
```

# Notes

- Inspect `com/github/petermue/demo/openapibean/rest/MyApi.java` for OAS Annotations
- Inspect `com/github/petermue/demo/openapibean/config/OpenAPIConfiguration.java` for ConfigurationProperties
- Inspect `src/main/resources/application-openapi.yaml`
- The application-openapi.yaml is a regular OpenAPI spec yaml (with an additional prefix)