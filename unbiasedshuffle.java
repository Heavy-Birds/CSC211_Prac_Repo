public class unbiasedshuffle {
    public static void main(String[] args){

        int arrayLength = 5;
        Integer[] shuffled = new Integer[arrayLength];
        for (int i = 0;i < arrayLength; i++){
            shuffled[i] = i + 1;
        }
        int random;
        int decrease = arrayLength;
        for (int x = arrayLength - 1;x > 0; x--){
            random = (int) (Math.random() * decrease);
            int tempValue = shuffled[x];
            shuffled[x] = shuffled[random];
            shuffled[random] = tempValue;
            decrease--;
        }
        for (int y = 0;y < arrayLength; y++){
            System.out.println(shuffled[y]);
        }
    }
}
