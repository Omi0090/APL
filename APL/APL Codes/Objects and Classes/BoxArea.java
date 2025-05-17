class Box {
    private int length, breadth, height;

    public Box() {
        this.length = 1;
        this.breadth = 1;
        this.height = 1;
    }

    public Box(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public int vol() {
        return length * breadth * height;
    }

    public String toString() {
        return "Volume of the box: " + this.vol() + "\nSurface Area of the box: " + this.area();
    }

    public int area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}

class BoxArea {
    public static void main(String args[]) {
        Box b1 = new Box();
        Box b2 = new Box(1,3,4);

        System.out.println("Box 1: "+ b1);
        System.out.println("Box 2: "+ b2);
    }
}