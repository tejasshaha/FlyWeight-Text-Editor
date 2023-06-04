public class main {
    public static void main(String[] args) {

        for(int i=0;i<1000;i++){
            char ch= (char) ( ('a'+i%26));
            LetterInterface letterInterface = FactoryLetter.getLetterObject(ch);
            letterInterface.display(i+1,i+1);
        }

    }
}

