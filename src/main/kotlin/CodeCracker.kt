import java.lang.IllegalArgumentException

class CodeCracker(private val alphabet: String,
                  private val key: String) {

  init {
    validateInput()
  }
  
  fun decrypt(message: String): String {
    return message
        .map { alphabet.elementAt(key.toCharArray().indexOf(it)) }
        .joinToString(separator = "")
  }

  fun encrypt(message: String): String {
    return message
        .map { key.elementAt(alphabet.toCharArray().indexOf(it)) }
        .joinToString(separator = "")
  }

  private fun validateInput() {
    if (alphabet.length != key.length) {
      throw IllegalArgumentException("alphabet and key with different size")
    }
  }

}