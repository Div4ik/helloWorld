package Magazine;
public class BookTwo extends printedProduct{
    private String nameAuthor;

    public BookTwo (String name, int pageQuantity, String content, String nameAuthor){
        super(name, pageQuantity, content);
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

}
