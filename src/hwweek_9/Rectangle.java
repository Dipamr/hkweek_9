package hwweek_9;

public class Rectangle {
    private double Width;
    private double Length;

    public Rectangle(double width, double length) {
        if ((width < 0) && (length < 0)) {
            this.Width = 0;
            this.Length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.Width = 0;
            this.Length = length;
        } else if ((width > 0) && (length < 0)) {
            this.Width = width;
            this.Length = 0;
        } else {
            this.Width = width;
            this.Length = length;
        }
    }
        public double getWidth(){
            return Width;
        }
        public double getLength(){
        return Length;
        }
        public double getArea(){
        return(Width * Length);
        }

    }

