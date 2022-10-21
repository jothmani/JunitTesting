import org.jothmart.testing.PalindromeCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromCheckTest {

    @DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = {"bob", "radar","civic","level"})
    public void TestIsPalindrome(String str){
        PalindromeCheck pc = new PalindromeCheck();
        boolean result = pc.isPalindrome(str);
        assertTrue(result);
    }

}
