/*This problem is used to find the displacement when a/g is given  */
package lab1;

public class displacement {
    int x,v,t;
    final double g=9.78033;
    displacement(int x,int v,int t)
    {
        this.x=x;
        this.v=v;
        this.t=t;
    }
    public void calculate()
    {
        double dis=x+(v*t)+(g*(t*t)/2.0);
        System.out.println("Displacement "+dis);
    }
    public static void main(String args[])
    {
        displacement obj=new displacement(0,2,2);
        obj.calculate();
}
}

