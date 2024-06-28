package com.example.mylibrary

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class JsonUtils {
    private val moshi: Moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    fun <T> fromJson(json: String, clazz: Class<T>): T? {
        val adapter: JsonAdapter<T> = moshi.adapter(clazz)
        return adapter.fromJson(json)
    }

    fun <T> toJson(clazz: Class<T>): String {
        val adapter: JsonAdapter<T> = moshi.adapter(clazz)
        return "retornou"
    }
}