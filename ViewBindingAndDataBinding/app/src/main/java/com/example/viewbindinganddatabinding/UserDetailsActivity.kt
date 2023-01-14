package com.example.viewbindinganddatabinding

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindinganddatabinding.databinding.UserDetailsActivityBinding

class UserDetailsActivity : AppCompatActivity() {
    private lateinit var binding: UserDetailsActivityBinding
    private lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = UserDetailsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindDataToViews()

        /*
        //way of data binding through code i.e. UserDetailsActivityBinding class
        binding.imgUser.setImageResource(user.userImageId)
        binding.txtUsername.text = user.username
        if(user.gender == 1){
             binding.radioButtonMale.isChecked = true}
        else {
            binding.radioButtonFemale.isChecked = true
        }

         */
    }

    private fun bindDataToViews(){
        user = intent.getSerializableExtra("user") as User
        binding.userObject = user
    }
    //task for - 14_01_2023 --> RecyclerView with View Type -- view Binding & Data Binding
    //task 1 -> RV 2 products & 1 user task 2 -> alternate user & product
    //task -> changes told in today's task - add 2 text views for age & birth year
}