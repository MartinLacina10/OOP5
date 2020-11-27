public class Launcher {

    public void run() throws InterruptedException {
        while (true) {
            System.out.println(LanguageManager.INSTANCE.getLanguage());
            LanguageManager.INSTANCE.Language();
        }
    }
}
