
public class Recursion {
	
	public Recursion() {
		
	}

	//print symbols in ascending order 
	public void printSymbols(int n, int count, int end){
		int c=count;
		
		//base case
		if (c==n) {
				return;
		}else {
			//if at end, print on new line
			if (c==end) {
				c=0;
				end++;
				System.out.println();
			}else {
				System.out.print("#");
				c++;
			}

			printSymbols(n, c, end);
		}		
	}
	
	
	//find and print factorial
	public void findFactorial (int n, int count, int product, int oneLess) {
		
		//base case
		if (count==1) {
			System.out.println(count + "= " + product);
			return;
		}else {
			
			System.out.print(count + "*");
			product=product * oneLess;
			oneLess=oneLess-1;
			count--;
			
			findFactorial(n, count, product, oneLess);
			
		}
		
	}


}

