package prasad.algorithms;

public interface Formula {

    default double square(double a){
        return Math.sqrt(a);
    }

    double  execute(double a,double b);
}
