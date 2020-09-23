# Maven Project Template

Crear un proyecto Java con Maven:

```bash
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
```

Añadir lo siguiente dentro de la etiqueta `project` del fichero de configuración del proyecto `pom.xml`:

```xml
<properties>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <maven.compiler.source>1.8</maven.compiler.source>
  <maven.compiler.target>1.8</maven.compiler.target>
</properties>
```

> En el ejemplo se está compilando para Java 8 (1.8); debemos cambiarlo a la versión de Java que queramos (14, por ejemplo).

Convertir en un proyecto Eclipse:

```bash
cd <proyecto>
mvn eclipse:eclipse
```

## Usar este proyecto como plantilla

Proyecto base en Eclipse para Maven.

1. Descargar y entrar en el directorio del proyecto:

```bash
git clone https://github.com/dam-dad/MavenProjectTemplate.git
cd MavenProjectTemplate
```

2. Desconectar el proyecto de GIT:

- Desde la BASH en GNU/Linux o Mac OS X:

```bash
rm -fr .git
```

- Desde CMD en Windows:

```bash
rmdir /s /q .git
```

3. Importar el proyecto en Eclipse y empezar a trabajar.


