package com.example.format.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.format.R
import java.nio.file.Files.find

class homefragment: Fragment(R.layout.fragment_home) {

    private lateinit var editTextamount: EditText
    private lateinit var sendButton : Button

    val controller = Navigation.findNavController(view)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextamount = view.findViewById(R.id.editTextamount)
        sendButton = view.findViewById(R.id.Send)

        sendButton.setOnClickListener(){

            val amountText = editTextamount.text.toString()

            if(amountText.isEmpty())
                return@setOnClickListener

            val amount = amountText.toInt()

            val action = homefragmentDirections.actionHomefragmentToFragmentdashboard(amount)
            controller.navigate(action)

        }
    }
}