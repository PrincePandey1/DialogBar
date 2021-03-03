package com.example.android.alertdialogueandsnakebar

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_dialogue.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun AlertDialogue(view: View) {

        val builder = AlertDialog.Builder(this)
        //set title for alert dialog
        builder.setTitle(R.string.AlertDialgoue)
        //set message for alert dialog
        builder.setMessage(R.string.DialogMessage)
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes"){
                dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked yes", Toast.LENGTH_LONG).show()
        }
        //performing cancel action
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
            Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
        }
        //performing negative action
        builder.setNegativeButton("No"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()

    }
    fun SnakeBar(view: View) {

        Snackbar.make(view, "Replace with your own action",
            Snackbar.LENGTH_LONG).setAction("Click Me",null).show()

    }

    private fun customDialogueFunction(){
         val customDialogue = Dialog(this)

        customDialogue.setContentView(R.layout.custom_dialogue)
       customDialogue.btn_Submit.setOnClickListener {
           Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
           customDialogue.dismiss()
       }
        customDialogue.btn_Cancel.setOnClickListener {
            Toast.makeText(this, "Dismissed", Toast.LENGTH_SHORT).show()
            customDialogue.dismiss()
        }
        customDialogue.show()
    }

    fun CustomDialog(view: View) {
        customDialogueFunction()

    }

    fun ProgressBar(view: View) {
        progressBarFunction()
    }



    private fun progressBarFunction(){

        val progressBar = Dialog(this)
        progressBar.setContentView(R.layout.custom_dialog_progress)
        progressBar.show()
        }


    }

