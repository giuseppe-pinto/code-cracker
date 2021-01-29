import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CodeCrackerTest {
  
  @Test
  fun decrypt() {
    
    val cracker =
        CodeCracker("abcio", "234ty")

    val actual = cracker.decrypt("4t2y")
    
    assertEquals("ciao", actual)
    
  }

  @Test
  fun encrypt() {

    val cracker =
        CodeCracker("abcio", "234ty")

    val actual = cracker.encrypt("ciao")

    assertEquals("4t2y", actual)
    
  }
}