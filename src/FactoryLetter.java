import java.util.HashMap;

public class FactoryLetter {

    static HashMap<Character,LetterInterface> characterLetterInterfaceHashMap = new HashMap<>();

    public static LetterInterface getLetterObject(char ch){
        if(characterLetterInterfaceHashMap.containsKey(ch)){
            return characterLetterInterfaceHashMap.get(ch);
        }
        else{
            System.out.println("Adding character to map :" + ch);
            Letter letter = new Letter("Times New Roman","10",ch);
            characterLetterInterfaceHashMap.put(ch,letter);
            return characterLetterInterfaceHashMap.get(ch);
        }
    }
}
