

/**
 * Task 4.2
 *
 * @author Pavlov Alexander
 */


class presents {
    public static final class present {
        private String name;
        private int price;
        private int weight;
        private String color;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {

        present[] Present = new present[3];

        Present[0] = new present();
        Present[0].setName("Candy");
        Present[0].setColor("Red");
        Present[0].setPrice(100);
        Present[0].setWeight(10);


        Present[1] = new present();
        Present[1].setName("Jellybean");
        Present[1].setColor("Blue");
        Present[1].setPrice(200);
        Present[1].setWeight(20);


        Present[2] = new present();
        Present[2].setName("Chocolate");
        Present[2].setColor("Black");
        Present[2].setPrice(300);
        Present[2].setWeight(30);

        int sumPrice = 0;
        sumPrice = sumPrice + Present[0].getPrice() + Present[1].getPrice() + Present[2].getPrice();


        int sumWeight = 0;
        sumWeight = sumWeight + Present[0].getWeight() + Present[1].getWeight() + Present[2].getWeight();


        System.out.println("Общая стоимость подарка = " + sumPrice + "," + " Общий вес подарка = " + sumWeight + "," +" В подарке находится = " + Present[0].getName() +", "+Present[1].getName() +" и "+ Present[2].getName()+".");





    }

}






