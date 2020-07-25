public class chuku {
    public static void main(String[] args) {
        String name = "Shovon";
        String str = "X";
        str = str.replaceAll("X", "XXXXXXXXXX");
        str = str.replaceAll("X", name + "\n");
        System.out.println(str);
    }
}
