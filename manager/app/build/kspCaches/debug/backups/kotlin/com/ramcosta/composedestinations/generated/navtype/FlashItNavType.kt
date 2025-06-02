package com.ramcosta.composedestinations.generated.navtype

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import com.ramcosta.composedestinations.navargs.DestinationsNavType
import com.ramcosta.composedestinations.navargs.DestinationsNavTypeSerializer
import com.ramcosta.composedestinations.navargs.parcelable.DefaultParcelableNavTypeSerializer
import com.ramcosta.composedestinations.navargs.primitives.DECODED_NULL
import com.ramcosta.composedestinations.navargs.primitives.ENCODED_NULL
import com.ramcosta.composedestinations.navargs.utils.encodeForRoute
import com.sukisu.ultra.ui.screen.FlashIt

public val flashItNavType: FlashItNavType = FlashItNavType(DefaultParcelableNavTypeSerializer(FlashIt::class.java))

public class FlashItNavType(
    private val stringSerializer: DestinationsNavTypeSerializer<Parcelable>
) : DestinationsNavType<FlashIt?>() {

    override fun get(bundle: Bundle, key: String): FlashIt? {
        @Suppress("DEPRECATION")
        return bundle.getParcelable(key)
    }

    override fun put(bundle: Bundle, key: String, value: FlashIt?) {
        bundle.putParcelable(key, value)
    }

    override fun parseValue(value: String): FlashIt? {
        return if (value == DECODED_NULL) {
            null
        } else {
            stringSerializer.fromRouteString(value) as FlashIt       
        }
    }

    override fun serializeValue(value: FlashIt?): String {
        return if (value == null) {
            ENCODED_NULL
        } else {
            encodeForRoute(stringSerializer.toRouteString(value))
        }
    }
    
    override fun get(savedStateHandle: SavedStateHandle, key: String): FlashIt? {
        return savedStateHandle.get(key)
    }
    
    override fun put(savedStateHandle: SavedStateHandle, key: String, value: FlashIt?) {
        savedStateHandle[key] = value
    }
}