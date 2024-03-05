#Rutas
1.	GET – Obtiene el listado de empresas
“http://localhost:8001/listar”

2.	POST – Registra una nueva empresa
“http://localhost:8001/save”
Body:
{
"nombre": "nombre empresa",
"nit" : "nit empresa",
"fecha_fundacion": "2024-04-03",
"direccion": "direccion empresa"
}

3.	PUT – Modifica los datos de un registro
“http://localhost:8001/update”
Body:
{
"id": 1,
"nombre": "nombre update",
"nit": " nit empresa ",
"fecha_fundacion": "2024-04-03",
"direccion": " direccion empresa "
}

4.	DELETE – Elimina un registro mediante su ID
“http://localhost:8001/delete/2”

#Ejecutar Proyecto
Ejecutar comando para construir el archivo .jar en la carpeta raiz del proyecto “mvn clean package”.
Ejecutar comando para levantar el proyecto compilado en el archivo .jar, ejecutarlo en la carpeta donde este ubicado el archivo “java -jar nombre-del-archivo.jar”



#Esquema de la base de datos
 ![Captura de pantalla (335)](https://github.com/FerAma20/ByteNumeral3/assets/62443757/94a1134d-c508-46cb-acd5-fa9780b608a6)


#Script de la DB

CREATE DATABASE bytes
USE bytes

CREATE TABLE `empresa` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_fundacion` datetime(6) DEFAULT NULL,
  `nit` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

![Captura de pantalla (336)](https://github.com/FerAma20/ByteNumeral3/assets/62443757/a31e2ec5-796d-4059-8786-37a17d9b76ec)

Nota: Es importante mencionar que al usar JPA se utilizo la herramienta de vinculación las entidades del proyecto con las entidades de la base de datos, esto actualiza los cambios en el proyecto y los refleja en la base de datos.
