import com.loneoaktech.apps.shared.Greeting
import com.loneoaktech.apps.shared.Platform
import com.loneoaktech.apps.shared.domain.model.SamplePrimitives
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    println("Hello World!")

    val greeting = Greeting().greeting()
    println("Greeting=$greeting")

     val platform = Platform()
    println("platform=${platform.platform}")

    val p1 = SamplePrimitives(
        boolean =  true,
        int = 123,
        long = 123456789,
        string = "Some string data",
        float = 1.1f,
        double = 2.2
    )

    val formatter = Json { prettyPrint=true }
    println( formatter.encodeToString( SamplePrimitives.serializer(), p1 ))
}