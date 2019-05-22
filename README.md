# Maven Project Template

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

## Eclipse

Ejecutar el siguiente comando dentro de la raíz del proyecto para configurar el proyecto para Eclipse:

```bash
mvn eclipse:eclipse
```

