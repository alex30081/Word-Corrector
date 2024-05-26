package app;

public class Corrector {

    public static String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs){
            if (str.equals ("b")) {
                str = str.replaceAll( "b", "o");
            }
            count++;
            stringBuilder.append(count).append(")").append(str).append("\n");
        }
        return stringBuilder.toString();

    }

}
