package com.ramcosta.composedestinations.generated.navargs

import androidx.lifecycle.SavedStateHandle
import com.ramcosta.composedestinations.generated.destinations.AppProfileScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.ExecuteModuleActionScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.FlashScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.KernelFlashScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.navtype.*
import com.ramcosta.composedestinations.generated.navtype.flashItNavType
import com.ramcosta.composedestinations.generated.navtype.superUserViewModelAppInfoNavType
import com.ramcosta.composedestinations.generated.navtype.templateViewModelTemplateInfoNavType
import com.ramcosta.composedestinations.generated.navtype.uriNavType
import com.ramcosta.composedestinations.navargs.primitives.*
import com.ramcosta.composedestinations.navargs.primitives.array.*
import com.ramcosta.composedestinations.navargs.primitives.arraylist.*

public fun AppProfileScreenDestinationNavArgs.toSavedStateHandle(
    handle: SavedStateHandle = SavedStateHandle()
): SavedStateHandle {
	superUserViewModelAppInfoNavType.put(handle, "appInfo", appInfo)
    return handle
}

public fun ExecuteModuleActionScreenDestinationNavArgs.toSavedStateHandle(
    handle: SavedStateHandle = SavedStateHandle()
): SavedStateHandle {
	stringNavType.put(handle, "moduleId", moduleId)
    return handle
}

public fun FlashScreenDestinationNavArgs.toSavedStateHandle(
    handle: SavedStateHandle = SavedStateHandle()
): SavedStateHandle {
	flashItNavType.put(handle, "flashIt", flashIt)
    return handle
}

public fun KernelFlashScreenDestinationNavArgs.toSavedStateHandle(
    handle: SavedStateHandle = SavedStateHandle()
): SavedStateHandle {
	uriNavType.put(handle, "kernelUri", kernelUri)
	stringNavType.put(handle, "selectedSlot", selectedSlot)
    return handle
}

public fun TemplateEditorScreenDestinationNavArgs.toSavedStateHandle(
    handle: SavedStateHandle = SavedStateHandle()
): SavedStateHandle {
	templateViewModelTemplateInfoNavType.put(handle, "initialTemplate", initialTemplate)
	booleanNavType.put(handle, "readOnly", readOnly)
    return handle
}