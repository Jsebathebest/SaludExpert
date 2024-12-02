# SaludXpert
![Imagen de WhatsApp 2024-12-01 a las 23 14 39_b9a41ac2](https://github.com/user-attachments/assets/827629cd-4657-4f38-938e-ebfda536ddf0)}

 ![Imagen de WhatsApp 2024-12-01 a las 23 14 39_7c0f6b8c](https://github.com/user-attachments/assets/484c5d15-810c-4288-859b-5f3f460d6c79)




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
8. [Documentacion adicional](#Documentación-Adicional)

   
## Características
- Gestión de doctores, recepcionistas y especialidades.
- Interfaz gráfica creada con Java Swing.
- Soporte para la base de datos SQL para almacenar datos.
- Separación en capas **Modelo-Vista-Controlador (MVC)**.
- Escalable y fácil de mantener.
  ![Imagen de WhatsApp 2024-11-27 a las 00 01 23_01499fc4](https://github.com/user-attachments/assets/aa943f7c-4349-46c8-99cd-5a037abc3821)
  ![Imagen de WhatsApp 2024-12-01 a las 18 03 17_14f12f35](https://github.com/user-attachments/assets/d0d75b4a-4243-4347-961a-c9147d86c11a)
  ![Imagen de WhatsApp 2024-12-01 a las 18 03 18_1d86d4d5](https://github.com/user-attachments/assets/18f24e6d-3d26-4e82-b131-f27345c7c2ec)



## Requisitos
- **Sistema Operativo**: Windows, macOS o Linux.
- **Java**: JDK 8 o superior.
- **Base de Datos**: MySQL o PostgreSQL.
- **Herramientas**:
  - NetBeans (versión recomendada 12.6 o superior).
  - Conector JDBC para Java.

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

## Uso
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

## Estructura del Proyecto

SaludXpert/

├── src/

│   ├── modelo/    

#Clases para la lógica de negocio (AdminDAO, UsuariosDAO, etc.)

│   ├── vista/     

#Interfaces gráficas desarrolladas con Java Swing

│   └── controlador/   
#Controladores que conectan modelo y vista

├── database/     
#Archivos SQL para la configuración de la base de datos

├── doc/     

#Documentación generada con Javadoc

├── assets/

#Recursos gráficos como íconos y capturas

└── README.md            # Documentación principal

## Contribuciones
1- Haz un fork del repositorio.

2- Crea una nueva rama para tus cambios:
"git checkout -b feature/nueva-funcionalidad"

3-Envía un pull request describiendo tus contribuciones.

## Licencia
Este proyecto está licenciado bajo la **Licencia Apache 2.0**. 

Puedes usar, modificar y distribuir este software bajo los términos de dicha licencia. Consulta el archivo LICENSE en este repositorio o revisa los detalles completos de la licencia en el siguiente enlace:  
[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).  

## Documentación Adicional
La documentación técnica completa generada con Javadoc está disponible en el siguiente enlace:
