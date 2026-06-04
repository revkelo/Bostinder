# Bostinder

Aplicación de escritorio estilo **Tinder** desarrollada en Java con interfaz gráfica Swing. Proyecto grupal universitario — Universidad El Bosque.

Los usuarios se registran, arman su perfil y pueden dar likes a otros perfiles. El sistema detecta matches, envía correos de bienvenida automáticos y genera reportes en PDF con estadísticas.

## Características

- **Registro de usuarios** con validación completa (nombre, apellidos, sexo, fecha de nacimiento, ingresos, estado civil)
- **Sistema de likes y matches** — contador de likes recibidos, otorgados y matches
- **Feed de perfiles** con fotos de muestra (40 perfiles: 20 hombres, 20 mujeres)
- **Envío de email** de bienvenida con credenciales vía Gmail SMTP
- **Generación de PDF** con reportes del sistema usando iTextPDF
- **Gráficas estadísticas** con JFreeChart
- **Persistencia en CSV** — los datos se guardan en `datos.csv`
- **Panel administrador** con vista completa de usuarios
- **5 excepciones personalizadas** para validación de campos
- **5 clases de prueba** unitarias

## Stack

- Java 17 — Swing (GUI)
- [JavaMail](https://javaee.github.io/javamail/) — envío de emails SMTP
- [iTextPDF 5](https://itextpdf.com/) — generación de PDFs
- [JFreeChart 1.0.19](https://www.jfree.org/jfreechart/) — gráficas
- Patrón MVC + DAO/DTO
- Persistencia en CSV

## Estructura

```
src/co/edu/unbosque/
├── controller/
│   ├── AplMain.java          # Punto de entrada
│   └── Controller.java       # Lógica central (ActionListener + MouseListener)
├── model/
│   ├── PersonaDTO.java       # Modelo de usuario (16 atributos)
│   ├── PersonaDAO.java       # Interfaz CRUD
│   ├── PersonaDAOImpl.java   # Implementación CRUD
│   ├── Correos.java          # Envío de email de bienvenida
│   ├── Pdf.java              # Generación de reportes PDF
│   ├── Ordenamiento.java     # Algoritmos de ordenamiento
│   └── persistance/
│       ├── FileHandler.java  # Lectura/escritura CSV
│       └── datos.csv         # Base de datos local
├── util/
│   ├── CaracteresException.java
│   ├── CorreoException.java
│   ├── FechaException.java
│   ├── LetrasException.java
│   └── NumerosException.java
└── view/                     # 12 paneles y ventanas Swing
    ├── VentanaInicio.java
    ├── VentanaPrincipal.java
    ├── VentanaAdmin.java
    ├── PanelFeed.java
    ├── PanelRegistro.java
    ├── PanelPerfil.java
    └── ...
```

## Instalación

```bash
git clone https://github.com/revkelo/Bostinder.git
```

Abrir en Eclipse o IntelliJ como proyecto Java existente. Asegurarse de que las librerías en `libs/` estén en el classpath:
- `itextpdf-5.5.9.jar`
- `jfreechart-1.0.19.jar`
- `jcommon-1.0.23.jar`
- `mail.jar`

Ejecutar `AplMain.java`.

## Credenciales de demo

| Rol | Usuario | Contraseña |
|-----|---------|------------|
| Administrador | `admin` | `0` |

## Configuración del correo

Para activar el envío de emails, crear `src/co/edu/unbosque/model/persistance/config.properties` basado en el ejemplo incluido:

```properties
email=tu_correo@gmail.com
password=tu_app_password_de_gmail
```

> Necesitas una [App Password de Gmail](https://myaccount.google.com/apppasswords).
> El archivo `config.properties` está en `.gitignore`.

También puedes usar variables de entorno: `BOSTINDER_EMAIL` y `BOSTINDER_PASSWORD`.

## Autores

Proyecto grupal — Universidad El Bosque, 2023

- Daniela
- Jose
- **Kevin Gonzalez**
- Nicolás
