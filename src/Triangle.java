public class Triangle extends Form{
    private float height, base;

    public Triangle (){
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(String color,float height, float base){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea(){
        return (height * base)/2;
    }
    @Override
    public String toString(){
        return super.toString() + "\nHeight: " + height + "\nBase: " + base;
    }
}
