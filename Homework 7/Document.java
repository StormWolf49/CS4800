class Document {
    private StringBuilder content;

    public Document() {
        this.content = new StringBuilder();
    }

    public void addCharacter(Character character) {
        content.append(character.getValue());
    }

    public String getContent() {
        return content.toString();
    }
}