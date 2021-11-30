package com.example.format.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.format.R


class fragmentdashboard : Fragment(R.layout.framgnet_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            fragmentdashboardArgs.fromBundle(requireArguments()).amount.toString()

    }
}