import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        Set<String> setRecipe = null;
        List<String> listRecipe = null;
        Map<Integer, String> mapRecipe = null;


        if (type.equalsIgnoreCase("set")) {
            setRecipe = new LinkedHashSet<>();
        } else if (type.equalsIgnoreCase("list")) {
            listRecipe = new ArrayList<>();
        } else if (type.equalsIgnoreCase("map")) {
            mapRecipe = new LinkedHashMap<>();
        } else {
            System.out.println("잘못된 구조 입력입니다.");
        }

        String title = sc.nextLine();

        float rateFloat = sc.nextFloat();
        sc.nextLine();

        int rate = (int) rateFloat;
        double ratePercent = rate * 100 / 5.0;

        int step = 1;
        while (true) {
            String txt = sc.nextLine();
            if (txt.equals("끝")) {
                break;
            } else if (setRecipe != null) {
                setRecipe.add(txt);
            } else if (listRecipe != null) {
                listRecipe.add(txt);
            } else if (mapRecipe != null) {
                mapRecipe.put(step, txt);
            }
            step++;
        }

        System.out.println("[" + title + "]");
        System.out.println("별점 :" + rate + " (" + ratePercent + "%)");

        if (listRecipe != null) {
            for (int i = 0; i <= listRecipe.size(); i++) {
                System.out.println((i + 1) + ". " + listRecipe.get(i));
            }
        } else if (setRecipe != null) {
            int j = 0;
            for (String p : setRecipe) {
                System.out.println((j + 1) + ". " + p);
                j++;
            }
        } else if (mapRecipe != null) {
            for (Integer key : mapRecipe.keySet()) {
                System.out.println(key + ". " + mapRecipe.get(key));
            }
        }
    }
}
