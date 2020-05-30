import org.testng.Assert;
import org.testng.annotations.Test;

public class EncyclopediaTest {

    private Encyclopedia book = new Encyclopedia("Ломоносов", 1985,"твёрдый", "Геометрия");
    private Encyclopedia book1 = new Encyclopedia("Пушкин", 1956,"твёрдый", "Физика");
    private Encyclopedia book2 = new Encyclopedia("Есенин", 1985,"твёрдый", "Химия");

    @Test
    public void getScientistArea() throws Exception{
        Assert.assertEquals("Геометрия", book.getScientistArea());
        Assert.assertEquals("Физика", book1.getScientistArea());
        Assert.assertEquals("Химия", book2.getScientistArea());
    }
    @Test
    public void getAuthor() throws Exception{
        Assert.assertEquals("Ломоносов", book.getAuthor());
        Assert.assertEquals("Пушкин", book1.getAuthor());
        Assert.assertEquals("Есенин", book2.getAuthor());
    }
    @Test
    public void getYearOfEdition() throws Exception{
        Assert.assertEquals(1985, book.getYearOfEdition());
        Assert.assertEquals(1956, book1.getYearOfEdition());
        Assert.assertEquals(1978, book2.getYearOfEdition());
    }
}