package ma.ensa.app1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ma.ensa.app1.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentWelcomeBinding.inflate(inflater,container,false)
        binding.goToLogin.setOnClickListener{
            it.findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
        binding.goToSignUp.setOnClickListener{
            it.findNavController().navigate(R.id.action_welcomeFragment_to_signupFragment)
        }
        return binding.root


    }


}



