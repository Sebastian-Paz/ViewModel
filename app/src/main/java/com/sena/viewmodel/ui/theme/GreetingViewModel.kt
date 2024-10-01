package com.sena.viewmodel.ui.theme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GreetingViewModel : ViewModel() {

    /*

     * Variable (-randomvm) que observamos y podemos modificar, se usa a nivel int*/

     private val _randomvm: MutableLiveData<Int> = MutableLiveData<Int>(0)
     val random: LiveData<Int> = _randomvm

     init {
         _randomvm.value = Random.nextInt(0,2023)
     }


}