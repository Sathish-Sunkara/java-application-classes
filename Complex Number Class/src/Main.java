import static java.lang.Math.atan;
import static java.lang.Math.sqrt;

public class Main
{
    public static void main(String[] args)
    {

        Complex com1 = new Complex(10,10) ;
        System.out.println(com1.magnitude());
        Complex com2 = new Complex(5,5);
        com1.MulComplex(com2);
        System.out.println(com1.GetNumber()) ;  //  perfect
    }
}

class Complex
{
    private float real = 0 ;
    private float img = 0 ;

    public  Complex(int a ,int b)
    {
        this.real = a ;
        this.img = b ;
    }
    public Complex(float a ,float b)
    {
        this.real = a ;
        this.img = b ;
    }
    public  Complex()
    {
        this.real = 0 ;
        this.img = 0 ;
    }
    public String GetNumber()
    {
        String st = this.real + " + " +this.img+"j" ;
        return st ;
    }
    public float magnitude() //returns magnitude of number
    {
        float mag = (float)sqrt(this.real*this.real + this.img*this.img) ;
        return mag ;
    }
    public float angle()   // returns angle
    {
       float ang =  (float)atan(this.real/this.magnitude()) ;
       return ang ;
    }
    public void SetReal(int a)  //setter function  of real number
    {
        this.real = (float)a ;
    }
    public float GetReal()    // getting real number
    {
        return (float)this.real ;
    }

    public void SetImg(int a)  //setter function  of imaginary number
    {
        this.img = (float)a ;
    }
    public float GetImg()    // getting imaginary number
    {
        return (float)this.img ;
    }

    public void addToReal(int a) //add value to real number
    {
        this.real += (float)a ;
    }
    public void addToImg(int a) //add value to imaginary number
    {
        this.img += (float)a ;
    }
    public void addToComplex(int a ,int b) //add to both numbers
    {
        this.real += (float)a ;
        this.img += (float)b ;
    }

    // subtracting numbers
    public void subToReal(int a) //subtract value to real number
    {
        this.real -= (float)a ;
    }
    public void subToImg(int a) //subtract value to imaginary number
    {
        this.img -= (float)a ;
    }
    public void subToComplex(int a ,int b) //subtract to both numbers
    {
        this.real -= (float)a ;
        this.img -= (float)b ;
    }
    //multiplying numbers
    public void mulToReal(int a) //subtract value to real number
    {
        this.real *= (float)a ;
    }
    public void mulToImg(int a) //subtract value to imaginary number
    {
        this.img *= (float)a ;
    }
    public void mulToComplex(int a ,int b) //subtract to both numbers
    {
        this.real *= (float)a ;
        this.img *= (float)b ;
    }
    //dividing the numbers
    public void divToReal(int a) //subtract value to real number
    {
        this.real /= (float)a ;
    }
    public void divToImg(int a) //subtract value to imaginary number
    {
        this.img /= (float)a ;
    }
    public void divToComplex(int a ,int b) //subtract to both numbers
    {
        this.real /= (float)a ;
        this.img /= (float)b ;
    }
    public void scalarMul(int a)   // multiply complex number with a scalar(real)
    {
        this.real *= (float)a ;
        this.img *= (float)a ;
    }

    public void imaginaryMul(int a)   // multiply complex number with a imaginary value
    {
        this.img = this.real * (float)a ;
        this.real = (this.img * (float)a) * (-1) ;
    }
    public void complexMul(int a , int b)  // assume a+bj and multiply
    {
        float real = this.real*(float)a - this.img*(float)b ;
        float img = this.real*(float)b + this.img*(float)a ;
        this.real = real ;
        this.img = img ;
    }
    public void AddComplex(Complex c)    // this function argument is object of the same class (Complex)
    {
        this.real += c.real ;
        this.img += c.img ;
    }
    public void MulComplex(Complex c)   // multiply complex with complex
    {
        float real = this.real*c.real - this.img*c.img ;  // like this we pass objects and use all its attributes in the function of same class.
        float img = this.real*c.img + this.img*c.real ;  // private variables of object are accessed in the function of same class of another object.
        this.real = real ;            // so object passed as argument ,then all its methods also executed in that function if needed.
        this.img = img ;

    }
    public void funny(Complex c)
    {
        c.funny(new Complex(2,2)) ;   // this particular create endless recursion .whenever we pass object then that function cannot call in it without a basecase
    }



}