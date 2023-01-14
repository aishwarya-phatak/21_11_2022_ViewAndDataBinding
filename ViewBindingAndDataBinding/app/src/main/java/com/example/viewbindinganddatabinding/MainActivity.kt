package com.example.viewbindinganddatabinding

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.viewbindinganddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSetName.text = "Welcome To Android!"
        binding.btnSetName.setOnClickListener {
            binding.txtName.text = "Welcome To" + binding.edtName.text.toString()
            binding.imgLogo.setImageResource(R.mipmap.ic_launcher)
        }
        binding.btnShowUserDetails.setOnClickListener {
            var user = User(
                R.mipmap.ic_launcher,
                "Aishwarya",
                2,
                1990,
                "aishwarya.phatak@bitcode.in"
            )

            var intent : Intent = Intent(this,UserDetailsActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }

        /*
        binding.txtHelloWorld.text = "Welcome To Android!"

        //either of the two ways
        //attach a listener by the way 2 below
        binding.txtHelloWorld.setOnClickListener {
            binding.txtHelloWorld.textSize = 24.0F
            Log.e("tag","View is : $it")
        }

        //attach a listener by the way 1 below
        binding.txtHelloWorld.setOnClickListener(
            View.OnClickListener {
            binding.txtHelloWorld.setTextColor(Color.MAGENTA)
                Log.e("tag","View is : $it")
            }
        )

         */
    }
}