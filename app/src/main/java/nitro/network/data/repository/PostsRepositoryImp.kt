package nitro.network.data.repository

import nitro.network.data.remote.ApiService
import nitro.network.domain.repository.PostsRepository
import nitro.network.domain.usecase.models.*
import nitro.network.util.API
import nitro.network.util.AppConstants

class PostsRepositoryImp(private val apiService: ApiService) : PostsRepository {

    override suspend fun getSchoolsInfo(): List<NycSchoolsDataModel> {
             return apiService.getSchoolsInfo( )
    }

//    override suspend fun getSatInfo(): NycSatDataModeltem {
//        return apiService.getSatInfo( )
//    }

}


