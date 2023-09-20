import java.util.Scanner;

public class Pattern7 {
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,cspace=0,cstar=n,ro=(2*n)-1;
		while(i<=ro){
			int star=1;
			while(star<=cstar){
				System.out.print("*");
				star++;
		}
		int space=1;
		while(space<cspace){
			System.out.print(" ");
			space++;
		}
		int l=1;
		while(l<=cstar){
			if((i==l||i==ro)&&l==1){
				System.out.print("*");
					l=l+2;
			}else{
				System.out.print("*");
				l++;
			}
		}
		if(i<=n-1){
			cstar=cstar-1;
			cspace=cspace+2;
		}else{
			cstar=cstar+1;
			cspace=cspace-2;
		}
		System.out.println();
		i++;
		}

	}
}
