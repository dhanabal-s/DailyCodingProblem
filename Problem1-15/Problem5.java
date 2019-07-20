/*his problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
Implement car and cdr.
 */
package dailycodingchallange;

public class DAY5<T> {
T a,b;
    public  DAY5(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    public static <T> DAY5<T> cons(T a,T b)
    {
        return new DAY5<T>(a,b);
    }
    static <T> T car(DAY5 p)
    {
       return (T)p.a; 
    }
    static <T> T cdr(DAY5 p)
    {
       return (T)p.b; 
    }
    public static void main(String[] args) {
        DAY5<Integer> d5=DAY5.cons(3,5);
     Integer a=DAY5.car(d5);
     System.out.println("the car()value is:"+a);
     Integer b=DAY5.cdr(d5);
     System.out.println("the cdr()value is:"+b);
    }
    
}
