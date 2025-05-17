package mypackage.mymath;

public class Division {
    public float div(int a, int b) {
        if(b == 0) {
            return -1;
        }
        return (float)a / b;
    }
}
