package com.example.firebasefb

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

/**
 * A simple [Fragment] subclass.
 */
class select : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_select, container, false)
        val Nextpage = view.findViewById(R.id.login_button2) as Button
        Nextpage.setOnClickListener {
            val builder: android.app.AlertDialog.Builder =
                android.app.AlertDialog.Builder(this.context)
            builder.setTitle("ยืนยันการดูข้อมูล")
            builder.setMessage("ต้องการดูข้อมูลหรือไม่")
            builder.setPositiveButton("ยืนยัน") { _, _ ->
                val pa = recycler_view()
                val fm = fragmentManager
                val transaction: FragmentTransaction = fm!!.beginTransaction()
                transaction.replace(R.id.layout, pa, "fragment_MemberDetail")
                transaction.addToBackStack("fragment_MemberDetail")
                transaction.commit()
            }
            builder.setNegativeButton("ยกเลิก",
                DialogInterface.OnClickListener { _, _ ->
                    //dialog.dismiss();
                })

            builder.show()


        }


        val ab = view.findViewById(R.id.Nextpage) as Button
        ab.setOnClickListener {
            val builder: android.app.AlertDialog.Builder =
                android.app.AlertDialog.Builder(this.context)
            builder.setTitle("ยืนยันการดูข้อมูล")
            builder.setMessage("ต้องการดูข้อมูลหรือไม่")
            builder.setPositiveButton("ยืนยัน") { _, _ ->
                val an = main_chart()
                val fm = fragmentManager
                val transaction: FragmentTransaction = fm!!.beginTransaction()
                transaction.replace(R.id.layout, an, "fragment_MemberDetail")
                transaction.addToBackStack("fragment_MemberDetail")
                transaction.commit()
            }
            builder.setNegativeButton("ยกเลิก",
                DialogInterface.OnClickListener { _, _ ->
                    //dialog.dismiss();
                })

            builder.show()



        }
        return view

    }
}
