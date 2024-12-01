# SaludXpert

Salud Xpert es un software de gestión de citas médicas desarrollado por J.S.A.B.F Technology que se 
utiliza para optimizar el tiempo de los doctores y mejorar la experiencia de los pacientes. 
Este sistema puede ser implementado en consultorios y clínicas médicas, proporcionando una 
solución eficiente y segura para la administración de citas y datos médicos.

El software incluye funciones destacadas como la gestión dinámica de citas con sobreventa de turnos,
actualizaciones en tiempo real del estado de las citas, almacenamiento seguro de historiales médicos, 
y recordatorios automáticos enviados por correo electrónico.



## Tabla de Contenidos
1. [Características](#características)
2. [Requisitos](#requisitos)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Estructura del Proyecto](#estructura-del-proyecto)
6. [Contribuciones](#contribuciones)
7. [Licencia](#licencia)

   
## Características
- Gestión de doctores, recepcionistas y especialidades.
- Interfaz gráfica creada con Java Swing.
- Soporte para la base de datos SQL para almacenar datos.
- Separación en capas **Modelo-Vista-Controlador (MVC)**.
- Escalable y fácil de mantener.

  ## Requisitos
1. **Software**:
   - Java JDK 11 o superior.
   - Servidor SQL (MySQL, PostgreSQL o similar).
   - IDE compatible con Java (NetBeans, IntelliJ IDEA, Eclipse).
2. **Hardware**:
   - PC con al menos 4 GB de RAM y 10 GB de espacio libre en disco.

     ## Instalación

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tuusuario/saludxpert.git
   Configura la base de datos:
Crea una base de datos nueva en tu servidor SQL.
Importa el archivo SQL desde la carpeta database/:sql
source database/schema.sql;

Abre el proyecto en tu IDE.

Configura el archivo de conexión a la base de datos:

Modifica las credenciales en la clase Conexion.java dentro de src/modelo/.

Ejecuta el proyecto desde tu IDE o mediante la línea de comandos:
java -jar SaludXpert.jar

##Uso
1. Inicio de Sesión
Credenciales de prueba:
Usuario: admin
Contraseña: admin123
2. Funcionalidades Principales
a. Gestión de Doctores
Agregar, actualizar y eliminar doctores desde el módulo de administración.
b. Gestión de Citas
Visualizar citas agendadas.
Crear y editar citas desde la interfaz gráfica.

##Estructura del Proyecto

SaludXpert/
├── src/
│   ├── modelo/          # Clases para la lógica de negocio (AdminDAO, UsuariosDAO, etc.)
│   ├── vista/           # Interfaces gráficas desarrolladas con Java Swing
│   └── controlador/     # Controladores que conectan modelo y vista
├── database/            # Archivos SQL para la configuración de la base de datos
├── doc/                 # Documentación generada con Javadoc
├── assets/              # Recursos gráficos como íconos y capturas
└── README.md            # Documentación principal

##Contribuciones
Haz un fork del repositorio.
Crea una nueva rama para tus cambios:
"git checkout -b feature/nueva-funcionalidad"

