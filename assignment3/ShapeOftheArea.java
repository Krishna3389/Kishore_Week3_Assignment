package assignment3;

public class ShapeOftheArea {
     public static void main(String[] args) {
		Circle c=new Circle();
		 c.radius=15.0;
		 c.areaOfTheCircle();
		 System.out.println("******************************");
		 Rectangle rectangle=new Rectangle();
		 rectangle.length=20.0;
		 rectangle.width=10.0;
		 rectangle.areaOftheRectangle();
		 System.out.println("********************");
		 Traingle traingle=new Traingle();
		 traingle.base=10.0;
		 traingle.height=15.0;
		 traingle.areaOfTraingle();
		 
	}
}
