public class P21 {
    public static void main(String[] args) {
        
        int n=5;
        int nst=1;
        int nsp=n+2;
        int row=n;
        for(int i=1;i<=row;i++){

            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            if(i==n){
                nst--;
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }


            System.out.println();
            nsp-=2;
            nst++;
        }

    }
}
