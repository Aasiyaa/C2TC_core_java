package box;


class Box
{
	float width;
	float height;
	float depth;
	

float calvol()
{
	return width*height*depth;
}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box box1=new Box();
		box1.width=3.14f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol=box1.calvol();
		System.out.println("volume of box1"+vol);

	}

}
