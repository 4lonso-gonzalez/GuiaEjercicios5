/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaejercicios5;
import java.util.Scanner;

/**
 *
 * @author alons
 */
public class GuiaEjercicios5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU GUIA SEMANA 5");
            System.out.println("1. Calcular la distancia");
            System.out.println("2. Impresion primeros diez numeros");
            System.out.println("3. Suma primeros diez numeros");
            System.out.println("4. Numero Par o Impar");
            System.out.println("5. Promedio de 30 numeros");
            System.out.println("6. Impresion Pares primeros veinte numeros");
            System.out.println("7. Suma Impares primeros cuatrocientos numeros");
            System.out.println("8. Area de un Circulo");
            System.out.println("9. Perimetro de un Circulo");
            System.out.println("10. Area de un Rectangulo");
            System.out.println("11. Volumen de una Esfera");
            System.out.println("12. Area y Perimetro de un Cubo");
            System.out.println("13. Impresion primeros cien numeros sin los Multiplos de 3");
            System.out.println("14. Impresion primeros cien numeros sin los Multiplos de 5");
            System.out.println("15. Impresion primeros cien numeros sin los Multiplos de 3 y 5");
            System.out.println("16. Impresion primeros cien numeros con Multiplos de 3 como Cuek");
            System.out.println("17. Factorial de numero");
            System.out.println("18. Cantidad de digitos de un numero");
            System.out.println("19. Area y Perimetro de un Cuadrado");
            System.out.println("20. Potencia de un numero");
            System.out.println("21. Cerrar Menu");
            System.out.println("Eliga una opcion: ");
            opcion = leer.nextInt();

            Funciones operacion;
            int valor = 0;
            int valor2;
            String respuesta;

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese el valor para calcular la distancia: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    operacion.CalcularDistancia(valor);
                    System.out.println();
                    break;
                case 2:
                    operacion = new Funciones(valor);
                    operacion.ImprimirUnoDiez();
                    System.out.println();
                    break;
                case 3:
                    operacion = new Funciones(valor);
                    operacion.SumarUnoDiez();
                    System.out.println();
                    break;
                case 4:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    operacion.ParImpar(valor);
                    System.out.println();
                    // Preguntar si quiere usar otro numero con ciclo while
                    break;
                case 5:
                    do {
                        System.out.println("Ingrese los 30 valores deseados: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    operacion.Promedio30();
                    System.out.println();
                    break;
                case 6:
                    operacion = new Funciones(valor);
                    operacion.ParUnoVeinte();
                    System.out.println();
                    break;
                case 7:
                    operacion = new Funciones(valor);
                    operacion.SumaImparUnoCuatrocientos();
                    System.out.println();
                    break;
                case 8:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    double areacirculo = operacion.AreaCirculo(valor);
                    System.out.println("El area del circulo es: " + areacirculo);
                    System.out.println();
                    break;
                case 9:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    double percirculo = operacion.PerCirculo(valor);
                    System.out.println("El perimetro del circulo es: " + percirculo);
                    System.out.println();
                    break;
                case 10:
                    do {
                        System.out.println("Ingrese los lados del rectangulo: ");
                        try {
                            System.out.println("Lado a: ");
                            valor = leer.nextInt();
                            System.out.println("Lado b: ");
                            valor2 = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor, valor2);
                    double arearec = operacion.AreaRec(valor, valor2);
                    System.out.println("El area del rectangulo es: " + arearec);
                    System.out.println();
                    break;
                case 11:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    double volesf = operacion.VolumenEsfera(valor);
                    System.out.println("El volumen de la esfera es: " + volesf);
                    System.out.println();
                    break;
                case 12:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    double areacubo = operacion.AreaCubo(valor);
                    double percubo = operacion.PerCubo(valor);
                    System.out.println("El area del cubo es: " + areacubo);
                    System.out.println("El perimetro del cubo es: " + percubo);
                    System.out.println();
                    break;
                case 13:
                    operacion = new Funciones(valor);
                    System.out.println("La secuencia de numeros es la siguiente: ");
                    operacion.Mult3();
                    System.out.println();
                    break;
                case 14:
                    operacion = new Funciones(valor);
                    System.out.println("La secuencia de numeros es la siguiente: ");
                    operacion.Mult5();
                    System.out.println();
                    break;
                case 15:
                    operacion = new Funciones(valor);
                    System.out.println("La secuencia de nuemros es la siguiente: ");
                    operacion.Mult3y5();
                    System.out.println();
                    break;
                case 16:
                    operacion = new Funciones(valor);
                    System.out.println("La secuencia con Cuek es la siguiente: ");
                    operacion.Mult3Cuek();
                    System.out.println();
                    break;
                case 17:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            operacion = new Funciones(valor);
                            double factorial = operacion.Factorial(valor);
                            System.out.println("El factorial del valor es: " + factorial);
                            
                            System.out.println("Desea ingresar otro numero? (S/N): ");
                            respuesta = leer.next().toUpperCase();
                            if (!respuesta.equals("S") && !respuesta.equals("N")) {
                                throw new Exception("Respuesta inválida");
                            }
                            if (respuesta.equals("N")) {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese un valor valido");
                            leer.nextLine();
                        }
                    } while (true);
                    System.out.println();
                    break;
                case 18:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            operacion = new Funciones(valor);
                            double cantdig = operacion.CantidadDigitos(valor);
                            System.out.println("La cantidad de digitos que tiene el valor es: " + cantdig);
                            
                            System.out.println("Desea ingresar otro numero? (S/N): ");
                            respuesta = leer.next().toUpperCase();
                            if (!respuesta.equals("S") && !respuesta.equals("N")) {
                                throw new Exception("Respuesta invalida");
                            }
                            if (respuesta.equals("N")) {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese un valor valido");
                            leer.nextLine();
                        }
                    } while (true);
                    System.out.println();
                    break;
                case 19:
                    do {
                        System.out.println("Ingrese el valor deseado: ");
                        try {
                            valor = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor);
                    double areacuadrado = operacion.AreaCuadrado(valor);
                    double percuadrado = operacion.PerCuadrado(valor);
                    System.out.println("El area del cuadrado es: " + areacuadrado);
                    System.out.println("El perimetro del cuadrado es: " + percuadrado);
                    System.out.println();
                    break;
                case 20:
                    do {
                        System.out.println("Ingrese los valores de la potencia: ");
                        try {
                            System.out.println("Base: ");
                            valor = leer.nextInt();
                            System.out.println("Exponente: ");
                            valor2 = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("El valor asignado no es un numero, ingrese de nuevo");
                            leer.nextLine();
                        }
                    } while (true);
                    operacion = new Funciones(valor, valor2);
                    double potencia = operacion.Potencia(valor, valor2);
                    System.out.println("La potencia de los valores es: " + potencia);
                    System.out.println();
                    break;
                case 21:
                    System.out.println("CERRANDO MENU...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 21);
    }

}
