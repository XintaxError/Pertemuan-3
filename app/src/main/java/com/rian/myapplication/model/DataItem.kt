package com.rian.myapplication.model

import com.google.gson.annotations.SerializedName

data class DataItem(
    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("firs_name")
    val firsName: String? = null,

    @field:SerializedName("last_name")
    val lastName: String? = null,

    @field:SerializedName("avatar")
    val avatar: String? = null

)
