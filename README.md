# AREP-Bono

## Resumen
El proyecto consiste en la creación de un servidor utilizando SparkWeb, una tecnología de servidor web de alto rendimiento, y luego empaquetar este servidor en una imagen de Docker. Una vez creada la imagen de Docker con la configuración deseada, se sube al repositorio DockerHub para su distribución y fácil acceso, permitiendo así desplegar el servidor de manera eficiente y escalable en diferentes entornos de manera sencilla.

## Funcionamiento
El servidor funciona de la siguiente manera:
1. El servidor se inicia mediante la clase `SparkWebServer`, donde se inicializan las funciones a ejecutar y devuelve el formulario Http para probarlas.
2. Los componentes y servicios se registran mediante `Funciones Lambda`.
3. El servidor escucha en un puerto específico `4567` y espera solicitudes entrantes por los campos de los formularios.
4. Cuando llega una solicitud HTTP, el servidor la procesa y busca el servicio correspondiente.
5. Si encuentra un servicio registrado para la URL de la solicitud, lo ejecuta y devuelve una respuesta HTTP.
6. Si no encuentra un servicio registrado, devuelve un mensaje de error o una página predeterminada.

## Cómo Usar Este Proyecto
Para usar este proyecto, siga estos pasos:

1. Clone el repositorio en su máquina local.
2. Actualizar las dependencias utilizando Maven `mvn clean install`.
3. Compile el proyecto utilizando Maven `java -cp "target/classes;target/dependency/*" edu.eci.arep.SparkWebServer`.
4. El servidor se iniciará y estará listo para recibir solicitudes en el puerto 4567.
5. Acceder a los servicios a través del navegador en `localhost:4567`.
6. Hacer uso de la función que desee!

## Pruebas de Funcionamiento:

### /magnitude
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/c036c918-7353-424f-8ded-fe0a16177763)
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/06dd624a-a438-4d7c-8f2e-cf83d9d22b16)
### /palindrome
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/eb556aa0-eb69-4569-97ed-bb06ddcfd8d2)
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/e265a941-8cfa-4c46-822e-d7557bf06a3c)
### /sin
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/18082beb-d135-4b3f-af20-cb8e2d6e835e)
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/e0cfc75c-dab3-47ff-9462-1fc4f5f16548)
### /cos
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/96f712b2-1a81-4663-9ae0-174bcf470b25)
![image](https://github.com/SanRocks1220/AREP-Bono/assets/99696682/1e51785d-b7ce-43bd-ba3c-835aa59650cb)

### Docker
![image](https://github.com/SanRocks1220/AREP-Bono-Terminado/assets/99696682/608f08b9-fa69-4922-a223-18a65120cd16)

Link a Docker: `https://hub.docker.com/repository/docker/sanrocks12/virtualizacion_completa/general`



## Autor
- [Santiago Andres Rocha C.](https://github.com/SanRocks1220)

## Colaboradores
- [David Valencia](https://github.com/DavidVal6)






