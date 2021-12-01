package Search;

import java.util.Scanner;

public class BinSearch {

  static int binSearch(int[]a, int n, int key) { // 
  //int [] a == a라는 배열 ( 검색값이 입력되어있는 DB) 
  //int n == 요소수 
  //int key == 검색값 (사용자의) 
    
    int pl = 0; //검색값 첫번째 수 
    int pr = n-1;  //검색값의 마지막 수 
    
    do {
      int pc= (pl+pr)/2; //검색범위의 중위값  
          if(a[pc] == key) //중위값이 검색값이면 pc 반환  
            return pc; 
          else if (a[pc]<key) //중위값이 검색값보다 아래에 있으면 검색값 첫번째수가 현재 중위값의 위값 
            pl = pc+1;
          else pr = pc - 1;  //검색범위를 앞쪽 절반으로 좁힘 
    }   
    while (pl>= pr); //검색 마지막 범위가 첫번재범위보다 작으면 (검색이 완료가 되면) return -1 반환한다. 
    
    return -1; //검색 실패값 반환 
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner scan  = new Scanner(System.in);
    //2. 요솟수가 num인 배열 생성  
    System.out.println("요솟수를 입력하세요");
    int num=scan.nextInt();
    int x[] = new int[num]; // 심화공부해야함 
    
    //2. DB값을 입력해주기 
    
    System.out.println("오름차순으로 입력하세요");
    
    System.out.println("x[0]");
    x[0] = scan.nextInt();
    //첫 요소 입력 
    //이미 요소수를 위에서 입력해주었으므로, 한정적으로 끝나게 되어있음.입력시에.
    for(int i=1; i<num; i++) {
    do {
    System.out.println("x["+i+"]=" );
    x[i] = scan.nextInt();
    }
    while (x[i]<x[i-1]); //앞의 요소보다 작으면 다시 입력 
  }
    
    System.out.println("검색값 입력하세요 [key]");
    int key = scan.nextInt();
    
    int idx = binSearch(x,num,key); 
    
    if(idx== -1) System.out.println("검색값 없음");
    else System.out.println(key+"는"+idx+"에 있음");
  }

}
