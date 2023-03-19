package nitro.network.ui.general
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.Observer
//import androidx.navigation.fragment.findNavController
//import nitro.network.databinding.FragmentLoginBinding
//import nitro.network.util.*
//import org.koin.android.viewmodel.ext.android.viewModel
//
//
//class LoginFragment : Fragment() {
//
//    private var _binding: FragmentLoginBinding? = null
//    private val binding get() = _binding!!
//    private val viewModel: UserLoginViewModel by viewModel()
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentLoginBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
////        binding.signupBtn.setSingleClickListener {
////            val direction =
////                LoginFragmentDirections.actionLoginFragmentToFragmentSignup()
////            findNavController().navigate(direction)
////        }
//
//        with(viewModel) {
//            userLoginData.observe(requireActivity(), Observer {
//                if (it.status!!) {   //TODO add these after adding model respons from backend
////                    (activity as DashBoardScreenActivity).handleSideNavigationData()
//                    val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment() //actionLoginFragmentToSensorsListFragment
//                    findNavController().navigate(direction)
//                    onToast(it.message!!, requireActivity())
////                    (activity as DashBoardScreenActivity).handleSideNavigationData()
//                } else {
//                    it.message?.let { it1 ->
//                        onToast(it1, requireActivity())
//                    }
//                }
//            })
//
//            messageData.observe(requireActivity(), Observer { it ->
//                onToast(it.toString(), requireActivity())
//            })
//
//            showProgressbar.observe(requireActivity(), Observer { isVisible ->
//                binding.progressBar.visibility =
//                    if (isVisible) android.view.View.VISIBLE else android.view.View.GONE
//            })
//        }
//
//
//    }
//
//    var userData = UserLoginRequest()
//
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//
//
//}