package de.phip1611.kmp_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean  terminalMode = true;
        if (args.length > 0) {
            if (args[0].equals("-gui")) {
                terminalMode = false;
                GUI gui = new GUI();
            }
        }
        if (terminalMode) {
            System.out.println("Patterns mit dem KMP-Algorithmus berechnen");
            System.out.println("Von Philipp Schuster (@phip1611)");
            System.out.println("(so wie es an der TU Dresden gelehrt wird)");
            System.out.println("===");
            System.out.println("Das Programm kann jederzeit mit \":exit\" beendet werden");
            System.out.println("Es kann jederzeit mit \":gui\" eine GUI gestartet werden");
            System.out.println("Wird das Programm mit dem Terminal-Befehl \"-gui\" aufgerufen, startet direkt die GUI");
            System.out.println("===");
            Scanner scanner = new Scanner(System.in);
            String input;
            boolean startGui = false;
            while (true) {
                System.out.println("Bitte die Zeichenkette/das Pattern eingeben:");
                System.out.print("Pattern: ");
                input = scanner.nextLine();
                if (input.isEmpty()) continue;
                if (input.equals(":exit")) System.exit(0);
                if (input.equals(":gui")) {
                    startGui = true;
                    break;
                }
                System.out.println("Verschiebetabelle:");
                System.out.println(Arrays.toString(KMP.analyze(input)));
            }
            if (startGui) {
                new GUI();
            }
        }

        /*String pattern1 = "aaaaa"; // -1 -1 -1 -1 -1
        System.out.println(Arrays.toString(KMP.analyze(pattern1)));
        String pattern2 = "ababba"; // -1 0 -1 0 2 -1
        System.out.println(Arrays.toString(KMP.analyze(pattern2)));
        String pattern3 = "ababaabb"; // -1 0 -1 0 -1 3 0 2
        System.out.println(Arrays.toString(KMP.analyze(pattern3)));
        String pattern4 = "abbabbaa"; // -1 0 0 -1 0 0 -1 4
        System.out.println(Arrays.toString(KMP.analyze(pattern4)));*/
    }
}
