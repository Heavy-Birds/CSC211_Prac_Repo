public class mcsOn2BMultArray {

    static int mcsOn2B(Integer[] x){
        int n = x.length;
        int count = 0;
        Integer[] sumTo = new Integer[n + 1];
        for (int y = 0; y < n + 1;y++){
            sumTo[y] = 0;
        }
        int maxSoFar = 0;
        for (int i = 0; i < n;i++) {
            if (i != 0) {
                sumTo[i] = sumTo[i - 1] + x[i];
            } else {
                sumTo[i] = x[i];
            }
        }
        for (int low = 0; low < n; low++){
            for (int high = low; high < n;  high++){
                int sum = 0;
                if (low != 0){
                    sum = sumTo[high] - sumTo[low-1];
                }else {
                    sum = sumTo[high];
                }
                if (sum > maxSoFar){
                    maxSoFar = sum;
                }
                count += 1;
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
        System.out.println(mcsOn2B(X));
        System.out.println("Length 10^3");
        System.out.println(mcsOn2B(Y));
        System.out.println("Length 10^4");
        System.out.println(mcsOn2B(Z));
        System.out.println("Length 10^5");
        System.out.println(mcsOn2B(A));
        System.out.println("Length 10^6");
        System.out.println(mcsOn2B(B));
    }
}
