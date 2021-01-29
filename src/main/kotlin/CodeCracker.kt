class CodeCracker(private val alphabet: String, private val key: String) {


  fun decrypt(message: String): String {
    
    var result = ""

    message
        .forEach { result += alphabet.elementAt(key.toCharArray().indexOf(it)) }
    
    return result
    
  }

}