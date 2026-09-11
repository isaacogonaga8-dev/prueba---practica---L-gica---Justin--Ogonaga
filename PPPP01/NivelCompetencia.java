/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pppp01;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class NivelCompetencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Puntaje reto 1: ");
        double reto1 = sc.nextDouble();
        System.out.print("Puntaje reto 2: ");
        double reto2 = sc.nextDouble();
        System.out.print("Puntaje reto 3: ");
        double reto3 = sc.nextDouble();
        System.out.print("Numero de errores: ");
        int errores = sc.nextInt();
        System.out.print("Tiempo total en minutos: ");
        double tiempo = sc.nextDouble();
        System.out.print("Resolvio desafio extra (S/N): ");
        String desafioExtra = sc.next();
        System.out.print("Descalificado por copia (S/N): ");
        String descalificado = sc.next();

        
        double puntajeBase = reto1 + reto2 + reto3;

        
        double penalizacion = errores * 4;

        
        double bonificacion = 0;
        if (desafioExtra.equalsIgnoreCase("S")) {
            bonificacion += 15;
        }
        if (tiempo < 30) {
            bonificacion += 10;
        }

       
        double puntajeFinal = puntajeBase - penalizacion + bonificacion;

        
        if (puntajeFinal < 0) {
            puntajeFinal = 0;
        }

        
        String nivel;
        if (puntajeFinal >= 90) {
            nivel = "Experto";
        } else if (puntajeFinal >= 70) {
            nivel = "Avanzado";
        } else if (puntajeFinal >= 50) {
            nivel = "Intermedio";
        } else if (puntajeFinal >= 30) {
            nivel = "Basico";
        } else {
            nivel = "Principiante";
        }

        
        if (descalificado.equalsIgnoreCase("S")) {
            nivel = "Descalificado";
        }

        
        String observacion = "Sin observaciones";
        if (puntajeFinal >= 70 && errores >= 5) {
            observacion = "Resultado inconsistente: revisar calidad de resolucion";
        }

        System.out.println("\n----- RESULTADO -----");
        System.out.println("Puntaje base: " + puntajeBase);
        System.out.println("Penalizacion: " + penalizacion);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Puntaje final: " + puntajeFinal);
        System.out.println("Nivel: " + nivel);
        System.out.println("Observacion: " + observacion);
    }
}