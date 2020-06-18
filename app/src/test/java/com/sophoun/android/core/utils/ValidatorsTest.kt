package com.sophoun.android.core.utils

import com.sophoun.android.core.utils.validation.Validators
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidatorsTest {

    private val http_url = "http://www.google.com"
    private val https_url = "https://www.google.com"
    private val sort_url = "https://www.google"
    private val wrong_url = "https:/www.google.com"
    private val long_url = "https://www.google.com/search?client=firefox-b-d&q=android+zoom+image"
    private val not_protocol_url = "www.google.com/search?client=firefox-b-d&q=android+zoom+image"
    private val not_protocol_url1 = "google.com/search?client=firefox-b-d&q=android+zoom+image"

    private val valid_email = "holatesting@mainmail.com"
    private val invalid_email = "\"jamehosttest@unix@mmail"
    private val invalid_email1 = "joshmix#export.com"

    private val ip_address = "192.168.1.1"
    private val invalid_ip_address = "192.168.1.256"
    private val subnetmask = "255.255.255.0"
    private val invalid_subnetmask = "255.255.256.0"

    @Test
    fun `validate url`() {
        assertEquals(Validators.isValidUrl(http_url), true)
        assertEquals(Validators.isValidUrl(https_url), true)
        assertEquals(Validators.isValidUrl(sort_url), true)
        assertEquals(Validators.isValidUrl(wrong_url), false)
        assertEquals(Validators.isValidUrl(long_url), true)
        assertEquals(Validators.isValidUrl(not_protocol_url), true)
        assertEquals(Validators.isValidUrl(not_protocol_url1), true)
    }

    @Test
    fun `validate email`() {
        assertEquals(Validators.isValidEmail(valid_email), true)
        assertEquals(Validators.isValidEmail(invalid_email), false)
        assertEquals(Validators.isValidEmail(invalid_email1), false)
    }

    @Test
    fun `validate ip address`() {
        assertEquals(Validators.isValidIpAddress(ip_address), true)
        assertEquals(Validators.isValidIpAddress(invalid_ip_address), false)
        assertEquals(Validators.isValidIpAddress(subnetmask), true)
        assertEquals(Validators.isValidIpAddress(invalid_subnetmask), false)
    }
}