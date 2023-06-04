public class Letter implements LetterInterface{

    //Intrinsic object

    private String font;
    private String size;

    private char ch;

    public Letter(String font,String size, char ch){
        this.font=font;
        this.size=size;
        this.ch=ch;
    }


    @Override
    public void display(int x, int y) {
        //Display character on text editor
    }
}
