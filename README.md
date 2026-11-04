# 🎁 RESIGNA2 – Inventario de regalos

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.4.2-6DB33F?logo=springboot" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-4169E1?logo=postgresql" />
  <img src="https://img.shields.io/badge/Flyway-10.10.0-CC0200?logo=flyway" />
  <img src="https://img.shields.io/badge/Gradle-Build%20Tool-02303A?logo=gradle" />
  <img src="https://img.shields.io/badge/Status-In%20Development-yellow" />
</p>

<p align="center">
  <strong>Una pequeña aplicación para organizar nuestras creaciones y llevar el control de los regalos que hacemos.</strong>
</p>

<p align="center">
  Proyecto personal desarrollado con Java 21 y Spring Boot.
</p>

---

## 📖 Sobre el proyecto

**Resigna2** es un proyecto personal desarrollado para gestionar y organizar las diferentes creaciones artesanales que realizamos con resina.

Creamos piezas de diferentes tipos y diseños que, en muchas ocasiones, terminan convirtiéndose en regalos para familiares, amigos y personas cercanas.

Con el paso del tiempo, llevar un control manual de todas estas creaciones puede resultar complicado. Saber qué piezas tenemos disponibles, cuáles hemos elaborado o cuáles hemos regalado es importante para mantener un inventario organizado.

Por este motivo, surge la idea de desarrollar una aplicación propia que permita centralizar toda esta información y facilitar la gestión de nuestras creaciones.

El proyecto está pensado para un uso personal, adaptándose a nuestras necesidades y permitiéndonos incorporar nuevas funcionalidades a medida que vayamos creciendo con nuestras creaciones.

## 🎯 Objetivos del proyecto

- 📦 **Gestión del inventario:** mantener un registro de las piezas elaboradas y disponibles.
- 🎨 **Organización de creaciones:** clasificar y consultar nuestras diferentes piezas de resina.
- 🎁 **Control de regalos:** registrar las piezas que regalamos y sus destinatarios.
- 📊 **Seguimiento:** conocer la disponibilidad y el estado de nuestras creaciones.
- 🗂️ **Histórico:** mantener un registro de las piezas y los movimientos realizados.

## 🛠️ Tecnologías y herramientas

El proyecto utiliza un conjunto de tecnologías del ecosistema Java y Spring para desarrollar una aplicación organizada, mantenible y escalable.

| Tecnología | Versión | Descripción |
|---|---|---|
| ☕ Java | 21 | Lenguaje de programación |
| 🌱 Spring Boot | 3.4.2 | Framework principal de la aplicación |
| 🗄️ Spring Data JPA | 3.4.2 (Boot) | Persistencia y acceso a datos |
| 🌐 Spring Web | 3.4.2 (Boot) | Desarrollo de la capa web |
| 🎨 Thymeleaf | 3.4.2 (Boot) | Motor de plantillas para las vistas |
| 🔐 Thymeleaf Extras Spring Security | 6 | Integración de elementos de seguridad en las vistas |
| ✅ Spring Validation | 3.4.2 (Boot) | Validación de datos |
| 🔄 Flyway | 10.10.0 | Control de versiones y migraciones de base de datos |
| 🐘 PostgreSQL | - | Sistema gestor de base de datos relacional |
| 🧰 Lombok | - | Reducción de código repetitivo |
| 🧪 JUnit / Spring Boot Test | 3.4.2 (Boot) | Pruebas unitarias y de integración |
| 🐘 Gradle | - | Gestión de dependencias y construcción del proyecto |

## 🏗️ Arquitectura del proyecto

La aplicación sigue una arquitectura organizada por capas, separando las responsabilidades para facilitar el mantenimiento, la reutilización del código y la evolución del proyecto.

Las principales capas son:

- **Controller:** recibe y gestiona las peticiones HTTP.
- **Service:** contiene la lógica de negocio de la aplicación.
- **Repository:** se encarga del acceso y comunicación con la base de datos mediante Spring Data JPA.
- **Model:** contiene las entidades que representan los elementos del dominio.
- **DTO:** define los objetos utilizados para transferir información entre las diferentes capas.
- **Configuration:** centraliza las configuraciones necesarias para el funcionamiento de la aplicación.

## 📐 Diagrama UML

A continuación se puede consultar el diagrama UML del proyecto, donde se representa el diseño de las entidades y sus relaciones.

<p align="center">
  <a href="https://drive.google.com/file/d/146vW3pdmnCkxPMrEnvQrLJiFkln0jT-B/view?usp=sharing">
    **📊 Consultar diagrama UML**
  </a>
</p>

## ⚙️ Instalación y configuración

### Requisitos previos

Para ejecutar el proyecto es necesario disponer de:

- Java JDK 21.
- PostgreSQL.
- Git.

### Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

### Configuración de la base de datos

Crear una base de datos en PostgreSQL y configurar las propiedades de conexión en el archivo `application.properties` o `application.yml`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/NOMBRE_BBDD
spring.datasource.username=USUARIO
spring.datasource.password=CONTRASEÑA
```

Flyway se encarga de gestionar las migraciones y mantener actualizado el esquema de la base de datos.

### Ejecutar la aplicación

Desde la raíz del proyecto:

```bash
./gradlew bootRun
```

En Windows:

```bash
gradlew.bat bootRun
```

## 🧪 Pruebas

El proyecto incorpora Spring Boot Test y JUnit para facilitar la implementación y ejecución de pruebas.

Para ejecutar los tests:

```bash
./gradlew test
```

## 🚧 Estado del proyecto

<kbd>En desarrollo</kbd>

La aplicación se encuentra en desarrollo y sus funcionalidades irán evolucionando según las necesidades que surjan durante su utilización.

El objetivo es construir una herramienta sencilla, práctica y adaptada a nuestra forma de trabajar con las creaciones de resina.

---

<p align="center">
  <strong>Resigna2</strong>
  <br/>
  <em>Porque cada creación tiene su historia. ❤️</em>
</p>