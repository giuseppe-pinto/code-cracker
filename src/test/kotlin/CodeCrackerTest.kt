import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
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

  @Test
  internal fun shouldSizeOfAlphabetAndKeyTheSameForDecrypt() {
    
    val exception = assertThrows(java.lang.IllegalArgumentException::class.java) {
      CodeCracker("ABGFT", "BNM098665")
    }

    assertEquals("alphabet and key with different size", exception.message)
    
  }
}