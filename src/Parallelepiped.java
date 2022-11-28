public class Parallelepiped implements Formulaable{
    private double heigth;
    private double length;
    private double width;

    public Parallelepiped(double heigth, double length, double width) {
        if (heigth<0 || length<0 || width<0){
            throw new ArithmeticException("ters san bergenge bolboit!!!");
        }else if (heigth>20 || length>20 || width>20){
            throw new ArithmeticException("20dan chon san bergenge bolboit!!!");
        }
        this.heigth = heigth;
        this.length = length;
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return 2*((heigth * length) + (length * width) + (heigth * width));
    }

    @Override
    public double value() {
        return (heigth*length*width);
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "heigth=" + heigth +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
