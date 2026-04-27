import java.util.LinkedList;

public class DeclareVariable {
    public static void main(String args[]) {
        float StrukturBaris;

        String SusunanKataBaru = "Pemrograman Struktur Data Java";

        int[] DelapanAngka = {12, 18, 23, 33, 58, 67, 82};

        String[][] DuaAngka = {{"2", "4", "6"}, {"8, 10", "12"}, {"14", "16", "18"}};

        LinkedList<Integer> UrutanListAngka = new LinkedList<>();

        UrutanListAngka.add(15);
        UrutanListAngka.add(28);
        UrutanListAngka.add(33);
        UrutanListAngka.add(47);
        UrutanListAngka.add(59);

        System.out.println(UrutanListAngka);
    }
}