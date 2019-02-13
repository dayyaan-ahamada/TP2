package fr.umontpellier.iut.exercice2;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
    public List<Integer> computeFactors(int number) {

        List<Integer> list = new ArrayList<>();
        int i=2;
        while(number!=1) {
            while(number%i!=0){
                i++;
            }
            number=number/i;
            list.add(i);
            i=2;
        }
        return list;
    }
}