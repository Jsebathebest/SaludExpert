# SaludXpert
![Imagen de WhatsApp 2024-12-01 a las 23 14 39_13014f41](https://github.com/user-attachments/assets/2226d1cf-1110-41d6-b1d0-cebbde179bcb)

![Imagen de WhatsApp 2024-12-01 a las 23 14 39_9c54af03](https://github.com/user-attachments/assets/444ef47f-0ffb-49be-9227-fd4865efbd9a)


SaludXpert es un software de gestión de citas médicas
desarrollado por J.S.A.B.F Technology que se utiliza para optimizar 
el tiempo de los doctores y mejorar la experiencia de los pacientes. 
Este sistema puede ser implementado en consultorios y clínicas médicas, 
proporcionando una solución eficiente y segura para la administración de 
citas y datos médicos.

El software incluye funciones destacadas como la gestión dinámica de citas 
con sobreventa de turnos, actualizaciones en tiempo real del estado de las
citas, almacenamiento seguro de historiales médicos, y recordatorios automáticos 
enviados por correo electrónico.

Desarrollado en Java con Java Swing para la interfaz gráfica y MySQL para el manejo
de la base de datos, Salud Xpert garantiza una experiencia intuitiva, eficiente y 
segura para sus usuarios.


## Tabla de Contenidos
1. [Características](#características)
2. [Requisitos](#requisitos)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Estructura del Proyecto](#estructura-del-proyecto)
6. [Contribuciones](#contribuciones)
7. [Licencia](#licencia)
8. [Documentacion adicional](#Documentacion-adicional)



## Características
- Gestión de doctores, recepcionistas y especialidades.
- Interfaz gráfica creada con Java Swing.
- Soporte para la base de datos SQL para almacenar datos.
- Separación en capas **Modelo-Vista-Controlador (MVC)**.
- Escalable y fácil de mantener.

![Imagen de WhatsApp 2024-12-01 a las 19 26 33_494772ab](https://github.com/user-attachments/assets/e53444f7-e43e-4637-bea2-a677e8a0b991)

![Imagen de WhatsApp 2024-12-01 a las 19 26 33_79f92d36](https://github.com/user-attachments/assets/53ae91fa-6316-4749-a7b6-f6b7dc95b17b)

![Imagen de WhatsApp 2024-12-01 a las 19 26 32_6be98775](https://github.com/user-attachments/assets/772dab4c-bf3a-48af-b217-a30831cdb02e)







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

2. Configura la base de datos:
 -Crea una base de datos nueva en tu servidor SQL.
 -Importa el archivo SQL desde la carpeta database/:
    source database/schema.sql;
3. Abre el proyecto en tu IDE.
4. Configura el archivo de conexión a la base de datos:
     -Modifica las credenciales en la clase Conexion.java dentro de src/modelo/.
5. Ejecuta el proyecto desde tu IDE o mediante la línea de comand
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

│   ├── modelo/          # Clases para la lógica de negocio (AdminDAO, UsuariosDAO, etc.)

│   ├── vista/           # Interfaces gráficas desarrolladas con Java Swing

│   └── controlador/     # Controladores que conectan modelo y vista

├── database/            # Archivos SQL para la configuración de la base de datos

├── doc/                 # Documentación generada con Javadoc

├── assets/              # Recursos gráficos como íconos y capturas

└── README.md            # Documentación principal

## Contribuciones
1. Haz un fork del repositorio.
2. Crea una nueva rama para tus cambios
    git checkout -b feature/nueva-funcionalidad
3. Envía un pull request describiendo tus contribuciones.

## Licencia
Este proyecto está licenciado bajo la **Licencia Apache 2.0**. 

Puedes usar, modificar y distribuir este software bajo los términos de dicha licencia. Consulta el archivo `LICENSE` en este repositorio o revisa los detalles completos de la licencia en el siguiente enlace:  
[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).

## Documentacion adicional



  
