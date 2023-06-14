public class HorribleSteve {
    public static void main(String [] args) {
        int i = 0, j=0;
        while(i<500){
            i++;
            j++;
            if (!Flik.isSameNumber(i, j)){
                break;
            }
        }
        System.out.println("i is " + i);
    }
}
