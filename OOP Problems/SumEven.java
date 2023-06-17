public class SumEven {
   public int calculateSumOfEvenNumbers(int array[]){
       int sum=0;
       for(int i=0;i<array.length;i++){
           if(array[i]%2==0){
               sum=sum+array[i];
           }
       }
       return sum;

   }
   public static void main(String[] args) {
       SumEven obj=new SumEven();
       int arr[]= {1,2,3,4,5,6,7,7,8,9,10};
       System.out.println(obj.calculateSumOfEvenNumbers(arr));
       

   }
}

