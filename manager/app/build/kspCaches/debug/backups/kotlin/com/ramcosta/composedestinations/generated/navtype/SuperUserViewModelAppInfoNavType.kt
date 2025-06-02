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
import com.sukisu.ultra.ui.viewmodel.SuperUserViewModel

public val superUserViewModelAppInfoNavType: SuperUserViewModelAppInfoNavType = SuperUserViewModelAppInfoNavType(DefaultParcelableNavTypeSerializer(SuperUserViewModel.AppInfo::class.java))

public class SuperUserViewModelAppInfoNavType(
    private val stringSerializer: DestinationsNavTypeSerializer<Parcelable>
) : DestinationsNavType<SuperUserViewModel.AppInfo?>() {

    override fun get(bundle: Bundle, key: String): SuperUserViewModel.AppInfo? {
        @Suppress("DEPRECATION")
        return bundle.getParcelable(key)
    }

    override fun put(bundle: Bundle, key: String, value: SuperUserViewModel.AppInfo?) {
        bundle.putParcelable(key, value)
    }

    override fun parseValue(value: String): SuperUserViewModel.AppInfo? {
        return if (value == DECODED_NULL) {
            null
        } else {
            stringSerializer.fromRouteString(value) as SuperUserViewModel.AppInfo       
        }
    }

    override fun serializeValue(value: SuperUserViewModel.AppInfo?): String {
        return if (value == null) {
            ENCODED_NULL
        } else {
            encodeForRoute(stringSerializer.toRouteString(value))
        }
    }
    
    override fun get(savedStateHandle: SavedStateHandle, key: String): SuperUserViewModel.AppInfo? {
        return savedStateHandle.get(key)
    }
    
    override fun put(savedStateHandle: SavedStateHandle, key: String, value: SuperUserViewModel.AppInfo?) {
        savedStateHandle[key] = value
    }
}