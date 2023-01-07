public class PriceCount {

    public int dimentionCount(int p, int l, int t){
        int result = p * l * t;
        int finalResult;

        if(result < 50){
            finalResult = 50;
        } else {
            finalResult = result;
        }
        return finalResult;
    }

    public float calculateWeight( float berat){
        float result = berat * 5000;

        if (berat < 1){
            berat = 1;
        }
        return result;
    }
}
