package com.lm.utils

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

/**
 * @author jiangbao on 2020/10/27.
 */
object AESUtils {
    fun encrypt(data:String){
        val sks=SecretKeySpec(data.toByteArray(),"AES")
        println(sks.algorithm)
    }


}

fun main() {
    AESUtils.encrypt("asdasd")
}