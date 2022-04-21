import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void simpleCheck() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> simpleLinks = MarkdownParse.getLinks(content);
        assertEquals("https://something.com", simpleLinks.get(0));
        assertEquals("some-thing.html", simpleLinks.get(1));
    }
}
