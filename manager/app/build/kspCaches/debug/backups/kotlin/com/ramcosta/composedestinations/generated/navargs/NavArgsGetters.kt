@file:Suppress("UNCHECKED_CAST")

package com.ramcosta.composedestinations.generated

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavBackStackEntry
import com.ramcosta.composedestinations.generated.destinations.AppProfileScreenDestination
import com.ramcosta.composedestinations.generated.destinations.AppProfileScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.ExecuteModuleActionScreenDestination
import com.ramcosta.composedestinations.generated.destinations.ExecuteModuleActionScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.FlashScreenDestination
import com.ramcosta.composedestinations.generated.destinations.FlashScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.KernelFlashScreenDestination
import com.ramcosta.composedestinations.generated.destinations.KernelFlashScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestination
import com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestinationNavArgs
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

public inline fun <reified T: Any> SavedStateHandle.navArgs(): T {
    return navArgs(T::class.java, this)
}

public inline fun <reified T: Any> NavBackStackEntry.navArgs(): T {
    return navArgs(T::class.java, this)
}

public fun <T: Any> navArgs(argsClass: Class<T>, argsContainer: NavBackStackEntry): T {
    return destinationWithArgsType(argsClass).argsFrom(argsContainer) as T
}

public fun <T: Any> navArgs(argsClass: Class<T>, argsContainer: SavedStateHandle): T {
    return destinationWithArgsType(argsClass).argsFrom(argsContainer) as T
}



private fun <T: Any> destinationWithArgsType(argsClass: Class<T>): DestinationSpec {
    return when (argsClass) {
		AppProfileScreenDestinationNavArgs::class.java -> AppProfileScreenDestination
		ExecuteModuleActionScreenDestinationNavArgs::class.java -> ExecuteModuleActionScreenDestination
		FlashScreenDestinationNavArgs::class.java -> FlashScreenDestination
		KernelFlashScreenDestinationNavArgs::class.java -> KernelFlashScreenDestination
		TemplateEditorScreenDestinationNavArgs::class.java -> TemplateEditorScreenDestination
        else -> error("Class ${argsClass} is not a destination arguments class known by this module!")
    }
}


