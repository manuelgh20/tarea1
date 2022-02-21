package com.tarea.ui.Tarea

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.tarea.R
import com.tarea.databinding.FragmentTareaBinding
import com.tarea.viewmodel.TareaViewModel

class TareaFragment : Fragment() {

    private var _binding: FragmentTareaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(TareaViewModel::class.java)

        _binding = FragmentTareaBinding.inflate(inflater, container, false)

        binding.fbAgregar.setOnClickListener{

            findNavController().navigate(R.id.action_nav_tarea_to_addParqueoFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}