/**
 * P1
 */
public class P1 {

    public static void main(String[] args) {
        
        int n=7;
        int nst=3;
        int nsp=1;
        int row=n;
        for(int i=1;i<=row;i++){

            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=row/2){
                nsp+=2;
                nst--;
            }else{
                nsp-=2;
                nst++;
            }
        }
    }
}