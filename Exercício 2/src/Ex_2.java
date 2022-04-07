import java.util.Random;
public class Ex_2 {

	public static void main(String[] args) {
		int aux=0;
		int[][] y=new int[4][4];
		
		gerar(y);
		inverter(y,aux);
	}
		
		public static int[][] gerar(int[][] y) {
			Random xis=new Random();
			for(int i=0; i<4; i++) {
			for(int j = 0; j <4; j++){
			 y[i][j]=xis.nextInt(10);
			 System.out.print(y[i][j]+"\t");}
			System.out.println();
		}
		System.out.println();
		return y;
		}
	
		public static void inverter(int[][] y, int aux) {
		for(int i=0; i<4; i++) {
			for(int j = 0; j <4; j++){
				if(j>i) {
				aux=y[i][j];
				y[i][j]=y[j][i];
				y[j][i]=aux;
				}
				System.out.print(y[i][j]+"\t");}
			System.out.println();
			}
			
		}
		
		
		
		
	}
