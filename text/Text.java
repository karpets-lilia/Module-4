package text;

import java.util.ArrayList;

public class Text {
    private Word heading;
    private ArrayList<Sentence> content;

    Text(Word heading, Sentence sentence) {
        this.heading = heading;
        this.content = new ArrayList<>();
        this.content.add(sentence);
    }

    void addSentence (Sentence sentence) {
        this.content.add(sentence);
    }

    void printText() {
        for(Sentence sentence : this.content) {
            System.out.println(sentence);
        }
    }

    void printHeading() {
        System.out.println(heading);
    }
}
