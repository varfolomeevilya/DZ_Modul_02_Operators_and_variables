

public class Task10 {
    public static void main(String[] args) {
       final int height= 190;
       final int weight = 75;
       int dif= weight-(height-110);
       if(dif < 0) System.out.printf("надо набрать %d kg ", Math.abs(dif));
       else
           System.out.printf("надо сбросить %d kg ", Math.abs(dif));

    }
}
