public class Problem1 {
    public static void main(String[] args) {
        double side = 3;
        double areaOfSquare = Math.pow(side, 2);
        System.out.println(areaOfSquare);

        int heightR = 3, widthR = 4;
        int areaOfRectangle = heightR * widthR;
        System.out.println(areaOfRectangle);

        int heightT = 8, baseT = 2;
        int areaOfTriangle = (baseT * heightT) / 2;
        System.out.println(areaOfTriangle);
    }
}
