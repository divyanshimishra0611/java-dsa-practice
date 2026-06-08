public class maxelement{
  public static int maximumElement(int arr[]){
  int max= arr[0];
  for(int i =1; i< arr.length; i++){
    if(arr[i]> max){
      max = arr[i];
    }
  }
  return max;
  }
  public static void main(String args[]){
    int arr[]= {2,5,7,4,9,2,8};
    System.out.println("The maximum elemnt in the arrays is: "+ maximumElement(arr));

  }
}