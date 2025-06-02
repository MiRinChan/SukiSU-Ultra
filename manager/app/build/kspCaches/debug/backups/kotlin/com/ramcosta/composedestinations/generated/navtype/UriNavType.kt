package com.ramcosta.composedestinations.generated.navtype

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import com.ramcosta.composedestinations.navargs.DestinationsNavType
import com.ramcosta.composedestinations.navargs.DestinationsNavTypeSerializer
import com.ramcosta.composedestinations.navargs.parcelable.DefaultParcelableNavTypeSerializer
import com.ramcosta.composedestinations.navargs.primitives.DECODED_NULL
import com.ramcosta.composedestinations.navargs.primitives.ENCODED_NULL
import com.ramcosta.composedestinations.navargs.utils.encodeForRoute

public val uriNavType: UriNavType = UriNavType(DefaultParcelableNavTypeSerializer(Uri::class.java))

public class UriNavType(
    private val stringSerializer: DestinationsNavTypeSerializer<Parcelable>
) : DestinationsNavType<Uri?>() {

    override fun get(bundle: Bundle, key: String): Uri? {
        @Suppress("DEPRECATION")
        return bundle.getParcelable(key)
    }

    override fun put(bundle: Bundle, key: String, value: Uri?) {
        bundle.putParcelable(key, value)
    }

    override fun parseValue(value: String): Uri? {
        return if (value == DECODED_NULL) {
            null
        } else {
            stringSerializer.fromRouteString(value) as Uri       
        }
    }

    override fun serializeValue(value: Uri?): String {
        return if (value == null) {
            ENCODED_NULL
        } else {
            encodeForRoute(stringSerializer.toRouteString(value))
        }
    }
    
    override fun get(savedStateHandle: SavedStateHandle, key: String): Uri? {
        return savedStateHandle.get(key)
    }
    
    override fun put(savedStateHandle: SavedStateHandle, key: String, value: Uri?) {
        savedStateHandle[key] = value
    }
}