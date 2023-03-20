package Lab7;

public class AirPlane {

    public void wingInfo(Integer numPlane, Integer weight) {
        Wing wing = new Wing(numPlane,weight);
        wing.showWeight();
    }


    class Wing {
        private Integer weight, numPlane;

        public Wing(Integer numPlane, Integer weight) {
            this.numPlane = numPlane;
            this.weight = weight;
        }

        public void showWeight() {

            System.out.println("Самолет №" + numPlane + ".  Вес крыла: " + weight + " кг");
        }



    }


}



