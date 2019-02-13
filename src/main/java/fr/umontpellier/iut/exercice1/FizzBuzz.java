package fr.umontpellier.iut.exercice1;

public class FizzBuzz<s> {

    public String getValue(int i) {
        String s;
        if(i%5==0 && i%3==0) {
            s="FizzBuzz";
        }
        else if(i%3==0){
            s="Fizz";
        }
        else if(i%5==0){
            s="Buzz";
        }
        else {
            s=Integer.toString(i);
        }
        return s;
    }

    public String[] computeList(int i) {
        String[] result = new String[i];
        for (int j = 0; j < i; j++){
            result[j] = getValue(j+1);
        }
        return result;
    }
}