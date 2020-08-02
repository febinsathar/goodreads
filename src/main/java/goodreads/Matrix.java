package goodreads;

public class Matrix {


//    (M*N) (N*P) =  (M*P)

    static int[][] multiply(int[][] a, int[][] b) throws Exception {

        if(a[0].length != b.length){
            throw new Exception("(M*N) (N*P) =  (M*P)");
        }
        int aRow = a.length ;
        int aColumn = a[0].length ;

        int bRow = b.length ;
        int bColumn = b[0].length;

        int c [][] = new int[aRow][bColumn];

        for (int j=0;j < aRow; j++) {
            for (int i = 0; i < bColumn; i++) {
                for (int k = 0; k < aColumn; k++) {
                        c[j][i] += a[j][k] * b[k][j];
                }
            }
        }
        return c ;

    }
}
