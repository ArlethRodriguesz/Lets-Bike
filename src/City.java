public class City {
        //City represents a city's location on Earth using latitudes and longitudes.
        // method distanceTo() computes distances between two cities using the great-circle distance

        //instance variables:
        private String CityName;
        private double latitude;
        private double longitude;

        //constructor: which represents the location of ONE place (ie Amherst, MA)
        public City(String city, double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.CityName=city;
        }

        //calling the values assigned to the instance variables:
        //City Name:
        public String NameofCity(){
            return CityName;
        }

        //longitude:
        public double tellLatitude() {
            return latitude;
        }
        //longitude:
        public double tellLongitude() {
            return longitude;
        }

        //computes distances using the great-circle distance
        //this method can be called in main
        public double distanceTo(City other){
            //converting from degrees to radians to be able to use in equation
            double dLat1=Math.toRadians(this.latitude);//calling lat of object here
            double dLong1=Math.toRadians(this.longitude);
            double dLat2=Math.toRadians(other.latitude);//
            double dLong2=Math.toRadians(other.longitude);

            //Great Circle distance Equation:
            double equation= 60*Math.acos((Math.sin(dLat1)*Math.sin(dLat2))+(Math.cos(dLat1)*Math.cos(dLat2)*Math.cos(dLong1-dLong2)));
            //converting the equation that is in radians into degrees

            double disDegrees=Math.toDegrees(equation);

            return disDegrees;
        }

    }


