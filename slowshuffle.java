

public class slowshuffle {
    public static void main(String[] args) {

        int arrayLength = 5;

        Boolean[] isNotPresent = new Boolean[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            isNotPresent[i] = true;
        }
        Integer[] shuffled = new Integer[arrayLength];


        int random;
        for (int x = 0; x < arrayLength ; x++) {
            random = (int) (Math.random() * arrayLength) + 1;

            if (isNotPresent[random - 1]) {
                shuffled[x] = random;
                isNotPresent[random - 1] = false;
                System.out.println(shuffled[x]);
            } else {
                x -= 1;
            }
        }
    }
}
