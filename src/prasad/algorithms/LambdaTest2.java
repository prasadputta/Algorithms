package prasad.algorithms;

/**
 * Created by 153608 on 3/18/2017.
 */
public class LambdaTest2 {
    @FunctionalInterface
    interface Converter {
        int Convert (String from);
    }

    public static  void main(String[] args){

        Converter converter = (from)->Integer.valueOf(from);

        System.out.println("Converted value using Lambda func..."+ converter.Convert("34"));

    }

}
