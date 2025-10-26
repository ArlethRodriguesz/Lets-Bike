import java.util.Scanner;
public class Project {
    public static Scanner keyboard = new Scanner(System.in);//needs to be outside the main method
    public static void main(String[] args) {
        //creating Amherst College the origin city:
        City AmherstMA = new City("Amherst,MA", 48.87, -2.33);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 50);
        StdDraw.setYscale(0, 50);
        //welcome page:
        StdDraw.setPenColor(143, 76, 47);
        StdDraw.filledRectangle(25, 40, 15, 2);
        StdDraw.setPenColor(0,0,0);
        StdDraw.text(25, 40, "Welcome to Let's Bike!");
        StdDraw.text(25, 30, "To play, you must answer the questions displayed ");
        StdDraw.text(25, 28, "by entering on your keyboard the corresponding  ");
        StdDraw.text(25, 26, "number next to your desired answer choice. ");
        StdDraw.text(25, 20, "To begin, press any key on your keyboard! ");
        StdDraw.setPenColor(143, 76, 47);
        Drawings.drawBike(25,15);
        StdDraw.setPenColor(0,0,0);
        StdDraw.show();
        while (!StdDraw.hasNextKeyTyped()) {
            //literally do nothing
        }
        StdDraw.clear();
        char go = StdDraw.nextKeyTyped();
        //choosing the bike
        StdDraw.setPenColor(143, 76, 47);
        StdDraw.filledRectangle(25, 40, 15, 2);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.text(25, 40, "Which city do you want to bike to?");
        StdDraw.text(15, 30, "(1) Denver, CO");
        StdDraw.text(35, 30, "(2) Seattle, WA");
        StdDraw.text(15, 20, "(3) San Francisco, CA");
        StdDraw.text(35, 20, "(4) Atlanta, GA");
       // StdDraw.text(25,15,"(5) Random City");
        StdDraw.show();
        while (!StdDraw.hasNextKeyTyped()) {
            //literally do nothing
        }
        StdDraw.clear();
        char aa = StdDraw.nextKeyTyped();
        int a = aa - '0';
        //now draw your next q:
        StdDraw.setPenColor(143, 76, 47);
        StdDraw.filledRectangle(25, 40, 15, 2);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.text(25, 40, "What type of bike do you want to use?");
        StdDraw.text(25, 30, "(1) Road Bike            (2) Electric Bike");
        //maybe draw a little bike underneath each ^^
        StdDraw.show();

        while (!StdDraw.hasNextKeyTyped()) {
        }
        StdDraw.clear();
        char bb = StdDraw.nextKeyTyped();
        int b = bb - '0';

        StdDraw.setPenColor(143, 76, 47);
        StdDraw.filledRectangle(25, 40, 15, 2);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.text(25, 40, "How fast do you want to bike?");
        StdDraw.text(15, 30, "(1) 20mph");
        StdDraw.text(35, 30, "(2) 15 mph");
        StdDraw.text(15, 20, "(3) 10mph ");
        StdDraw.text(35, 20, "(4) 5mph");
        StdDraw.show();

        while (!StdDraw.hasNextKeyTyped()) {
        }

        StdDraw.clear();//how fast you going
        char ss = StdDraw.nextKeyTyped();
        int s = ss - '0';

        if(s==1){
            s=20;
        }
        if(s==2){
            s=15;
        }
        if(s==3){
            s=10;
        }
        if(s==4){
            s=5;
        }

        StdDraw.setPenColor(143, 76, 47);
        StdDraw.filledRectangle(25, 40, 17, 2);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.text(25, 40, "What color do you want your bike to be?");
        StdDraw.setPenColor(219, 116, 26);
        StdDraw.text(15, 30, "(1) Orange");
        StdDraw.setPenColor(194, 32, 23);
        StdDraw.text(35, 30, "(2) Red");
        StdDraw.setPenColor(21, 80, 207);
        StdDraw.text(15, 20, "(3) Blue");
        StdDraw.setPenColor(168, 52, 235);
        StdDraw.text(35, 20, "(4) Purple");
        StdDraw.setPenColor(227, 146, 79);
        //change pen color for each^^
        StdDraw.show();

        while (!StdDraw.hasNextKeyTyped()) {
        }
        StdDraw.clear();

        char cc = StdDraw.nextKeyTyped();
        int c = cc - '0';

        choosingCity(a).NameofCity();


        double distance = (choosingCity(a).distanceTo(AmherstMA)) / (choosingBike(b,s).TellSpeed());
        int timeToCity=0; //in hours
        int distanceTrail=0;
        if(a==1){//if to denver:
            timeToCity=2242/s;
            distanceTrail=2242;
        }
        if(a==2){//if to seattle:
            timeToCity=3173/s;
            distanceTrail=3173;
        }
        if(a==3){//time to san fran
            timeToCity=3329/s;
            distanceTrail=3329;
        }
        if(a==4){//time to atlanta
            timeToCity=1149/s;
            distanceTrail=1149;
        }


