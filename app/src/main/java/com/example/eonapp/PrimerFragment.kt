 package com.example.eonapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.commit

 /**
 * A simple [Fragment] subclass.
 * Use the [PrimerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimerFragment : Fragment(R.layout.fragment_primer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn_navegar)
        button.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                //add(R.id.fragment_container_view_tag, SegundoFragment())
                replace(R.id.fragment_container_view_tag, SegundoFragment())
                addToBackStack("primerFragment")
            }
        }
    }
}