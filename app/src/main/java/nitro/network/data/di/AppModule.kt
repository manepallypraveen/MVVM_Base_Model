package nitro.network.data.di

import nitro.network.domain.usecase.viewmodel.*
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AppModule = module {

    single { createPostRepository(get()) }

    viewModel { NycSchoolsViewModel(get()) }
    single { createGetUserInfoUseCase(get()) }

}
