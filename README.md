# acme-spring-boot-starter
## steps to build custome spring boot starter
1. define tow modules: `autoconfigure` and `starter`;
2. add all dependences in module `starter`;
3. (optional) in module `autoconfigure`, define starter configuration and generate the `spring-configuration-metadata.json` at `resources/META-INF/`;
4. in module autoconfigure, configure the EnableAutoConfiguration class in `resources/META-INF/spring.factories`;
5. add `autoconfigure` as `starter`'s dependence;
6. build and deploy to your repository;
7. (identify) import the starter to your projects;

## project structure
```text
├── README.md
├── acme-spring-boot-autoconfigure
├── acme-spring-boot-examples
├── acme-spring-boot-starter
└── pom.xml
```
## references
* [12.5. Creating Your Own Starter](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.developing-auto-configuration.custom-starter)
