import com.loneoaktech.apps.shared.domain.model.SamplePrimitives
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Tests to verify serialization of classes created in the shared module.
 */
class SharedSerializationTest {

    /**
     * Verify that the primitive types encode/decode properly
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
}