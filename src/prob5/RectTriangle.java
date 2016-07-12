package prob5;

public class RectTriangle extends Shape {
	
	double width;
	double height;
	
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height / 2;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(width*width+height*height) + width + height;
	}

}
