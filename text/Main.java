package text;
/*Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/
public class Main {
    public static void main(String[] args) {
        Word heading = new Word("Java");
        String line1 = "На сегодняшний момент язык Java является одним из самых распространенных и" +
                " популярных языков программирования.";
        Sentence sentence = new Sentence(line1);

        String line2 = "Байт-код выполняется виртуальной машиной JVM (Java Virtual Machine).";
        String line3 = "Для каждой из платформ (Windows, Linux, Mac OS) может быть своя реализация виртуальной машины JVM, но каждая из них может" +
                " выполнять один и тот же код.";
        Text poem = new Text(heading, sentence);
        poem.addSentence(new Sentence(line2));
        poem.addSentence(new Sentence(line3));

        poem.printText();
        poem.printHeading();
    }
}
