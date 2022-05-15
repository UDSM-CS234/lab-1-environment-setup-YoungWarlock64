public class SimpleAssigment {

    double t, d, x,v,a;

    //t for time, d for distance, x for inital position; v for initial veloccity and a for acceleration

    SimpleAssigment(){
        t=10;
        x=0;
        v=0;
        a=-9.81;
    }
    double disComop(){
        d=0.5 * (a* (t*t)) + (v*t) +x;
        return d;
    }

    public static void main(String args[]){

        SimpleAssigment SA= new SimpleAssigment();

        System.out.println("the value of distance is " +SA.disComop()+ "\tmeter");

    }

}

