public class H7_Test {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        CharacterProperties prop1 = textEditor.getCharacterProperties("Arial", "Red", 12);
        textEditor.addCharacter('H', prop1);

        CharacterProperties prop2 = textEditor.getCharacterProperties("Calibri", "Blue", 14);
        textEditor.addCharacter('e', prop2);

        CharacterProperties prop3 = textEditor.getCharacterProperties("Verdana", "Black", 16);
        textEditor.addCharacter('l', prop3);
        textEditor.addCharacter('l', prop3);

        CharacterProperties prop4 = textEditor.getCharacterProperties("Arial", "Red", 12);
        textEditor.addCharacter('o', prop4);
        textEditor.addCharacter(' ', prop4);

        textEditor.saveDocument("document.txt");

        textEditor.loadDocument("document.txt");
        System.out.println(textEditor.getDocumentContent());

        SongServiceProxy songServiceProxy = new SongServiceProxy(new DummySongService());

        for (int i = 1; i <= 10; i++) {
            Song song = songServiceProxy.searchById(i);
            System.out.println("Song ID: " + i + ", Title: " + song.getTitle() + ", Artist: " + song.getArtist());
        }
    }
}
