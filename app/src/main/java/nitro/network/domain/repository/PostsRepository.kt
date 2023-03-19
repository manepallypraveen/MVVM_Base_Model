package nitro.network.domain.repository

import nitro.network.domain.usecase.models.*

interface PostsRepository {

    suspend fun getSchoolsInfo(): List<NycSchoolsDataModel>
//    suspend fun getSatInfo(): NycSatDataModeltem

}