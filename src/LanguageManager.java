public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() { return language; }

    public void setLanguage(Language language) { this.language = language; }

    public void Language(){
        String nextLine = InputManager.INSTANCE.getString();
        if (nextLine.equals("cz")){
            LanguageManager.INSTANCE.setLanguage(Language.CZECH);
        } else if (nextLine.equals("en")) {
            LanguageManager.INSTANCE.setLanguage(Language.ENGLISH);
        }
    }
}
