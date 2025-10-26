public class Drawings {
    public static void main(String[] args) {
//testing
//   StdDraw.setXscale(0, 50);
//        StdDraw.setYscale(0, 50);;
//        drawBike(25,10);
//        pinetree(10,5,10);
//        sun(10,20);
    }

    //the bike
    public static void drawBike(double x, double y) {
        StdDraw.setPenRadius(.005);
        //body of bike
        StdDraw.line(x, y, x + 4, y);
        //seat
        StdDraw.line(x - .5, y + .5, x, y);
        StdDraw.filledRectangle(x - .5, y + .5, .75, .2);

        StdDraw.line(x, y, x + 2, y - 3);
        StdDraw.filledCircle(x + 2, y - 3, .3);//circle on the pedal axel
        //pedals
        StdDraw.line(x + 2, y - 3, x + 2, y - 2);
        StdDraw.filledRectangle(x + 2, y - 2, .5, .2);
        StdDraw.line(x + 2, y - 3, x + 2, y - 4);
        StdDraw.filledRectangle(x + 2, y - 4, .5, .2);
        //body
        StdDraw.line(x + 2, y - 3, x + 4, y);
        StdDraw.line(x, y, x - 2, y - 3);
        StdDraw.line(x - 2, y - 3, x + 2, y - 3);
        StdDraw.filledCircle(x - 2, y - 3, .3);//circle on the wheel axel
        //back wheel
        StdDraw.circle(x - 2, y - 3, 2);
        //handle:
        StdDraw.line(x + 3, y + 2, x + 5.5, y - 3);
        StdDraw.line(x + 3, y + 2, x + 4, y + 2);
        StdDraw.line(x + 4, y + 2, x + 4, y + 1.5);

        StdDraw.filledCircle(x + 5.5, y - 3, .3);//circle on the wheel axel
        //front wheel
        StdDraw.circle(x + 5.5, y - 3, 2);
    }
    //drawing the pinetrees
    public static void pinetree(double xaxis, double yaxis, int height) {
        // Draw the trunk
        StdDraw.setPenColor(140, 94, 69);
        StdDraw.filledRectangle(xaxis, yaxis, .09, height);
        //branches
        StdDraw.setPenColor(33, 82, 21);
        StdDraw.setPenRadius(.004);
        StdDraw.line(xaxis, yaxis + height, xaxis + 1, yaxis - .1);
        StdDraw.line(xaxis, yaxis + height, xaxis - 1, yaxis - .1);
        StdDraw.line(xaxis, yaxis + height, xaxis - 1, yaxis - 1);
        StdDraw.line(xaxis, yaxis + height, xaxis + 1, yaxis - 1);
        StdDraw.line(xaxis, yaxis + height - 1, xaxis + 1, yaxis - 2);
        StdDraw.line(xaxis, yaxis + height - 1, xaxis - 1, yaxis - 2);
        StdDraw.line(xaxis, yaxis + height - 2, xaxis - 1, yaxis - 3);
        StdDraw.line(xaxis, yaxis + height - 2, xaxis + 1, yaxis - 3);
        StdDraw.line(xaxis, yaxis + height - 3, xaxis - 1, yaxis - 3);
        StdDraw.line(xaxis, yaxis + height - 3, xaxis + 1, yaxis - 3);
        StdDraw.line(xaxis, yaxis + height - 4, xaxis - 1, yaxis - 4);
        StdDraw.line(xaxis, yaxis + height - 4, xaxis + 1, yaxis - 4);
        StdDraw.line(xaxis, yaxis + height - 5, xaxis - 1, yaxis - 4);
        StdDraw.line(xaxis, yaxis + height - 5, xaxis + 1, yaxis - 4);
    }
    //drawing the sun:
    public static void sun(double x, double y) {
        StdDraw.setPenColor(252, 186, 3);
        StdDraw.filledCircle(x, y, 3); // Radius of the circle will always be 3
        for (int j = 0; j < 360; j += 20) {//making the rays
            double endX = x + 5 * Math.cos(Math.toRadians(j));
            double endY = y + 5 * Math.sin(Math.toRadians(j));
            StdDraw.line(x, y, endX, endY);
        }
    }
}


