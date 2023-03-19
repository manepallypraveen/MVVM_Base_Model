package nitro.network.domain.usecase.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import nitro.network.domain.model.ApiError
import nitro.network.domain.usecase.base.UseCaseResponse
import nitro.network.domain.usecase.models.*
import nitro.network.domain.usecase.usecase.NycSchoolsUseCase
import kotlinx.coroutines.cancel

class NycSchoolsViewModel constructor(private val getUserInfoUseCase: NycSchoolsUseCase) :
    ViewModel() {

    val getUserIntoDataModel = MutableLiveData<List<NycSchoolsDataModel>>()
    val showProgressbar = MutableLiveData<Boolean>()
    val messageData = MutableLiveData<String>()

    fun getSchoolsInfo() {
        showProgressbar.value = true
        getUserInfoUseCase.getSchoolsInfo(
            viewModelScope,
            object : UseCaseResponse<List<NycSchoolsDataModel>> {
                override fun onSuccess(result: List<NycSchoolsDataModel>) {
                    Log.i(TAG, "result: $result")
                    getUserIntoDataModel.value = result
                    showProgressbar.value = false
                }

                override fun onError(apiError: ApiError?) {
                    messageData.value = apiError?.getErrorMessage()
                    showProgressbar.value = false
                }
            },
        )
    }


     override fun onCleared() {
        viewModelScope.cancel()
        super.onCleared()
    }

    companion object {
        private val TAG = NycSchoolsViewModel::class.java.name
    }

}
