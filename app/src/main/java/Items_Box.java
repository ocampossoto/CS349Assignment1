import java.util.ArrayList;

public class Items_Box {
    private String data;

    public Items_Box(String x){
        data =x;
    }

    public static ArrayList<Items_Box> createList(int num_items){
        ArrayList<Items_Box> items = new ArrayList<Items_Box>();

        for (int i = 1; i <= num_items; i++) {
            items.add(new Items_Box("RecyclerView Item :" + i));
        }

        return items;
    }
}
