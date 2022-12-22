public class cubacuba {
    public static void main (String[]args){
        int w = 1,x=1,y=1,z=1;
        int a =w++;
        int b =++x;
        int c = y--;
        int d = --z;
        System.out.println("post Increment a= "+a+" w = "+w);
        System.out.println("post Increment b= "+b+" w = "+x);
        System.out.println("post Increment c= "+c+" w = "+y);
        System.out.println("post Increment d= "+c+" w = "+z);
    }
}
