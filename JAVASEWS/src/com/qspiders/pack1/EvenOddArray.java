package com.qspiders.pack1;

import java.util.ArrayList;


public class EvenOddArray {

private int min(int n, int m)
{
    int min;
    if (n > m){
        min = m;
    }
    else {
        min = n;
    }
    return min;
}


public ArrayList<Integer> generateEvenOddArray(int[] list)
{
    ArrayList<Integer> oddList = new ArrayList<Integer>();
    ArrayList<Integer> evenList = new ArrayList<Integer>();
    ArrayList<Integer> resultList = new ArrayList<Integer>();

    for (int number : list) {
        if (number%2 == 0){
            evenList.add(number);
        }
        else {
            oddList.add(number);
        }

    }


    int numberOfEvenNumbers = evenList.size();
    int numberOfOddNumbers = oddList.size();
    int minOfOddAndEven = min(numberOfEvenNumbers,numberOfOddNumbers);
    ArrayList<Integer> longestList = getLongestList(evenList,oddList);

    int i ;
    for (i = 0; i < minOfOddAndEven; i++) {
        resultList.add(2*i,oddList.get(i) );
        resultList.add(2*i+1,evenList.get(i));          
    }
    if(longestList != null ){
        for (int j = i; j < longestList.size(); j++) {
            resultList.add(longestList.get(j));
        }
    }
    return resultList;


}
private ArrayList<Integer> getLongestList(ArrayList<Integer> listone,
        ArrayList<Integer> listTwo) {
    if (listone.size()<listTwo.size()){
        return listTwo;
    }
    else if (listone.size()>listTwo.size()){
        return listone;
    }
    return null;
}
}
