public class mcsOn3MultArray {

    static int mcsOn3(Integer[] x){
        int n = x.length;
        int maxSoFar = 0;
        int count = 0;
        for (int low = 0; low < n;low++){
            for (int high  = low; high < n;high++){
                int sum = 0;
                for (int r = low; r < high;r++){
                    sum += x[r];
                    count += 1;
                    if (sum > maxSoFar){
                        maxSoFar = sum;
                    }
                }
            }
        }
        System.out.println(count);
        return maxSoFar;
    }

    public static void main(String[] args){
        int n1 = 100;
        Integer[] X = new Integer[n1];
        for (int i = 0; i < n1 ; i++){
            X[i] = (int) Math.pow( ((int) -(Math.random() * n1) + 1),((int) (Math.random() * 3) + 2));
        }

        int n2 = 1000;
        Integer[] Y = new Integer[n2];
        for (int i = 0; i < n2 ; i++){
            Y[i] = (int) Math.pow( ((int) -(Math.random() * n2) + 1),((int) (Math.random() * 3) + 2));
        }

        int n3 = 10000;
        Integer[] Z = new Integer[n3];
        for (int i = 0; i < n3 ; i++){
            Z[i] = (int) Math.pow( ((int) -(Math.random() * n3) + 1),((int) (Math.random() * 3) + 2));
        }

        int n4 = 100000;
        Integer[] A = new Integer[n4];
        for (int i = 0; i < n4 ; i++){
            A[i] = (int) Math.pow( ((int) -(Math.random() * n4) + 1),((int) (Math.random() * 3) + 2));
        }

        int n5 = 1000000;
        Integer[] B = new Integer[n5];
        for (int i = 0; i < n5 ; i++){
            B[i] = (int) Math.pow( ((int) -(Math.random() * n5) + 1),((int) (Math.random() * 3) + 2));
        }

        System.out.println("Length 10^2");
        System.out.println(mcsOn3(X));
        System.out.println("Length 10^3");
        System.out.println(mcsOn3(Y));
        System.out.println("Length 10^4");
        System.out.println(mcsOn3(Z));
        System.out.println("Length 10^5");
        System.out.println(mcsOn3(A));
        System.out.println("Length 10^6");
        System.out.println(mcsOn3(B));
    }
}
