package classwork;

public class MyComplex {
    private double real;
    private double img;
    private String complex;

    public MyComplex() {
        real = 0;
        img = 0;
        complex = (int) real + " + " + (int) img + "i";
    }

    public MyComplex(double a, double b) {
        real = a;
        img = b;
        if(b < 0) {
            complex = (int) real + " - " + (int) img + "i";
        } else {
            complex = (int) real + " + " + (int) img + "i";
        }
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public void add(MyComplex c) {
        this.complex = (int) (this.real + c.real) + " + " + (int) (this.img + c.img) + "i";
    }

    public void multiply(MyComplex c) {
        this.complex = (int) ((this.real * c.real) - (this.img * c.img)) + " + " + (int) ((this.real * c.img) + (this.img * c.real)) + "i";
    }

    public void conjugate() {
        String conjugate = "";
        if(img > 0) {
            conjugate =  (int) real + " - " + (int) img + "i";
        } else {
            conjugate = (int) real + " + " + (int) img + "i";
         }
        System.out.println(conjugate);
    }

    public double argument() {
        return Math.atan2(real, img);
    }

    public double magnitude() {
        return Math.sqrt((real * real) + (img * img));
    }

    public static MyComplex addNew(MyComplex a, MyComplex b) {
        a.complex = (int) (a.real + b.real) + " + " + (int) (a.img + b.img) + "i";
        return a;
    }

    public static MyComplex multiplyNew(MyComplex a, MyComplex b) {
        a.complex = (int) ((a.real * b.real) - (a.img * b.img)) + " + " + (int) ((a.real * b.img) + (a.img * b.real)) + "i";
        return a;
    }

    public String toString() {
        if(img < 0) {
            return (int) real + " - " + (int) img + "i";
        }
        return (int) real + " + " + (int) img + "i";
    }

    public static void main(String[] args) {
        MyComplex ricsNumber = new MyComplex(420, 69);
        MyComplex obama = new MyComplex(69, -69);
        System.out.println(ricsNumber);
        ricsNumber.add(obama);
        System.out.println(ricsNumber);
        ricsNumber.conjugate();
        ricsNumber.multiply(obama);
        System.out.println(ricsNumber);
        System.out.println(ricsNumber.argument());
        System.out.println(ricsNumber.magnitude());
    }
}
