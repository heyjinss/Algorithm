package Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    //1. 사용자에게 만들 배열의 [갯수] 입력받고 배열을 생성한다.
    System.out.println("요솟수:");
    int num = stdIn.nextInt();
    int[] x = new int[num];
    
    System.out.println("오름차순으로 입력하세요");
    
    //2. 첫번째 배열에 들어갈 값 입력 
    System.out.println("x[0]:");
    x[0] = stdIn.nextInt();
    
    //3. 두번째부터 들어갈 값 입력 (사용자가 입력한 값 만큼 빈복)
    for(int i = 1; i<num; i++) {
      //4. 
      do {
        System.out.println("x["+i+":]");
        x[i] = stdIn.nextInt();
   //5.사용자가 입력한 값<그 전의 값 보다 작으면
      }while(x[i]<x[i-1]);
    System.out.println("다시입력하세요");
    }
    
    //========================================================검색 시작 
    System.out.println("검색할 값");
    int ky = stdIn.nextInt();
    
    int idx=Arrays.binarySearch(x, ky); //배열 x에서 키 값이 ky인 요소를 검색 
    
    if(idx<0) System.out.println("값의 해당범위와 맞지 않습니다.");
    else System.out.println(ky+"는"+idx+"에 있음");
  }
}
