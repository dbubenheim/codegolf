package codesignal.challenge

import kotlin.test.assertFalse
import kotlin.test.assertTrue

class VariableName {

    companion object {

        fun variableName(n: String) = n.matches("[A-Za-z_]\\w*".toRegex())

        @JvmStatic
        fun main(args: Array<String>) {

            assertTrue(variableName("var_1__Int"))
            assertFalse(variableName("qq-q"))
            assertFalse(variableName("2w2"))
            assertFalse(variableName(" variable"))
            assertFalse(variableName("va[riable0"))
            assertTrue(variableName("variable0"))
        }
    }
}
