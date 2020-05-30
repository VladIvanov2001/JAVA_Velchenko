public class Encyclopedia extends Book {
    String scientistArea;
    Encyclopedia(String author, int yearOfEdition, String typeOfCover, String scientistArea) {
        super(author, yearOfEdition, typeOfCover);
        this.scientistArea = scientistArea;
    }

    public String getScientistArea() {
        return scientistArea;
    }

    public void setScientistArea(String scientistArea) {
        this.scientistArea = scientistArea;
    }

    @Override
    public void showInfo() {
        System.out.println("Автор книги: " + getAuthor() +
                "\n" + "Тип обложки: " + getTypeOfCover() +
                "\n" + "Год издания: " + getYearOfEdition() +
                "\n" + "Область науки: " + getScientistArea());
    }
}
