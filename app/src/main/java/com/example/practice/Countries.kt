package com.example.practice

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Countries(
    var name : String = "",
    var detail : String = "",
    var photo : Int = 0
) : Parcelable
