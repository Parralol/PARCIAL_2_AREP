# PARCIAL_2_AREP

## Desarrollado por Santiago Nicolás Parra Giraldo



### Video de funcionamiento del proyecto antes de las 5:40

https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/27e9a694-84a7-4cc9-b58e-f379f414994a


Adjunto agrego foto de la consola la cual nos muestra los requests realizados y su respuesta.

![WhatsApp Image 2024-04-02 at 5 11 01 PM](https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/d5feed8e-deb7-4086-aeea-078d3a0096e4)


### Video de funcionamiento del proyecto despues de las 5:40



https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/70675981-a71f-4dbf-8827-77bbcd1062d1




### Ejecucion en EC2

A la hora de querer ejecutar el proyecto, es necesario realizar lo siguiente:

1. crear 3 estancias EC2 como se ven a continuacion:

![image](https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/2589e88b-0fb2-447b-aaaf-2092ca883b66)

2. agregar a sus normas de seguridad los siguientes puertos y formas de acceso (esto se hace con una y cada una de las estancias)

![image](https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/f3b0fdc6-d9ef-4daf-a913-bcb60c4fdfdb)


3. Una vez hecho lo anterior se accede a la instancia EC2 por el shell (usando su llave y forma de acceso dada por EC2)

4. Una vez dentro de la consola de EC2 es necesario ejecutar los siguientes comandos para instalar lo necesario (esto se hace en todas las consolas)

  - sudo yum install maven
  - sudo yum install git
  - sudo yum install java-1.8.0-amazon-corretto
  - sudo yum install java-1.8.0-amazon-corretto-devel

5. Ahora debemos clonar el repositorio a todas las maquinas EC2 y donde lo descarguen deben hacer entrar a la carpeta de el repo (realizar cd a PARCIAL_2_AREP en cada maquina EC2)

6.
 ![image](https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/b03f5b56-4f0e-4044-8f67-ea50e15de439)

   Como podemos observar, la url de cada maquina esta quemada dentro de el codigo, asi que si deseas ejecutarlo, tendras que modificar la clase Serverfacade en la linea **17** para poder colocar las url's de tus maquinas back

7. Despues de esto, para ahorrarnos dolores de cabeza ejecutaremos (en cada maquina EC2)
   
         sudo mvn install

9. Ahora puedes ejecutar _sudo java -cp "target/classes:target/dependency/*" parcial.segundo.Serverfacade_ en el servidor que decidiste que sera fachada y

   _sudo java -cp "target/classes:target/dependency/*" parcial.segundo.MathService_ en las maquinas que decidas seran los servicios


10. Ahora, el codigo funciona de la siguiente manera:

![image](https://github.com/Parralol/PARCIAL_2_AREP/assets/110953563/fdee2569-32cf-4efa-a878-f881cc491c8f)

en el campo que dice "Funcion" debes escribir la funcion que deseas usar, sea _factors_ o _primes_ y bajo este debes colocar el numero que deseas operar
    
