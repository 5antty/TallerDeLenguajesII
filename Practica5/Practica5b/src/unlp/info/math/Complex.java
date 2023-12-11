package unlp.info.math;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.im = im;
        this.re = re;
    }

    public double realPart() {
        return this.re;
    }

    public double imaginaryPart() {
        return this.im;
    }

    public Complex add(Complex c) {
        Complex aux = new Complex(this.re + c.re, this.im + c.im);
        return aux;
    }

    public Complex substract(Complex c) {
        Complex aux = new Complex(this.re - c.re, this.im - c.im);
        return aux;
    }

    public Complex multiply(Complex c) {
        Complex aux = new Complex(this.re + c.re, this.im + c.im);
        return aux;
    }

    public Complex divide(Complex c) {
        Complex aux = new Complex(this.re + c.re, this.im + c.im);
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) {
            Complex c = (Complex) o;
            if (this.re == c.re && this.im == c.im)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Real part = " + this.realPart() + "Imaginary part = " + this.imaginaryPart();
    }

    public static Complex valueOf(double re, double im) {
        Complex c = new Complex(re, im);
        return c;
    }
}
