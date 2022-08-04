package com.azmovhudstc.exapleApi.src.models

import com.azmovhudstc.exapleApi.src.models.Data

data class QuranApi(
    val code: Int,
    val `data`: ArrayList<Data>,
    val status: String
)