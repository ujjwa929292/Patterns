public class P20 {
    
    public static void main(String[] args) {
        int n=7;
        int nsp=3;
        int row=n;

        for(int i=1;i<=row;i++){

            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            if(i<=row/2){
                nsp--;
            }else{
                nsp++;
            }
        }
    }
}
