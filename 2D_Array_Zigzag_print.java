public class MyClass {
    public static void main(String args[]) {

   int a[][] = new int[5][10];
   int count =1;
   for(int i=0;i<5;i++){
       for(int j=0;j<10;j++){
           a[i][j]=count++;
           if(j%10==0){
               System.out.println(" ");
           }
           System.out.print(a[i][j]+" ");
           
       }
   }
    System.out.println(" ");
    System.out.println("************************ ");
    System.out.println("Now in Zigzag ");
    System.out.println("************************ ");
   int row=5, col = 10;
   int evenRow = 0;
   int oddRow = 1;
   
    while (evenRow<row){
        for(int i =0;i<col;i++){
            System.out.print(a[evenRow][i]+" ");
        }
        System.out.println(" ");
        evenRow=evenRow+2;
        
        if(oddRow<row){
            for(int i=col-1;i>=0;i--)
                System.out.print(a[oddRow][i]+" ");
        }
         System.out.println(" ");
        oddRow=oddRow+2;
    }
