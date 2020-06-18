package com.sophoun.android.core.utils

import org.junit.jupiter.api.Test
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

class EncryptDecryptUtilsTest {

    @Test
    fun encypted() {
        val plaintext: ByteArray = "hello".toByteArray()
        val keygen = KeyGenerator.getInstance("AES")
        keygen.init(256)
        val key: SecretKey = keygen.generateKey()
        val cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING")
        cipher.init(Cipher.ENCRYPT_MODE, key)
        val ciphertext: ByteArray = cipher.doFinal(plaintext)
        println("Cipher text" + String(ciphertext))

        cipher.init(Cipher.DECRYPT_MODE, key)
        val cipherDecrypted = cipher.doFinal(ciphertext)
        println(String(cipherDecrypted))
    }
}