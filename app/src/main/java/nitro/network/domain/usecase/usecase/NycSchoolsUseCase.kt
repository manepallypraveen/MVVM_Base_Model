package nitro.network.domain.usecase.usecase

import nitro.network.domain.repository.PostsRepository
import nitro.network.domain.usecase.models.*


class NycSchoolsUseCase constructor(
    private val postsRepository: PostsRepository
) : NycSchoolsUseCaseMain<List<NycSchoolsDataModel>, String>() {

    override suspend fun getSchoolsInfo(): List<NycSchoolsDataModel> {
        return postsRepository.getSchoolsInfo()
    }
}

