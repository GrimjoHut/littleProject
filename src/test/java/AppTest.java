import org.junit.jupiter.api.Test;
import ru.noxly.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

	@Test
	void greetShouldReturnExpectedMessage() {
		assertEquals("Hello, Grimjo!", App.greet("Grimjo"));
	}

	@Test
	void sumShouldWorkCorrectly() {
		assertEquals(5, App.sum(2, 3));
	}
}