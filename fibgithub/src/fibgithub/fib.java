package fibgithub;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		for(int m=0;m<=10;m++){
			int k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			
		}

	}

}
