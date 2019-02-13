package fr.umontpellier.iut.exercice1;

public class App {

    public static void main(String[] args) {
        FizzBuzz Fb = new FizzBuzz();
        String[] result = Fb.computeList(5);
        for (int i=0; i<20; i++) {
            System.out.print(result[i] + ';');
        }
    }

}