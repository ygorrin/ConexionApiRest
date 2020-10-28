# ConexionApiRest
Proyecto Backend, elaborado con las siguientes tecnologías:
JPA, Java EE, MySQL, SpringBoot, HTML, JQuery, Json, ApiRest, Ajax, Eclipse 2020

Alcance 📦
1.	 RESTful API con 2 rutas de conexion
2.	 Consulta a base de datos en contenedor MySQL
3.	 Testing de funciones de BackEnd
4.	 Documentacion (README.md)


Instrucciones de Ejecución 🔧
1.	Abrir el proyecto YamyRest en Eclipse (Open Proyect from file system)
2.  Conectar a la base de datos en al Application Proprieties
3.	Ejecutar Run As SpringBoot APP (BackEnd). Debe aparecer en la consola de Eclipse, el siguiente mensaje “Started YamyRestApplication”
4.	Dejar el proyecto abierto, para que mantenga la conexión al servidor.
5.	Abrir el archivo index.html que está dentro de la carpeta YamyRest Front
6.	Aqui, puede agregar, modificar o eliminar los productos y servicios que desee, presionando los botones correspondientes, y actualizando la página

Test Realizados ⚙️
1. Test Junit: La primera prueba ejecutada, fue a través del test Junit, en el cual se verifica la conexión a base de datos, y se ingresan los primeros valores a la tabla. Ruta Prueba JUnit src/test/java/YamyRestApplicationTest – Run As -JUnitTest 
2. Test por consola: usando el inspector de páginas web, realizamos alguna de las acciones agregar, modificar, o eliminar. Ejecuntando una acción, se puede testear por consola, observando los parámetros de testing: ReadyState: 4 (request finished and response is ready), y status 200("OK"). Adicionalmente, al actualizar la página se observa el cambio efectivo realizado, por su presencia en la lista.


