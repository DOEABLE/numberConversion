/*File Name   : custKDHOidToId.html
  Description : 변환할 10진수와 몇 진수로 변환할 것인지 입력하면, 해당 진수로 변환해주는 함수
  Author      : Dohee, KIM
  since       : 2023-12-07
  Version     : 1.0*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class numberConversion {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);                         //1. 변환할 10진수 입력(System.in-> 사용자들에게 값을 입력받겠다.)
        System.out.printf("변환할 10진수를 입력하세요: ");
        int inputNum = input.nextInt();
        System.out.printf("어떤 진수로 변환하시겠습니까: ");
        int baseNum  = input.nextInt();

        System.out.println(convertNumberToN(inputNum,baseNum));
    }

    /*입력값과 몇진수로 변환할지 입력받고 해당 n진수로 반환하는 기능*/
    public static String convertNumberToN(int inputNum, int baseNum){
        ArrayList<Integer> reverseArrayOfNumber = new ArrayList<>();    //길이가 정해지지 않은 배열의 선언과 초기화

        int mok = inputNum;
        int remain;                                                     //나머지

        while(mok > 0){
            remain = mok % baseNum;
            reverseArrayOfNumber.add(remain);
            mok = mok / baseNum;
        }

        Collections.reverse(reverseArrayOfNumber);                      //배열 역순으로 정렬

        StringBuilder sb = new StringBuilder();                         //reverseArrayOfNumber를 문자열로 변환하기위해 StringBuilder 사용
        for(int num : reverseArrayOfNumber){
            sb.append(num);
        }
        return sb.toString();
    }
}
