
public class peterbentlyMCS {

    int mcsOn3(Integer[] x){
        int n = x.length;
        int maxSoFar = 0;
        for (int low = 0; low < n;low++){
            for (int high  = low; high < n;high++){
                int sum = 0;
                for (int r = low; r < high;r++){
                    sum += x[r];
                    if (sum > maxSoFar){
                        maxSoFar = sum;
                    }
                }
            }
        }
        return 0;
    }

    int mcsOn2A(int[] x){
        int n = x.length;
        int maxSoFar = 0;
        for (int low = 0; low < n;low++){
            int sum = 0;
            for (int r = low;r < n; r++){
                sum += x[r];
                if (sum > maxSoFar){
                    maxSoFar = sum;
                }
            }
        }

        return maxSoFar;
    }

    int mcsOn2B(int[] x){

        return 0;
    }

    int mcsOn(int[] x){

        return 0;
    }

    public static void main(String[] args){

        int n = 20;
        Integer[] X = new Integer[n];
        for (int i = 0; i < n ; i++){
            X[i] = (int) Math.pow( ((int) -(Math.random() * n) + 1),((int) (Math.random() * 3) + 2));
        }

        int countP = 0;
        int countM = 0;

        for(int y  = 0; y < n; y++){
            //System.out.println(X[y]);
            if (X[y] < 0){
                countM += 1;
            } else {
                countP += 1;
            }
        }
        System.out.println("countM = " + countM);
        System.out.println("countP = " + countP);

    }
}

