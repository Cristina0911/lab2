public class Form {
    private String color;

    public Form(){
        color="white";
    }
    public Form(String c){
        color=c;

    }

    public float getArea() {
        return 0;
    }
    public String toString(){
        return "This form has the color" +color;
    }

    public String getColor() {
        return color;
    }
}
