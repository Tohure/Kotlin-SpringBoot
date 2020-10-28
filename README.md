# Kotlin-SpringBoot
Proyecto de ejemplo de Spring Boot con Kotlin

El proyecto usa Gradle en lugar de Maven, donde los scripts están hechos en Kotlin DSL y no Groovy

En esta rama hay demos de peticiones _blocking_ y _non-blocking_

# blocking

Para ver ejemplos de tipo **_blocking_**, ubicarse en la rama Main.

Las peticiones síncronas se hicieron el uso directo de _**RestTemplate**_
Las peticiones asíncronas se hicieron con el uso de _**Async functions**_ con _**ThreadPoolTaskExecutor**_ para generar estas peticiones

# non-blocking

Para ver el ejemplo de _**non-blocking**_, ubicarse en la rama coroutines

Las peticiones síncronas se hicieron el uso directo de _**RestTemplate**_
Las peticiones asíncronas se hicieron con el uso de _**corutinas**_ 

