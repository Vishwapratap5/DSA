public class GetTreeHight {
    public static void main(String[] args) {
        GetTreeHight obj = new GetTreeHight();
        System.out.println(obj.findHight(56F,19F,1.8F));
    }

    public double findHight(double angle,double baseDistance,double instrumentHight) {
        double topHight=Math.tan(angle*(3.14/180))*baseDistance;
        return Math.ceil(topHight+instrumentHight);
    }
}
