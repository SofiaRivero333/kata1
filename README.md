Objetivo de la entrega:
Proyecto para familiarizarnos con IntelliJ y Git.

Cómo compilar y ejecutar:
Abrimos el proyecto en IntelliJ, configuramos el JDK y cargamos Maven, creamos dos clases y en el Main le damos a Run para ejercutar.
Para comprobar una copia limpia, usar Clone Repository con el link que tenemos en gitHub.

Dependencias y versión del JDK:
- IntelliJ y JDK 26.0.2
- Maven: configuración y dependencias en pom.xml.
Estructura de la entrega y clases principales
La entrega contiene las clases: Person, que guarda el nombre y la edad y calcula si la persona es mayor de edad y el Main crea una persona y muestra los resultados.
Luego tenemos: pom.xml que configura el proyecto Maven, gitignore que indica qué archivos debe ignorar Git y el README Qcontiene las instrucciones de la entrega.

Flujo Git usado: rama principal main o master, rama develop, commits realizados y pusha GitHub:
La rama principal es master pero el desarrollo se realiza en develop. Los commits realizados se ven dentro del historial de commits que diferencias entre:
- Kata1 Repetition 2: (Acción correspondiente)
- Kata1 Repetition 3: (Acción correspondiente)
Estas dos hacen referencia a las repeticiones.
Al terminar, se integran los cambios de develop en master mediante un merge y se hace push de ambas ramas a GitHub.

Git y repeticiones:
Trabajo en develop, commits de estructura, implementación y documentación, integración en master y push de ambas ramas.
Cada repetición reconstruye Person y Main, ejecuta el programa y usa el depurador, menos en la repetición 2 que no depuré, pero en las tres se realiza lo mismo.
En el historial de commits se verá esto, haciendo referencia a las repeticiones:
- Kata1 Repetition 2: (Acción correspondiente)
- Kata1 Repetition 3: (Acción correspondiente)

Comando o pasos usados para clonar el repositorio y comprobar que compila fuera de la carpeta original:
En IntelliJ, seleccionamos Clone repository e introducimos https://github.com/SofiaRivero333/kata1.git`, elegimos una carpeta nueva, diferente de la original, y pulsamos
Clone. Abrimos la copia en la rama `master`, configuramos el JDK y cargamos el proyecto Maven. Abrimos Maven, luego Lifecycle y por ultimo compile comprobamos que aparece 
BUILD SUCCESS. Ejecutamos el Main mediante el triángulo verde y comprobammos los resultados en consola.

Verificación:
- Con 17 años devuelve false; con 18 y 20, true.
- Main funciona desde el editor y desde su configuración.
- Los breakpoints del constructor y del cálculo permiten observar los parámetros y la edad.
- Rename de adult a isAdult actualiza también Main.
- La copia limpia compila y funciona.
- Master y develop están publicadas.

Video:
https://youtu.be/WP_BW_tYwZ8
