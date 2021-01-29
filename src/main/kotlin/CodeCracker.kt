class CodeCracker(private val alphabet: String, private val key: String) {

  fun decrypt(message: String): String {
    return message
        .map { alphabet.elementAt(key.toCharArray().indexOf(it)) }
        .joinToString(separator = "")
  }

}