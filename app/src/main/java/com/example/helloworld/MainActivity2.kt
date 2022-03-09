package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.helloworld.databinding.ActivityMain2Binding
import com.example.helloworld.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.fragment1.setOnClickListener{

            replaceFrag(Frag1())

        }

        binding.fragment2.setOnClickListener{

            replaceFrag(Frag2())

        }

        val prebutton = findViewById<Button>(R.id.button)

        prebutton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
    private fun replaceFrag(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout,fragment)
        fragmentTransaction.commit()

    }
}