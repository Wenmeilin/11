package documentation.parameters.rule

import com.algolia.search.dsl.query
import com.algolia.search.dsl.settings
import documentation.index
import kotlinx.coroutines.test.runTest
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class DocEnableRules {

//    enableRules: Boolean = true|false

    @Test
    fun snippet1() {
        runTest {
            val settings = settings {
                enableRules = true
            }

            index.setSettings(settings)
        }
    }

    @Test
    fun snippet2() {
        runTest {
            val query = query("query") {
                enableRules = true
            }

            index.search(query)
        }
    }
}
