import com.google.inject.Inject
import org.slf4j.Logger
import org.spongepowered.api.plugin.Plugin

/**
 * Created by karayuu on 2018/03/12
 */
@Plugin(
        id = PLUGIN_ID,
        name = "ReSeichiAssist",
        version = "1.0.0"
)
object ReSeichiAssist {
    /** Logger */
    @Inject lateinit var logger: Logger


}

const val PLUGIN_ID = "re_seichi_assist"
