# API Biblioteca - Jakarta EE + Wildfly + PostgreSQL

Este proyecto es una API RESTful para la gestión de una biblioteca, desarrollada con Jakarta EE, desplegada en Wildfly y usando PostgreSQL como base de datos.

## Características principales
- Gestión de entidades: Miembros (Member), Bibliotecarios (Librarian), Publicaciones (Publication), Préstamos (Borrow), y Emisiones (Issue).
- Endpoints REST completos (CRUD) para todas las entidades principales.
- Persistencia con JPA/Hibernate y PostgreSQL.
- Arquitectura lista para producción y pruebas.

---

## Requisitos previos
- **Java 17** o superior
- **Maven 3**
- **Wildfly 26+** (recomendado 30+ o la versión que uses)
- **PostgreSQL 13+**
- **Postman** (opcional, para pruebas)

---

## Instalación y configuración

### 1. Clona el repositorio
```sh
git clone <url-del-repo>
cd api
```

### 2. Configura la base de datos PostgreSQL
1. Crea la base de datos y el usuario:
   ```sql
   CREATE DATABASE biblioteca;
   CREATE USER bibliouser WITH PASSWORD 'bibliopass';
   GRANT ALL PRIVILEGES ON DATABASE biblioteca TO bibliouser;
   \c biblioteca
   ALTER SCHEMA public OWNER TO bibliouser;
   GRANT ALL ON SCHEMA public TO bibliouser;
   ```
2. Verifica que el usuario `bibliouser` es dueño del esquema `public`:
   ```sql
   SELECT schema_name, schema_owner FROM information_schema.schemata WHERE schema_name = 'public';
   ```

### 3. Configura el datasource en Wildfly
- Copia el driver JDBC de PostgreSQL (`postgresql-42.7.2.jar`) a `standalone/deployments/` de Wildfly.
- Inicia Wildfly y accede a la consola de administración (`http://localhost:9990`).
- Crea un datasource llamado `PostgreSQLDS` con:
  - **JNDI Name:** `java:jboss/datasources/PostgreSQLDS`
  - **Connection URL:** `jdbc:postgresql://localhost:5432/biblioteca`
  - **Username:** `bibliouser`
  - **Password:** `bibliopass`
- Haz clic en **Test Connection** para verificar.

### 4. Compila y despliega la aplicación
```sh
mvn clean package
copy target/api-jakarta-rest.war "C:/Program Files/wildfly-37.0.0.Beta1/standalone/deployments/"
```
- Reinicia Wildfly si es necesario.

---

## Uso de la API y pruebas

Consulta el archivo [`POSTMAN_COLLECTION.md`](./POSTMAN_COLLECTION.md) para ver ejemplos detallados de cómo hacer peticiones **POST**, **GET**, **PUT** y **DELETE** a todos los endpoints usando Postman o cURL.

- Todos los endpoints están bajo el contexto:
  ```
  http://localhost:8080/api-jakarta-rest/api/
  ```
- Ejemplo para listar miembros:
  ```
  http://localhost:8080/api-jakarta-rest/api/members
  ```

---

## Estructura del proyecto

- `src/main/java/com/poortoys/model/` — Entidades JPA
- `src/main/java/com/poortoys/resources/` — Recursos REST
- `src/main/resources/META-INF/persistence.xml` — Configuración JPA
- `src/main/webapp/WEB-INF/beans.xml` — Habilita CDI/JAX-RS
- `POSTMAN_COLLECTION.md` — Ejemplos de pruebas con Postman

---

## Notas adicionales
- El proyecto está configurado para crear y actualizar automáticamente las tablas en la base de datos (`drop-and-create`).
- Si cambias la estructura de las entidades, vuelve a desplegar para que se actualicen las tablas.
- Si tienes problemas de permisos en PostgreSQL, asegúrate de que el usuario es dueño del esquema `public`.

---

## Autor
- Desarrollado por Noelia Giron
