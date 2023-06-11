public class Multiplication {
        public static int [][] multiplicationTable(int n){
            int[][] matrix = new int[n][n];

            for(int ii=0; ii<n; ii++) {
                for(int jj=0; jj<n; jj++) {
                    matrix[ii][jj] = (ii+1) * (jj+1);
                }
            }
            
            return matrix;
        }
        
        public static void imprimirMatriz(int[][] matriz) {
            int filas = matriz.length;
            int columnas = matriz[0].length;
        
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }        
        
        public static void main(String[] args) {
            imprimirMatriz(multiplicationTable(4));
        } 
        
}
