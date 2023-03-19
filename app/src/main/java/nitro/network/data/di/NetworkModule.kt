package nitro.network.data.di

import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import nitro.network.data.remote.ApiService
import nitro.network.data.repository.PostsRepositoryImp
import nitro.network.domain.repository.PostsRepository
import nitro.network.domain.usecase.usecase.*
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import nitro.network.BuildConfig
import nitro.network.util.AppConstants.Companion.SENSORS_BASE_URL
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

private const val TIME_OUT = 30L


val NetworkModule = module {

    single { createService(get()) }

    single { createRetrofit(get(), SENSORS_BASE_URL) }

    single { createOkHttpClient() }

    single { MoshiConverterFactory.create() }

    single { Moshi.Builder().build() }

}

fun createRetrofit(okHttpClient: OkHttpClient, sensorUrl1: String): Retrofit {

    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    return Retrofit.Builder()
        .baseUrl(sensorUrl1)
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create(moshi)).build()
}

fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC

//    val httpLoggingInterceptor = HttpLoggingInterceptor()
//    httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

    return OkHttpClient.Builder()
        .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
        .readTimeout(TIME_OUT, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)//.build()
//        .addInterceptor(
//            LoggingInterceptor.Builder()
//                .loggable(BuildConfig.DEBUG)
//                .setLevel(Level.BASIC)
//                .log(Platform.INFO)
//                .request("LOG")
//                .response("LOG")
//                .executor(Executors.newSingleThreadExecutor())
//                .build()
//        )
        .build()


}


fun createService(retrofit: Retrofit): ApiService {
    return retrofit.create(ApiService::class.java)
}

fun createPostRepository(apiService: ApiService): PostsRepository {
    return PostsRepositoryImp(apiService)
}

fun createGetUserInfoUseCase(postsRepository: PostsRepository): NycSchoolsUseCase {
    return NycSchoolsUseCase(postsRepository)
}

