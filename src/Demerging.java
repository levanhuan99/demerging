import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Staff staff1 = new Staff("staff1", true, 20);
        Staff staff2 = new Staff("staff2", false, 65);
        Staff staff3 = new Staff("staff3", true, 32);
        Staff staff4 = new Staff("staff4", true, 19);
        Staff staff5 = new Staff("staff5", false, 43);
        Staff staff6 = new Staff("staff6", true, 10);
        Staff staff7 = new Staff("staff7", true, 23);
        Staff staff8 = new Staff("staff8", false, 52);
        Staff staff9 = new Staff("staff9", true, 49);
        Staff staff10 = new Staff("staff10", false, 54);
        ArrayList<Staff> list = new ArrayList<Staff>();
        list.add(staff1);
        list.add(staff2);
        list.add(staff3);
        list.add(staff4);
        list.add(staff5);
        list.add(staff6);
        list.add(staff7);
        list.add(staff8);
        list.add(staff9);
        list.add(staff10);

        Queue<Staff> NU = new LinkedList<Staff>();
        Queue<Staff> NAM = new LinkedList<Staff>();

        //add staff to queue NU or NAM
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender()) {
                NAM.add(list.get(i));
            } else NU.add(list.get(i));
        }

        Queue<Staff> output = new LinkedList<Staff>();

        while (!NU.isEmpty()) {
            output.add(NU.remove());
        }
        while (!NAM.isEmpty()) {
            output.add(NAM.remove());
        }

         System.out.println(output.size());


    }
}
