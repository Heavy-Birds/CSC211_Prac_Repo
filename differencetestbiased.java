public class differencetestbiased {
    public static void main(String[] args) {

        int set123 = 0;
        int set132 = 0;
        int set213 = 0;
        int set231 = 0;
        int set312 = 0;
        int set321 = 0;

        for (int re = 0; re < 60000; re++) {
            int arrayLength = 5;
            Integer[] shuffled = new Integer[arrayLength];
            for (int i = 0;i < arrayLength; i++){
                shuffled[i] = i + 1;
            }
            int random;
            for (int x = 0;x < arrayLength; x++){
                random = (int) (Math.random() * arrayLength);
                int tempValue = shuffled[x];
                shuffled[x] = shuffled[random];
                shuffled[random] = tempValue;
            }
            if (shuffled[0] == 1 && shuffled[1] == 2 && shuffled[2] == 3){
                set123++;
            }
            if (shuffled[0] == 1 && shuffled[1] == 3 && shuffled[2] == 2){
                set132++;
            }
            if (shuffled[0] == 2 && shuffled[1] == 1 && shuffled[2] == 3){
                set213++;
            }
            if (shuffled[0] == 2 && shuffled[1] == 3 && shuffled[2] == 1){
                set231++;
            }
            if (shuffled[0] == 3 && shuffled[1] == 1 && shuffled[2] == 2){
                set312++;
            }
            if (shuffled[0] == 3 && shuffled[1] == 2 && shuffled[2] == 1){
                set321++;
            }
        }
        System.out.println(set123);
        System.out.println(set132);
        System.out.println(set213);
        System.out.println(set231);
        System.out.println(set312);
        System.out.println(set321);
    }
}
