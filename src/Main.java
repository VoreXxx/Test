public class Main {
    public static String[] splitString (String str) {
        int lenght = str.length();
        int middleIndex = lenght / 2;
        String firstHalf = str.substring(0, middleIndex);
        String secondHaf = str.substring(middleIndex);
        return new String[]{firstHalf, secondHaf};
    }
    public static void main(String[] args) {
        String str = "Кирпич";
        String[] halves = splitString(str);
        System.out.println("Первая часть " + halves[0]);
        System.out.println("Второая часть " + halves[1]);
    }
}

