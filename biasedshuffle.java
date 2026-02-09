public class biasedshuffle {
    public static void main(String[] args){

        int arrayLength = 5;
        Integer[] shuffled = new Integer[arrayLength];
        for (int i = 0;i < arrayLength; i++){
            shuffled[i] = i + 1;
            //System.out.println(shuffled[i]);
        }
        int random;
        for (int x = 0;x < arrayLength; x++){
            random = (int) (Math.random() * arrayLength);
            int tempValue = shuffled[x];
            shuffled[x] = shuffled[random];
            shuffled[random] = tempValue;
        }
        for (int y = 0;y < arrayLength; y++){
            System.out.println(shuffled[y]);
        }
    }
}
