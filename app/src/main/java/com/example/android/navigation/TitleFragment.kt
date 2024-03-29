package com.example.android.navigation


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragment2ToGameFragment())
            // Navigation.findNavController(it).navigate(R.id.action_titleFragment2_to_gameFragment) or it.findNavController().navigate(R.id.action_titleFragment2_to_gameFragment)
            // or
            //binding.playButton.setOnClickListener (Navigation.createNavigateOnclickListener(R.d.action_titleFragment2_to_gameFragment)
        }
        //Enable Option Menu
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
