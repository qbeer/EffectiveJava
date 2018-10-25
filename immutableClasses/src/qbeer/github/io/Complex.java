package qbeer.github.io;

public class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(Complex c) {
        this.re = c.getRe();
        this.im = c.getIm();
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(this.re+c.getRe(), this.im+c.getIm());
    }

    public Complex times(Complex c) {
        return new Complex(this.re*c.getRe() - this.im*c.getIm(),
                this.re*c.getIm()+this.im*c.getRe());
    }

    @Override
    public boolean equals(Object o){
        if( o == this ) return true;
        if( !(o instanceof Complex) ) return false;
        Complex c = (Complex) o;
        return Double.compare(c.getRe(), this.re) == 0
                && Double.compare(c.getIm(), this.im) == 0;
    }

    @Override
    public String toString() {
        return this.re + "+" + this.im + "i";
    }
}
