package codesignal.challenge

class ReverseSentence {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

        }

        fun reverseSentence(sentence: String) = sentence.split(" ").reversed().joinToString(" ")
    }
}