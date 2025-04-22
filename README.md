Se crea aplicacion de conversion de monedas tomando como base la moneda dolar 
Esta aplicacion consta de 2 archivos java Conversor.java y obtencioDatos.java
El archivo obtencioDatos.java se conecta con la api que obtuvimos de la pagina app.exchangerate-api.com para obterner los valores de los tipos de cambios de las diferentes monedas
El archivo Conversor.java es el que se encarga presentar un menu para que el usuario pueda interactuar con el conversor este menu consta de las siguientes opciones 
**************************************************************************
                        Sea bienvenido/a al Conversor de Moneda =)

                        1.- Dolar =>> Peso Argentino
                        2.- Peso Argentino =>> Dolar
                        3.- Dolar =>> Real Brasileño
                        4.- Real Brasileño =>> Dolar
                        5.- Dolar =>> Peso Chileno
                        6.- Peso Chileno =>> Dolar
                        7.- Salir
                        Digite una opcion Valida:
*************************************************************************
Si el usuario elegui la opcion 7 el converson se cerrara , de lo contrario si opta por cualquier de las otras opciones el conversor le solicicitara que ingrese el monoto a convertir y este hara los calculos correspondiente
Cada vez que conversor termina de hacer el calculo, el resultado de este sera impreso en pantalla , y luego le aparecera la opcion si desea hacar otro calculo o salir 