        double steps = (100 - 5) / .02;//how many steps the bike will take before it gets to end of screen
        double startXcor = 5.0;
        for (int i = 0; i < 10000; i++) {//bcuz i want to stop biking at some point
            double OGstartXcor = 5.0;
            StdDraw.clear();
            if (i < 150) {
                StdDraw.setPenColor(45, 67, 53);
                StdDraw.text(25, 30, "You will bike from Amherst, MA to " + choosingCity(a).NameofCity());
                StdDraw.text(25, 27, "using a " + Color(c) + " " + choosingBike(b,20).tellBikeType() + " with a ");
                StdDraw.text(25, 24, "speed of " + choosingBike(b,s).TellSpeed() + "mph.");
                if(c==1){//orange
                    StdDraw.setPenColor(219, 116, 26);
                }
                if(c==2){//red
                    StdDraw.setPenColor(194, 32, 23);
                }
                if(c==3){//blue
                    StdDraw.setPenColor(21, 80, 207);
                }
                if(c==4){//purple
                    StdDraw.setPenColor(168, 52, 235);
                }
                Drawings.drawBike(25, 15);
            }

            StdDraw.setPenColor(45, 67, 53);
            if(i>150 && i<450){
                StdDraw.text(25, 27, "The nautical mile distance from");
                StdDraw.text(25,24,"Amherst, MA to " + choosingCity(a).NameofCity());
                StdDraw.text(25,21," is " + distance + ".");
            }

            if(i>450 && i<750){
                StdDraw.text(25,30,"However, the road trail to your city is "+distanceTrail+ " miles.");
                StdDraw.text(25,27,"Based on your speed of "+ choosingBike(b,s).TellSpeed()+" mph,");
                StdDraw.text(25,24," it will take you ");
                StdDraw.text(25,21,timeToCity+ " hours to get there!");
            }
            if (i > 750 && i < 850) {
                //draw lets go!
                StdDraw.text(25, 25, "Let's go Bike!");
            }

            //draw the moving bike
            if (i > 850 && i < 850 + steps) {
                //as long as our bike doesnt reach the end of the page
                StdDraw.setPenColor(43, 37, 32);
                StdDraw.filledRectangle(0,0,50,5);//road
                StdDraw.line(0,15,50,15);
                //blue sky
                StdDraw.setPenColor(123, 155, 224);
                StdDraw.filledSquare(25,35,25);
                for(int k=0;k<50;k+=2){//drawing the trees
                    Drawings.pinetree(k, 17,7);
                    }
                //drawing the sun
                Drawings.sun(10,45);

                if(startXcor>40){
                    StdDraw.setPenColor(0,0,0);
                    StdDraw.text(25,30,"Almost there!");
                }
                //identifying pen color:
                if(c==1){//orange
                    StdDraw.setPenColor(219, 116, 26);
                }
                if(c==2){//red
                    StdDraw.setPenColor(194, 32, 23);
                }
                if(c==3){//blue
                    StdDraw.setPenColor(21, 80, 207);
                }
                if(c==4){//purple
                    StdDraw.setPenColor(168, 52, 235);
                }
                //moving bike
                startXcor = startXcor + .05;
                Drawings.drawBike(startXcor, 10);
            }

            if(startXcor > 50){
                if(a==1){//denver
                    StdDraw.picture(25, 25, "img.png", 50, 50);
                    StdDraw.setPenColor(255, 255, 255);
                    StdDraw.filledRectangle(10, 5, 15, 2);
                    StdDraw.setPenColor(12, 34, 133);
                    StdDraw.text(10, 5, "Welcome to Denver, CO!");
                }
                if(a==2){//Seattle
                    StdDraw.picture(25,25,"img_3.png",50,50);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledRectangle(15, 5, 15, 2);
                    StdDraw.setPenColor(128, 81, 28);
                    StdDraw.text(15,5,"Welcome to Seattle, WA!");
                }
                if(a==3){//San Fran
                    StdDraw.picture(25,25,"img_2.png",50,50);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledRectangle(15, 5, 15, 2);
                    StdDraw.setPenColor(112, 7, 19);
                    StdDraw.text(15,5,"Welcome to San Francisco, CA!");
                }

                if(a==4){//Atlanta
                    StdDraw.picture(25,25,"img_4.png",50,50);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledRectangle(15, 5, 15, 2);
                    StdDraw.setPenColor(18, 54, 22);
                    StdDraw.text(15,5,"Welcome to Atlanta, GA!");
                }
            }
            StdDraw.show();
            StdDraw.pause(10);//20
        }
    }

    //based on what the user chooses on keyboard, they call their city in this method:
    public static City choosingCity(int a) {
        City DenverCO = new City("Denver, CO", 39.73, 104.99);
        City SeattleWA = new City("Seattle, WA", 47.60, 122.33);
        City SanFran = new City("San Francisco, CA", 37.77, 122.41);
        City AtlantaGA = new City("Atlanta, GA", 33.74, 84.38);
        City[] cities = new City[4];//an array to store the cities in case someone chooses to do a random city
        cities[0] = DenverCO;
        cities[1] = SeattleWA;
        cities[2] = SanFran;
        cities[3] = AtlantaGA;

        if (a == 1) {
            return DenverCO;
        }
        if (a == 2) {
            return SeattleWA;
        }
        if (a == 3) {
            return SanFran;
        }
        if (a == 4) {
            return AtlantaGA;
        }
        if (a == 5) {
            int random = (int) (Math.random() * 4);
            return cities[random];
        }
        return null;
    }


    //based on what the user chooses on keyboard, they call their bike type in this method:
    public static Bike choosingBike(int type, int speed) {
        //mountain bike:
        if (type == 1) {
            Bike RoadBike = new Bike("road bike", speed);
            return RoadBike;
        }
        //electric bike:
        else {
            Bike ElectricBike = new Bike("electric bike", speed);
            return ElectricBike;
        }
    }


    public static String Color(int color) {
        String colors = "";
        if (color == 1) {
            colors += "orange";
        }
        if (color == 2) {
            colors += "red";
        }
        if (color == 3) {
            colors += "blue";
        }
        if(color==4){
            colors +="pruple";
        }
        return colors;
    }
}
