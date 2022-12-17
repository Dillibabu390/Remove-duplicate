import java.util.ArrayList;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<String> listone = new ArrayList<>();
        listone.add("one");
        listone.add("two");
        ArrayList<String> listtwo = new ArrayList<>();
        listtwo.add("one");
        listtwo.add("two");
        listtwo.add("three");
        for (int i=0; i<listtwo.size(); i++){
            if (!listone.contains(listtwo.get(i))){
                listtwo.remove(i);
            }
        }
        System.out.println(listone);
        System.out.println(listtwo);

    }
}
