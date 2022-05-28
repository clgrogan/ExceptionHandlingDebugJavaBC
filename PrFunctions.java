public class PrFunctions {
    public static void main(String[] args) {

        int gryffindor = 299;
        int ravenclaw = 100;
        int pointsMargin = gryffindor - ravenclaw;
        int ranking = ranking(pointsMargin);
        System.out.println(ranking);

    }

    /**
     * 
     * "If Gryffindor beats Ravenclaw by a margin of three hundred points,
     * they win the championship.
     * 
     * If they win by any number of points, they would come second.
     * If they lose by less than a hundred points, they come third behind
     * Hufflepuff.
     * If they lose by more than a hundred points, they would be in fourth place"
     * 
     * @param pointsMargin
     * @return
     */
    public static int ranking(int pointsMargin) {
        if (pointsMargin < -100) {
            return 4;
        } else if (pointsMargin < 0) {
            return 3;
        } else if (pointsMargin < 300) {
            return 2;
        } else {
            return 1;
        }
    }

}
