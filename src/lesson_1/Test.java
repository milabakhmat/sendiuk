package lesson_1;

public class Test {
    public static void main(String[] args) {

        House cottage = new House ("cottage", 2, true, 2, 4, 1);
        float length = 20;
        float width = 30;
        float area = cottage.calculateArea(length, width);
        float peri = cottage.calculatePerimeter(length, width);
        System.out.println("House1 is a " + cottage.type + " with " + cottage.storey +
                " storeys and " + cottage.bathroom + " bathrooms and " +
                cottage.bedroom + " bedrooms." + "\nThe area is " + area
                + "\nThe perimeter is " +peri);

    }
}