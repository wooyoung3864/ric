package classwork;

public class MyComplex {
    private double real;
    private double img;

    public MyComplex(){
        real = 0;
        img = 0;
    }

    public MyComplex(double real, double img){
        this.real = real;
        this.img = img;
    }

    public double getImg(){
        return img;
    }

    public void setImg(double img){
        this.img = img;
    }

    public double getReal(){
        return real;
    }

    public void setReal(double real){
        this.real = real;
    }

    public String isReal(){
        if(img == 0 && real == 0) {
            return "Complex";
        }
        else if(img == 0 && real != 0) {
            return "Real";
        }
        else if(real == 0 && img != 0) {
            return "Imaginary";
        }
        else {
            return "Neither";
        }
    }

    public void add(MyComplex c){
        real += c.real;
        img += c.img;
    }

    public void multiply(MyComplex c){
        real = real*c.real + img*c.img;
        img = real*c.img + img*c.real;
    }

    public void conjugate(){
        img *= -1;
    }

    public double argument(){
        return Math.atan2(real, img);
    }

    public double magnitude(){
        return Math.sqrt(real*real+img*img);
    }

    public static MyComplex addNew(MyComplex a, MyComplex b){
        a.add(b);
        return a;
    }

    public static MyComplex multiplyNew(MyComplex a, MyComplex b){
        a.multiply(b);
        return a;
    }

    public String toString(){
        String a = " + ";
        if(img < 0) a = " - ";
        return real + a + Math.abs(img) + "i";
    }

    public static void main(String[] args) {
        MyComplex ricsNumber = new MyComplex(696, 420);
        System.out.println(ricsNumber);
    }
}