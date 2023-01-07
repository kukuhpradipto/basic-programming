public class KendalaKelima {


    private static boolean polidrome(String kata) {
        String second = "";
        for(int i = kata.length()-1; i >= 0; i--){
            char c = kata.charAt(i);
            second+= String.valueOf(c);
        }

        if(kata.equals(second)){
            return true;
        } else {
            return  false;
        }
    }

    public static void main(String[] args) {
        System.out.println(polidrome("civic"));
        System.out.println(polidrome("katak"));
        System.out.println(polidrome("kasur rusak"));
        System.out.println(polidrome("kupu-kupu"));
        System.out.println(polidrome("lion"));
    }
}
