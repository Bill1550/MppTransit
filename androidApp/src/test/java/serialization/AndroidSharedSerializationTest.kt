package serialization

import com.loneoaktech.apps.shared.domain.model.SamplePrimitives
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Tests to verify serialization of classes created in the shared module.
 */
class AndroidSharedSerializationTest {

    /**
     * Verify that the shared module's class serializes
     */
    @Test
    fun serializePrimitives() {

        val p1 = SamplePrimitives(
            boolean =  true,
            int = 123,
            long = 123456789,
            string = "Some string data",
            float = 1.1f,
            double = 2.2
        )

        val p1Expected = """{"boolean":true,"int":123,"long":123456789,"string":"Some string data","float":1.1,"double":2.2}"""

        val p1json = Json.encodeToString(SamplePrimitives.serializer(), p1)

        println( "'$p1json'")
        assertEquals( p1Expected, p1json )
    }

    @Serializable
    data class LocalItem(
        val id: Int,
        val name: String
    )

    @Test
    fun serializeLocalClass() {

        val data1 = LocalItem( 42, "The Answer")

        val json = Json{
//            prettyPrint = true
        }

        val data1Json = json.encodeToString(LocalItem.serializer(), data1)
        println("data1: $data1Json")

        assertEquals("""{"id":42,"name":"The Answer"}""", data1Json)
    }
}