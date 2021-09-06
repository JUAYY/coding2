public class test7 {
 public static void main(String[] args) {
     int i;
     int j;
     int k;
     int row = 5;
     for(i=1;i<=row;i++){
         for(j=1;j<=row;j++){
             if(j == (row-i)+1){
                 for(k=1;k<=i;k++){
                    System.out.print("* ");
                 }
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
 }   
}
