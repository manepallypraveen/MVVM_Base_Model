package nitro.network.domain.usecase.usecase

import nitro.network.domain.exception.traceErrorException
import nitro.network.domain.usecase.base.UseCaseResponse
import kotlinx.coroutines.*
import java.util.concurrent.CancellationException

abstract class NycSchoolsUseCaseMain<Type, in Params>() where Type : Any {

    abstract suspend fun getSchoolsInfo(): Type
    fun getSchoolsInfo(
        scope: CoroutineScope,
        onResult: UseCaseResponse<Type>?
    ) {
        scope.launch {
            try {
                val result = getSchoolsInfo()
                onResult?.onSuccess(result)
            } catch (e: CancellationException) {
                e.printStackTrace()
                onResult?.onError(traceErrorException(e))
            } catch (e: Exception) {
                e.printStackTrace()
                onResult?.onError(traceErrorException(e))
            }
        }
    }

}