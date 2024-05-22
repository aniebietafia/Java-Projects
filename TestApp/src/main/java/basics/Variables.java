package basics;

public class Variables {
    public static void main(String[] args) {
        String $dollar$ = "United States";
        //int 2multiples = 8;
        System.out.println($dollar$);

        int dataValue;
        dataValue = 100;
        System.out.println(dataValue);

        int anotherDataValue = dataValue;
        System.out.println(anotherDataValue);

        dataValue = 99;
        anotherDataValue = 88;

        System.out.println("New value "+ dataValue);
        System.out.println("New value " + anotherDataValue);
    }
}
