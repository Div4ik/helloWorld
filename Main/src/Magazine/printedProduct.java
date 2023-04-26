package Magazine;

public class printedProduct {
    private String name;
    private int pageQuantity;
    private String content;


    public void printContent () {
        System.out.println(content);
    }

    public printedProduct(String name, int pageQuantity, String content) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.content = content;
    }

    @Override
    public String toString() {
        return "printedProduct{" +
                "name='" + name + '\'' +
                ", pageQuantity=" + pageQuantity +
                ", content='" + content + '\'' +
                '}';
    }
}
