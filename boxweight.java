package inheritance;

public class boxweight extends Box{
    double weight;
    public boxweight(double l, double h, double b, double weight){
        // this.l = l;
        // this.h = h;
        // this.b = b;
        super(l,h,b); //this super keyword call parent's constructor
        this.weight = weight;
    }
}
