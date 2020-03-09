package toon.cuyvers.fragmenttest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import toon.cuyvers.fragmenttest.R
import toon.cuyvers.fragmenttest.databinding.FragmentStartBinding

private lateinit var binding : FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_start, container, false)

        binding.startButton.setOnClickListener {
            findNavController().navigate(StartFragmentDirections.actionStartFragmentToAddFragment(0))
        }
        return binding.root
    }




}
