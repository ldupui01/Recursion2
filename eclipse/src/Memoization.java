
public class Memoization {
	private int[] precalculated = null;
	
	public static int fibonacci(int n){
		if((n==1) || (n==2)){
			return 1;
		}else{
			int result = fibonacci(n-1) + fibonacci(n-2);
			return result;
		}
	}
	
	public int fibMemoiz(int n){
		if (precalculated == null){
			initPrecalculatedArray(n);
		}
		if(precalculated[n-1] != -1){
			return precalculated[n-1];
		}else{
			int result = fibMemoiz(n-1) + fibMemoiz(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}
	
	private void initPrecalculatedArray(int size){
		precalculated = new int[size];
		for (int i= 0;i< precalculated.length;i++){
			precalculated[i] = -1; // to indicate "not Calculated yet"
		}
		precalculated[0]=1; // fibonacci de 1 = 1
		precalculated[1]=1; // fibonacci de 2 = 1
	}
	
	
	
	public void launcher(){
		int x = 45;
		//int y = fibonacci(x);
		int z = fibMemoiz(x);
		//System.out.println(y);
		System.out.println(z);
	}
	
	
	public static void main(String[] args) {
		Memoization m = new Memoization();
		m.launcher();
	}

}
