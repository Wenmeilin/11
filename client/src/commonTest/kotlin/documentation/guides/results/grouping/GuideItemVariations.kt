package documentation.guides.results.grouping

import com.algolia.search.dsl.query
import com.algolia.search.dsl.searchableAttributes
import com.algolia.search.dsl.settings
import com.algolia.search.model.Attribute
import com.algolia.search.model.settings.Distinct
import documentation.index
import kotlinx.coroutines.test.runTest
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class GuideItemVariations {

    @Test
    fun snippet1() {
        runTest {
            val settings = settings {
                searchableAttributes {
                    +"model"
                    +"type"
                    +"color"
                }
            }

            index.setSettings(settings)
        }
    }

    @Test
    fun snippet2() {
        runTest {
            val settings = settings {
                attributeForDistinct = Attribute("model")
                distinct = Distinct(1)
            }

            index.setSettings(settings)
        }
    }

    @Test
    fun snippet3() {
        runTest {
            val query = query("query") {
                distinct = Distinct(1)
            }

            index.search(query)
        }
    }
}
