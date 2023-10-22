public class Main {
    public static void main(String[] args) {
        int[] notenListe = {67, 21, 93, 99, 90, 72, 69, 65, 13, 14};
        int[] noten = {5, 6, 10};

        problem_1 note = new problem_1();
        int[] resultArray = note.nichtAusreichend(notenListe);

        System.out.print("Nicht ausreichende Noten: ");
        for (int j : resultArray) {
            if (j != 0)
                System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Durchschnittswert der Noten: ");
        System.out.print(note.durchschnitt(noten));


        int[] roundedGrades = note.abgerundet(notenListe);

        System.out.println();
        System.out.print("Abgerundete Noten: ");
        for (int roundedGrade : roundedGrades) {
            System.out.print(roundedGrade + " ");
        }

        int maxAbgerundeteNote = note.maxAbgerundet(notenListe);
        System.out.println();

        System.out.println("Maximale abgerundete Note: " + maxAbgerundeteNote);

        System.out.println();
    }
}