public class KendalaTujuh {

    private static float Mean(float[] numbers){

        float[] value = {1,2,3,4};
        float  total = 0;
        float rataRata = 0;

        for (int i = 0; i < value.length;i++){
            System.out.println(value[i]);
            total += value[i];
        }
        return rataRata = total/ value.length;
    }

    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
}
