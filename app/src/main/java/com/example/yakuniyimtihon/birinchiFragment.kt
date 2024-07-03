package com.example.yakuniyimtihon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yakuniyimtihon.databinding.FragmentBirinchiBinding


class birinchiFragment : Fragment() {
    lateinit var binding: FragmentBirinchiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_birinchi, container, false)
    }


}