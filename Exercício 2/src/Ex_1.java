import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		int nc, nl, y=0;
		boolean  z = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nm de linhas -->" );
		nl=teclado.nextInt();
		System.out.print("Nm de colunas -->" );
		nc=teclado.nextInt();
		int[][] x=new int[nl][nc];
		
		matriz(x, nc, nl);
		check(x, nc, nl, z, y);
	}
		
	public static int[][] matriz(int[][] x, int nc, int nl) {
		Scanner teclado=new Scanner(System.in);
		for(int i=0; i<nl;i++) {
			for(int j=0; j<nc; j++) {
				System.out.print("digite um valor x -->" );
				x[i][j]=teclado.nextInt();
						}
			}
		return x;
	}
	
	public static void check(int[][] x, int nc, int nl, boolean z, int y) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Informe um valor y -->");
		y =teclado.nextInt();
		for(int i=0; i<nl;i++) {
			for(int j=0; j<nc; j++) {
				if(x[i][j]==y) {
				System.out.println("O número da linha e da coluna são " +i +j );
				z = true;
				}
			}	
		}
		if(z == false ){ 
			System.out.println("X não se encontra na matriz");
		
		}
		
	}
}