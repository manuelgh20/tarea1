package com.tarea.ui.Tarea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tarea.databinding.FragmentAddParqueoBinding
import com.tarea.databinding.FragmentTareaBinding


class AddParqueoFragment : Fragment() {

    private var _binding: FragmentAddParqueoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddParqueoBinding.inflate(inflater, container, false)

        return binding.root
    }

    private fun addParqueo(){


    }

}