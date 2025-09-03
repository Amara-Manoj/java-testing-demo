import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test void testPalindromeTrue() { assertTrue(utils.isPalindrome("Racecar")); }
    @Test void testPalindromeFalse() { assertFalse(utils.isPalindrome("Hello")); }
    @Test void testReverse() { assertEquals("cba", utils.reverse("abc")); }
    @Test void testReverseNull() { assertNull(utils.reverse(null)); }
}
