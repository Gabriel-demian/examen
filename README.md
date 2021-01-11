# REST Test



La prueba consiste en agregar nueva funcionalidad a la API REST que corre en este repositorio. Para eso vamos a guiarnos por los siguientes puntos:

1. Hacer un fork del repositorio, crear un nuevo branch y realizar las tareas enunciadas a continuación.

2. Proveer servicios para la administración de la compra de productos. Los mismos deberán incluir:

* ABM de productos.
* ABM de clientes.
* Consulta de transacciones de compra.
* Aprobación de compras.

3. Los servicios deben contar con logs que indiquen si el servicio respondió correctamente o no.

4. Documentar brevemente los servicios implementados.

5. Todos los servicios deben contar, al menos, con test unitarios.

6. Enviar un Pull Request con todos los cambios realizados.

Para correr la aplicación se puede utilizar maven:

mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=local"

Pueden probar el servicio de prueba con un curl de la siguiente forma:

`curl -X POST -H 'Content-Type: application/json' -H 'Accept: application/json' -d '{"message":"mensaje de prueba"}' localhost:8080/custom/echo`

Bonus

1. Hostear la app en un cloud computing libre (Cloudfoudry o APP Engine) y enviar la URL para consultar.
2. ABM de vendedores.
3. Agregar test de integración.
4. Correr pruebas con base de datos en memoria.
5. Calcular la covertura de los tests.
6. Crear Docker Image.


# --------------------------------------------------------

# En el ejercicio se agregaron los siguientes puntos:

- [x] Uso de Lombok para clases/entidad (getters/setters/logs/data).
- [x] Documentación de Swagger en la API/Controller
- [x] Diseño de validaciones y mapper para la conversion de DTOs/Objetos y validaciones
- [x] ABM Vendedores
- [x] Test de integración desde Controller con uso de Transactional
- [x] Base de datos en memoria H2 con aplication.properties por perfil activo. Se tiene un aplication-prod.properties con la base de datos en mysql y aplication-test.properties con la configuración de la base H2
- [x] Mapeo de Exceptions y error types de HTTP Status/code (ResponseStatus)

# Url Swagger:
```
  http://localhost:8080/payments/swagger-ui.html#/
```





