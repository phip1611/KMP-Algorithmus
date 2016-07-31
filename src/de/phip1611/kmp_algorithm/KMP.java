package de.phip1611.kmp_algorithm;

/**
 * Von: Philipp Schuster (@phip1611)
 * Stand: 2016-08-01 August
 *
 * Beschreibung:
 *  Berechnet die Verschiebetabelle für ein Pattern nach dem KMP-Algorithmus
 *  beziehungsweise nach der Vorschrift, wie sie von Professor Vogler an der TU Dresden gelehrt wird.
 */
public class KMP {
    public static int[] analyze(String pattern) {
        if (pattern == null) {
            throw new NullPointerException("Pattern shouldn't be null!");
        }
        if (pattern.isEmpty()) {
            return new int[0];
        }

        int[] verschiebetabelle = new int[pattern.length()];
        // Fortschritt zeigt bis wohin die Tabelle schon ausgefüllt ist
        int zeiger = 0, schrittweite = 1, fortschritt = 0;
        verschiebetabelle[0] = -1;
        while (zeiger+schrittweite < pattern.length()) {
            if (pattern.charAt(zeiger) == pattern.charAt(zeiger+schrittweite)) {
                if (fortschritt+1 == zeiger+schrittweite) {
                    verschiebetabelle[zeiger+schrittweite] = verschiebetabelle[zeiger];
                    fortschritt++;
                }
                zeiger++;
            } else {
                if (fortschritt+1 == zeiger+schrittweite) {
                    verschiebetabelle[zeiger+schrittweite] = zeiger;
                    fortschritt++;
                }
                zeiger = 0;
                schrittweite++;
            }
        }
        return verschiebetabelle;
    }
}
