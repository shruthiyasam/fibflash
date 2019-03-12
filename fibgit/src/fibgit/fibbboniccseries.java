package fibgit;

public class fibbboniccseries {

	public static void main(String[] args) {
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
