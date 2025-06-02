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
import com.sukisu.ultra.ui.viewmodel.TemplateViewModel

public val templateViewModelTemplateInfoNavType: TemplateViewModelTemplateInfoNavType = TemplateViewModelTemplateInfoNavType(DefaultParcelableNavTypeSerializer(TemplateViewModel.TemplateInfo::class.java))

public class TemplateViewModelTemplateInfoNavType(
    private val stringSerializer: DestinationsNavTypeSerializer<Parcelable>
) : DestinationsNavType<TemplateViewModel.TemplateInfo?>() {

    override fun get(bundle: Bundle, key: String): TemplateViewModel.TemplateInfo? {
        @Suppress("DEPRECATION")
        return bundle.getParcelable(key)
    }

    override fun put(bundle: Bundle, key: String, value: TemplateViewModel.TemplateInfo?) {
        bundle.putParcelable(key, value)
    }

    override fun parseValue(value: String): TemplateViewModel.TemplateInfo? {
        return if (value == DECODED_NULL) {
            null
        } else {
            stringSerializer.fromRouteString(value) as TemplateViewModel.TemplateInfo       
        }
    }

    override fun serializeValue(value: TemplateViewModel.TemplateInfo?): String {
        return if (value == null) {
            ENCODED_NULL
        } else {
            encodeForRoute(stringSerializer.toRouteString(value))
        }
    }
    
    override fun get(savedStateHandle: SavedStateHandle, key: String): TemplateViewModel.TemplateInfo? {
        return savedStateHandle.get(key)
    }
    
    override fun put(savedStateHandle: SavedStateHandle, key: String, value: TemplateViewModel.TemplateInfo?) {
        savedStateHandle[key] = value
    }
}