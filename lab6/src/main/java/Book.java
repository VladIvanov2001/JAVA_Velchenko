public abstract class Book implements Edition {
    private String author;
    private int yearOfEdition;
    private String typeOfCover;

    Book(String author, int yearOfEdition, String typeOfCover){
        this.author = author;
        this.yearOfEdition = yearOfEdition;
        this.typeOfCover = typeOfCover;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    public String getAuthor() {
        return author;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public void showInfo() {
        System.out.println("Автор книги: " + author +
                "\n" + "Тип обложки: " + typeOfCover +
                "\n" + "Год издания: " + yearOfEdition);
    }
}
