package toon.cuyvers.fragmenttest

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import toon.cuyvers.fragmenttest.databinding.FragmentAddBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AddFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 */

private lateinit var binding: FragmentAddBinding

class AddFragment : Fragment() {

    private var score = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)


        val scoreArgs: AddFragmentArgs by navArgs<AddFragmentArgs>()

        binding.addButon.setOnClickListener() {
            addButtonPressed()
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(AddFragmentDirections.actionAddFragmentToEndFragment(score))
        }

        return binding.root

    }

    private fun addButtonPressed() {
        score += 1
        updateScore()

    }

    private fun updateScore() {
        binding.addNumber.text = score.toString()
    }
}
