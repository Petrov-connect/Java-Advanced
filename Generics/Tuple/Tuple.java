package Generics.Tuple;
//created by J.M.

public class Tuple <K,V> {

    K kay;
    V value;

    public Tuple(K kay, V value) {
        this.kay = kay;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",this.kay,this.value);
    }
}
