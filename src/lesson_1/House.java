package lesson_1;

public class House {

    int storey;
    String type;
    boolean isMultiStoreyed;
    float length;
    float width;
    int bathroom;
    int bedroom;
    int kitchen;

    public House(String type, int storey, boolean isMultiStoreyed, int bathroom, int bedroom, int kitchen){
        this.type = type;
        this.storey = storey;
        this.isMultiStoreyed = isMultiStoreyed;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
    }
    public float calculateArea(float length, float width) {
        return length * width;
    }

    public float calculatePerimeter(float length, float width) {
        return 2 *(length + width);
    }
}
