package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //Inflate the fragment for to be show in activity
        val binding : FragmentTitleBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)

        //Active button "play"
        binding.playButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_titleFragment2_to_gameFragment) // or it.findNavController().navigate(R.id.action_titleFragment2_to_gameFragment)
            // or
            //binding.playButton.setOnClickListener (Navigation.createNavigateOnclickListener(R.d.action_titleFragment2_to_gameFragment)
        }

        return binding.root
    }


}
