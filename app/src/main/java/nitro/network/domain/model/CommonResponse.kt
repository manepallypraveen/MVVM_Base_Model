package nitro.network.domain.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommonResponse(
    val message: String? = null,
    var success: Boolean? = null
)
