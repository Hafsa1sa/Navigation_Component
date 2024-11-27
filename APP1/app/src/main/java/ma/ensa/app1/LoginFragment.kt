package ma.ensa.app1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ma.ensa.app1.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding=FragmentLoginBinding.inflate(inflater,container,false)
        binding.backButton.setOnClickListener{
            findNavController().navigateUp()
        }
        return binding.root
    }


}