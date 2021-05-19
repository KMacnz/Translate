package translator;

import java.io.*;
import java.util.*;

/**
 * Māori to English/English to Maori Translator
 *
 * @author Keanna Mackereth
 */
public class Translator {
    
    /**Array lists with the different variables
     * inside containing all of the words the user might want to translate
     */
    public static ArrayList<String> textToCheck = new ArrayList<String>();
    //All must hold lowercase letters as any text the user types will be converted to lowercase
    public static final String MCOLOURTRANSLATED[] = {"kikorangi", "whero", "kowhai", "kakariki", "karaka", "waiporoporo", "parauri", "mawhero", "kiwikiwi", "ma", "koura", "pango", "mangu", "kōwhai", "kākāriki", "māwhero", "mā"};

    public static final String ECOLOURTRANSLATED[] = {"blue", "red", "yellow", "green", "orange", "purple", "brown", "pink", "grey", "white", "gold", "black", "yellow", "green", "pink", "white"};

    public static final String MNUMBERTRANSLATED[] = {"tahi", "rua", "toru", "wha", "rima", "ono", "whitu", "waru", "iwa", "tekau"};

    public static final String ENUMBERTRANSLATED[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public static final String MSHAPESTRANSLATED[] = {"porowhita", "tapatoru", "tapawha", "taparima", "tapaono", "tapawaru", "manawa", "whetu", "marama", "tapawhā", "whetū"};

    public static final String ESHAPESTRANSLATED[] = {"circle", "triangle", "square", "pentagon", "hexagon", "octagon", "heart", "star", "moon", "square", "star"};

    //Make the UI visible on the screen
    public static void main(String[] args) {
        userInput UI = new userInput();
        UI.setVisible(true);
    }
//Array List "Translates from Maori - English" created
    public static void translateThisM() {
        for (int i = 0; i < textToCheck.size(); i++) {
            //changed textToCheck to smallM as this will make all the letters be looked at as a lower case
            String smallM = textToCheck.get(i).toLowerCase();
            //if all the words are lowercase continue this array
            if (Arrays.asList(MCOLOURTRANSLATED).contains(smallM)) {
                //All the colours translated from Maori - English
                if (smallM.equals("kikorangi")) {
                    textToCheck.set(i, "blue");
                }
                if (smallM.equals("whero")) {
                    textToCheck.set(i, "red");
                }
                if (smallM.equals("kowhai")) {
                    textToCheck.set(i, "yellow");
                }
                if (smallM.equals("kakariki")) {
                    textToCheck.set(i, "green");
                }
                if (smallM.equals("karaka")) {
                    textToCheck.set(i, "orange");
                }
                if (smallM.equals("waiporoporo")) {
                    textToCheck.set(i, "purple");
                }
                if (smallM.equals("parauri")) {
                    textToCheck.set(i, "brown");
                }
                if (smallM.equals("mawhero")) {
                    textToCheck.set(i, "pink");
                }
                if (smallM.equals("kiwikiwi")) {
                    textToCheck.set(i, "grey");
                }
                if (smallM.equals("ma")) {
                    textToCheck.set(i, "white");
                }
                if (smallM.equals("koura")) {
                    textToCheck.set(i, "gold");
                }
                if (smallM.equals("pango")) {
                    textToCheck.set(i, "black");
                }
                if (smallM.equals("mangu")) {
                    textToCheck.set(i, "back");
                }
                if (smallM.equals("kōwhai")) {
                    textToCheck.set(i, "yellow");
                }
                if (smallM.equals("kākāriki")) {
                    textToCheck.set(i, "green");
                }
                if (smallM.equals("māwhero")) {
                    textToCheck.set(i, "pink");
                }
                if (smallM.equals("mā")) {
                    textToCheck.set(i, "white");
                }
            }
            if (Arrays.asList(MNUMBERTRANSLATED).contains(smallM)) {
                //All the numbers translated from Maori - English
                if (smallM.equals("tahi")) {
                    textToCheck.set(i, "one");
                }
                if (smallM.equals("rua")) {
                    textToCheck.set(i, "two");
                }
                if (smallM.equals("toru")) {
                    textToCheck.set(i, "three");
                }
                if (smallM.equals("wha")) {
                    textToCheck.set(i, "four");
                }
                if (smallM.equals("rima")) {
                    textToCheck.set(i, "five");
                }
                if (smallM.equals("ono")) {
                    textToCheck.set(i, "six");
                }
                if (smallM.equals("whitu")) {
                    textToCheck.set(i, "seven");
                }
                if (smallM.equals("waru")) {
                    textToCheck.set(i, "eight");
                }
                if (smallM.equals("iwa")) {
                    textToCheck.set(i, "nine");
                }
                if (smallM.equals("tekau")) {
                    textToCheck.set(i, "ten");
                }
            }
            if (Arrays.asList(MSHAPESTRANSLATED).contains(smallM)) {
                //All the shapes translated from Maori - English
                if (smallM.equals("porowhita")) {
                    textToCheck.set(i, "circle");
                }
                if (smallM.equals("tapatoru")) {
                    textToCheck.set(i, "triangle");
                }
                if (smallM.equals("tapawha")) {
                    textToCheck.set(i, "square");
                }
                if (smallM.equals("taparima")) {
                    textToCheck.set(i, "pentagon");
                }
                if (smallM.equals("tapaono")) {
                    textToCheck.set(i, "hexagon");
                }
                if (smallM.equals("tapawaru")) {
                    textToCheck.set(i, "octagon");
                }
                if (smallM.equals("manawa")) {
                    textToCheck.set(i, "heart");
                }
                if (smallM.equals("whetu")) {
                    textToCheck.set(i, "star");
                }
                if (smallM.equals("marama")) {
                    textToCheck.set(i, "moon");
                }
                if (smallM.equals("tapawhā")) {
                    textToCheck.set(i, "square");
                }
                if (smallM.equals("whetū")) {
                    textToCheck.set(i, "star");
                }
            }

        }
    }
//Array List "Translates from English - Maori" created
    public static void translateThisE() {
        for (int i = 0; i < textToCheck.size(); i++) {
            //changed textToCheck to smallM as this will make all the letters be looked at as a lower case
            String smallE = textToCheck.get(i).toLowerCase();
            //if all the words are lowercase continue this array
            if (Arrays.asList(ECOLOURTRANSLATED).contains(smallE)) {
                //All the colours translated from English - Maori
                if (smallE.equals("blue")) {
                    textToCheck.set(i, "kikorangi");
                }
                if (smallE.equals("red")) {
                    textToCheck.set(i, "whero");
                }
                if (smallE.equals("yellow")) {
                    textToCheck.set(i, "kōwhai");
                }
                if (smallE.equals("green")) {
                    textToCheck.set(i, "kākāriki");
                }
                if (smallE.equals("orange")) {
                    textToCheck.set(i, "karaka");
                }
                if (smallE.equals("purple")) {
                    textToCheck.set(i, "waiporoporo");
                }
                if (smallE.equals("brown")) {
                    textToCheck.set(i, "parauri");
                }
                if (smallE.equals("pink")) {
                    textToCheck.set(i, "māwhero");
                }
                if (smallE.equals("grey")) {
                    textToCheck.set(i, "kiwikiwi");
                }
                if (smallE.equals("white")) {
                    textToCheck.set(i, "mā");
                }
                if (smallE.equals("gold")) {
                    textToCheck.set(i, "koura");
                }
                if (smallE.equals("black")) {
                    textToCheck.set(i, "pango");
                }
            }
            if (Arrays.asList(ENUMBERTRANSLATED).contains(smallE)) {
                //All the numbers translated from English - Maori
                if (smallE.equals("one")) {
                    textToCheck.set(i, "tahi");
                }
                if (smallE.equals("two")) {
                    textToCheck.set(i, "rua");
                }
                if (smallE.equals("three")) {
                    textToCheck.set(i, "toru");
                }
                if (smallE.equals("four")) {
                    textToCheck.set(i, "wha");
                }
                if (smallE.equals("five")) {
                    textToCheck.set(i, "rima");
                }
                if (smallE.equals("six")) {
                    textToCheck.set(i, "ono");
                }
                if (smallE.equals("seven")) {
                    textToCheck.set(i, "whitu");
                }
                if (smallE.equals("eight")) {
                    textToCheck.set(i, "waru");
                }
                if (smallE.equals("nine")) {
                    textToCheck.set(i, "iwa");
                }
                if (smallE.equals("ten")) {
                    textToCheck.set(i, "tekau");
                }
            }
            if (Arrays.asList(ESHAPESTRANSLATED).contains(smallE)) {
                //All the shapes translated from English - Maori
                if (smallE.equals("circle")) {
                    textToCheck.set(i, "porowhita");
                }
                if (smallE.equals("triangle")) {
                    textToCheck.set(i, "tapatoru");
                }
                if (smallE.equals("square")) {
                    textToCheck.set(i, "tapawhā");
                }
                if (smallE.equals("pentagon")) {
                    textToCheck.set(i, "taparima");
                }
                if (smallE.equals("hexagon")) {
                    textToCheck.set(i, "tapaono");
                }
                if (smallE.equals("octagon")) {
                    textToCheck.set(i, "tapawharu");
                }
                if (smallE.equals("heart")) {
                    textToCheck.set(i, "manawa");
                }
                if (smallE.equals("star")) {
                    textToCheck.set(i, "whetū");
                }
                if (smallE.equals("moon")) {
                    textToCheck.set(i, "marama");
                }
            }
        }
    }

    /**
     * When this method is selected the program will read the file
     * and then translate the appropriate words that need translating and leave the others black
     * @param thisFile 
     */
    public static void readAFile(File thisFile) {
        String currentLine = null;

        try {
            FileReader fr = new FileReader(thisFile);

            BufferedReader br = new BufferedReader(fr);
            //reads the lines of text
            while ((currentLine = br.readLine()) != null) {
                //add the individual words to the Array list separated by the space
                String words[] = currentLine.split(" ");
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    textToCheck.add(word);
                }
            }
            br.close();
            //get the translating methods to translate the text
            translateThisM();
            translateThisE();
            writeAFile(thisFile.getName(), thisFile.getParentFile().getPath());
        } catch (FileNotFoundException ex) {
            System.out.println("Cant open file " + thisFile.getName());
        } catch (IOException ex) {
            System.out.println("Error reading file " + thisFile.getName());
        }
    }
/**
 * When this method is selected the program will find the file the user has selected
 * and then translate the appropriate words onto this new document for the user to save and find again 
 * while leaving the words that don't need translating the same
 * @param existingFilename
 * @param path 
 */
    public static void writeAFile(String existingFilename, String path) {
        String newFilename = "Translated " + existingFilename;
        //create a file with new name
        File translatedFile = new File(path + File.separator + newFilename);
        try {
            //create a new file if there isnt already a file with the "translator_" name
            if (!translatedFile.exists()) {
                translatedFile.createNewFile();
            }
            //create the writers for the file
            FileWriter fw = new FileWriter(translatedFile);
            BufferedWriter bw = new BufferedWriter(fw);
            //loop through the array list adding words back into the string
            String translatedText = "";
            for (int i = 0; i < textToCheck.size(); i++) {
                translatedText = translatedText + " " + textToCheck.get(i);
            }
            //write the text into the translated file
            bw.write(translatedText);
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error writing file " + newFilename + " " + ex);
        }

    }
}
