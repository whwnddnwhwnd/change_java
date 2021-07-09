class change{
  public static void main(String[] args){
     int a = 10;
     int b = 100;
     
     System.out.println("바꾸기 전 a의 값: " + a);
     System.out.println("바꾸기 전 b의 값: " + b);
     
     int temp; //temp라는 정수값을 담을 수 있는 변수 선언
     temp = a; //temp에 a의 값인 10을 저장     
     a = b; //a에 b의 값인 100을 저장 (현재 a = 100, b = 100, temp = 10)     
     b = temp; // b에 temp의 값인 10을 저장 (현재 a = 100, b = 10, temp = 10)
     
     System.out.println("바꾼 후 a의 값: " + a);
     System.out.println("바꾼 후 b의 값: " + b);
  }
}
