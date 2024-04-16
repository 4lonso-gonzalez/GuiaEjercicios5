/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaejercicios5;

/**
 *
 * @author alons
 */
public class Funciones {
    
    private int valor;
    private int valor2;
    
    public Funciones(int valor){
        this.valor = valor;
    }
    
    public Funciones(int valor, int valor2){
        this.valor = valor;
        this.valor2 = valor2;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void setValor2(int valor2){
        this.valor2 = valor2;
    }
    
    // 1.
    public void CalcularDistancia(int valor) {
        int centimetros = valor;
        int metros = 0;
        int kilometros = 0;
        while (centimetros >= 100) {
            metros++;
            centimetros -= 100;
            if (metros >= 1000) {
                kilometros++;
                metros -= 1000;
            }
        }
        System.out.println("Distancia: " + kilometros + " Km, " + metros + " M, " + centimetros + " Cm");
    }
    
    // 2.
    public void ImprimirUnoDiez(){
        int valor = 1;
        System.out.println("Numeros del 1 al 10:");
        while (valor <= 10) {
            System.out.println(valor);
            valor++;
        }
    }
    
    // 3.
    public void SumarUnoDiez(){
        int valor = 1;
        int suma = 0;
        while (valor <= 10) {
            suma += valor;
            valor++;
        }
        System.out.println("La suma de los numeros del 1 al 10 es: " + suma);
    }
    
    // 4.
    public void ParImpar(int valor){
        if (valor % 2 == 0) {
            System.out.println(valor + " es un numero par.");
        } else {
            System.out.println(valor + " es un numero impar.");
        }
    }
    
    // 5.
    public void Promedio30(){
        int suma = 0;
        for (int i = 1; i <= 30; i++) {
            suma += valor; 
        }
        double promedio = (double) suma / 30;
        System.out.println("El promedio de los 30 numeros es: " + promedio);
    }
    
    // 6.
    public void ParUnoVeinte(){
        int valor = 2;
        System.out.println("Números pares del 1 al 20:");
        while (valor <= 20) {
            System.out.println(valor);
            valor += 2;
        }
    }
    
    // 7.
    public void SumaImparUnoCuatrocientos(){
        int valor = 1;
        int suma = 0;
        while (valor <= 400) {
            suma += valor;
            valor += 2;
        }
        System.out.println("La suma de los numeros impares del 1 al 400 es: " + suma);
    }
    
    // 8.
    public double AreaCirculo(int valor){
        double radio = valor;
        if (radio == 0) {
            return 0;
        } else {
            double area = 0;
            double pi = 3.14;
            area = pi * (radio * radio);
            return area;
        }
    }
    
    // 9.
    public double PerCirculo(int valor){
       double radio = valor;
       if (radio == 0) {
            return 0;
        } else {
            double perimetro = 0;
            double pi = 3.14;
            perimetro = 2 * pi * radio;
            return perimetro;
        } 
    }
    
    // 10.
    public double AreaRec(int valor, int valor2) {
        if (valor == 0) {
            return 0;
        }
        if (valor2 == 0) {
            return 0;
        } else {
            double area = 0;
            area = valor * valor2;
            return area;
        }
    }
    
    // 11.
    public double VolumenEsfera(int valor){
        double radio = valor;
        if (radio <= 0) {
            return 0;
        } else {
            double volumen = 0;
            double pi = 3.14;
            volumen = (4/3) * pi * (radio * radio * radio);
            return volumen;
        }
    }
    
    // 12.1
    public double AreaCubo(int valor){
        double lado = valor;
        if (lado == 0) {
            return 0;
        } else {
            double area = 6 * lado * lado;
            return area;
        }
    }
    
    // 12.2
    public double PerCubo(int valor){
        double lado = valor;
        if (lado == 0) {
            return 0;
        } else {
            double perimetro = 12 * lado;
            return perimetro;
        }
    }
    
    // 13.
    public void Mult3(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
    
    // 14.
    public void Mult5(){
        int valor = 1;
        while (valor <= 100) {
            if (valor % 5 != 0) {
                System.out.println(valor);
            }
            valor++;
        }
    }
    
    // 15.
    public void Mult3y5(){
        int valor = 1;
        while (valor <= 100) {
            if (valor % 3 != 0 && valor % 5 != 0) {
                System.out.println(valor);
            }
            valor++;
        }
    }
    
    // 16.
    public void Mult3Cuek(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Cuek");
            } else {
                System.out.println(i);
            }
        }
    }
    
    // 17.
    public double Factorial(int valor){
        int factorial = 1;
        for (int i = valor; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
    
    // 18.
    public int CantidadDigitos(int valor){
        int contador = 0;
        while (valor != 0) {
            valor /= 10;
            contador++;
        }
        if (contador == 0) {
            contador = 1;
        }
        return contador;
    }
    
    // 19.1
    public double AreaCuadrado(int valor){
        return valor * valor;
    }
    
    // 19.2
    public double PerCuadrado(int valor){
        return 4 * valor;
    }
    
    // 20.
    public double Potencia(int valor, int valor2){
        int base = valor;
        int exponente = valor2;
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
}
