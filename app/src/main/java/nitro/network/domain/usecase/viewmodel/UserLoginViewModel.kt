package nitro.network.domain.usecase.viewmodel
//
//import android.util.Log
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import nitro.network.domain.model.ApiError
//import nitro.network.domain.usecase.base.UseCaseResponse
//import nitro.network.domain.usecase.models.UserProfileModel
//import kotlinx.coroutines.cancel
//
//class UserLoginViewModel constructor(private val userLoginUseCase: UserLoginUseCase/*,private val logoutUseCase: LogoutUseCase*/) :
//    ViewModel() {
//
//    val userLoginData = MutableLiveData<UserProfileModel>()
//    val showProgressbar = MutableLiveData<Boolean>()
//    val messageData = MutableLiveData<String>()
//    val userLogoutStatus = MutableLiveData<AllStatusModel>()
//
//    fun userLogin(partMap: UserLoginRequest?) {
//
//        showProgressbar.value = true
//        userLoginUseCase.userLogin(
//            viewModelScope, partMap,
//            object : UseCaseResponse<UserProfileModel> {
//                override fun onSuccess(result: UserProfileModel) {
//                    Log.i(TAG, "result: $result")
//                    userLoginData.value = result
//                    showProgressbar.value = false
//                }
//
//                override fun onError(apiError: ApiError?) {
//                    messageData.value = apiError?.getErrorMessage()
//                    showProgressbar.value = false
//                }
//            },
//        )
//    }
//
////    fun logout(token: String?) {
////        showProgressbar.value = true
////        logoutUseCase.logout(
////            viewModelScope, token,
////            object : UseCaseResponse<AllStatusModel> {
////                override fun onSuccess(result: AllStatusModel) {
////                    Log.i(TAG, "result: $result")
////                    userLogoutStatus.value = result
////                    showProgressbar.value = false
////                }
////
////                override fun onError(apiError: ApiError?) {
////                    messageData.value = apiError?.getErrorMessage()
////                    showProgressbar.value = false
////                }
////            },
////        )
////    }
//
//    override fun onCleared() {
//        viewModelScope.cancel()
//        super.onCleared()
//    }
//
//    companion object {
//        private val TAG = UserLoginViewModel::class.java.name
//    }
//
//}
