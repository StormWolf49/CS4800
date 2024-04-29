import java.io.*;
import java.util.HashMap;
import java.util.Map;

class TextEditor {
    private Map<String, CharacterProperties> characterPropertiesMap;
    private Document document;

    public TextEditor() {
        this.characterPropertiesMap = new HashMap<>();
        this.document = new Document();
    }

    public CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        return characterPropertiesMap.computeIfAbsent(key, k -> new CharacterProperties(font, color, size));
    }

    public void addCharacter(char value, CharacterProperties properties) {
        document.addCharacter(new Character(value, properties));
    }

    public void saveDocument(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(document.getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDocument(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    CharacterProperties properties = getCharacterProperties("Arial", "Black", 12); // Default properties
                    addCharacter(c, properties);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDocumentContent() {
        return document.getContent();
    }
}