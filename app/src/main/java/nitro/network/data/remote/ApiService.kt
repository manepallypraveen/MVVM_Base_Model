package nitro.network.data.remote

import nitro.network.domain.model.*
import nitro.network.domain.usecase.models.*
import nitro.network.util.API
import retrofit2.http.*


interface ApiService {

    @GET(API.getSchoolsList)
    suspend fun getSchoolsInfo(): List<NycSchoolsDataModel>

//    @GET(API.getSatInfo)
//    suspend fun getSatInfo(): NycSatDataModeltem

}



