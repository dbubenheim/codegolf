package codesignal.arcade

class CorrectVariableName {

    fun variableName(n: String) = n.matches("[a-zA-Z_]+[a-zA-Z0-9_]*".toRegex())
}