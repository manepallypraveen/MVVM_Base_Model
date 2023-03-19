package nitro.network.ui.general

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import nitro.network.databinding.FragmentHomeBinding
import nitro.network.domain.usecase.viewmodel.NycSchoolsViewModel
import nitro.network.util.onToast
import org.koin.android.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val userViewModel: NycSchoolsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        userViewModel.getSchoolsInfo()

        return binding.root
    }

    @ExperimentalCoroutinesApi
    override fun onStart() {
        super.onStart()
        userViewModel.viewModelScope.launch {
            with(userViewModel) {
                getUserIntoDataModel.observe(requireActivity(), {
                    if (it.size > 0) {
                        binding.progressBar.visibility = View.GONE
                        println("praveen inside success response  0 " + it.size)
                        println("praveen inside success response  0 " + it.get(0).school_email)
                    } else {
                        onToast("No Data To Display some Isue", requireActivity())
                    }
                })

                showProgressbar.observe(requireActivity(), Observer { isVisible ->
                    try {
                        if (isActive) {
                            binding.progressBar.visibility =
                                if (isVisible) View.VISIBLE else View.GONE
                        }
                    } catch (ex: Exception) {
                        Log.d("exception message", ex.cause?.message!!)  //Fatal Exception: Main
                    }
                })
            }
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.myDeviceLayout.setSingleClickListener {
//            hideKeyboard()
//            val direction =
//                HomeFragmentDirections.actionHomeFragmentToLoginFragment()
//            findNavController().navigate(direction)
//        }

    }


    companion object {
        const val SCROLL_DELAY = 3000L
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}

