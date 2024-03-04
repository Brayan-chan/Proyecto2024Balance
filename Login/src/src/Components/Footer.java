package src.Components;

public class Footer {
    String CEO, author, position;

    public Footer(String CEO, String author, String position) {
        this.CEO = CEO;
        this.author = author;
        this.position = position;
    }

    public String getCEO() {
        return "Autorizado por: " + CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPosition() {
        return position;
    }
}
