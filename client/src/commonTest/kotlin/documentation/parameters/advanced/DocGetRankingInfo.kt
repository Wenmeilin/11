package documentation.parameters.advanced

import com.algolia.search.dsl.query
import documentation.index
import kotlinx.coroutines.test.runTest
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class DocGetRankingInfo {

//    getRankingInfo: Boolean = true|false

    @Test
    fun snippet1() {
        runTest {
            val query = query("query") {
                getRankingInfo = true
            }

            index.search(query)
        }
    }
}
