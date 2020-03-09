package toon.cuyvers.fragmenttest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.fragment.navArgs
import toon.cuyvers.fragmenttest.R
import toon.cuyvers.fragmenttest.databinding.FragmentEndBinding

private lateinit var binding : FragmentEndBinding

/**
 * A simple [Fragment] subclass.
 */
class EndFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_end, container, false)

        val scoreArgs: EndFragmentArgs by navArgs<EndFragmentArgs>()

        binding.scoreBox.text = scoreArgs.score.toString()

        // Inflate the layout for this fragment
        return binding.root
    }


}
