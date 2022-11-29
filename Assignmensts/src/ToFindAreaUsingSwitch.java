import java.util.Scanner;
public class ToFindAreaUsingSwitch {

	public static void main(String[] args) {
		int a; 
		Scanner sc=new Scanner(System.in);
		 
         System.out.println("1.Area of a circle");
         System.out.println("2.Area of a square");
         System.out.println("3.Area of a right angled triangle");
         System.out.println("4.Area of a Rectangle");
         System.out.println("5.Circumference of a circle");
         System.out.println("6.Perimeter of a square");
          System.out.println("Enter your choice");
         a=sc.nextInt();

         switch(a)
         {
               case 1: System.out.println("Enter radius:");
                        float r,ac;
                            r=sc.nextFloat();
                            ac=3.14f*r*r;
                          System.out.println("Area:"+ac);
                          break;

              case 2: System.out.println("Enter side:");
                           int x,as; 
                             x=sc.nextInt();
                             as=x*x;
                           System.out.println("Area:"+as);
                          break;

              case 3: System.out.println("Enter height and base:");
                          float h,b,art;
                           h=sc.nextFloat();
                           b=sc.nextFloat();
                           art=0.5f*h*b;
                          System.out.println("Area:"+art);
                          break;

             case 4: System.out.println("Enter length and breadth:");
                           int l,br,ar;
                           l=sc.nextInt();
                           br=sc.nextInt();
                           ar=l*br;
                          System.out.println("Area:"+ar);
                          break;

            case 5: System.out.println("Enter radius:");
                           float d,c;
                            d=sc.nextFloat();
                            c=3.14f*2f*d;
                          System.out.println("Circumference:"+c);
                          break;


             case 6: System.out.println("Enter side:");
                           int si,p;
                           si=sc.nextInt();
                           p=4*si;
                          System.out.println("Perimeter:"+p);
                          break;

              
             }

	}

}
