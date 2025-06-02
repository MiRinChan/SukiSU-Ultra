package com.ramcosta.composedestinations.generated.destinations

import android.net.Uri
import android.os.Bundle
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.generated.destinations.KernelFlashScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.navtype.uriNavType
import com.ramcosta.composedestinations.navargs.primitives.stringNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.KernelFlashScreen

public data class KernelFlashScreenDestinationNavArgs(
	val kernelUri: Uri,
	val selectedSlot: String? = null,
)

/**
 * Generated from [KernelFlashScreen] 
 */
public data object KernelFlashScreenDestination : BaseRoute(), TypedDestinationSpec<KernelFlashScreenDestinationNavArgs> {
    
    override fun invoke(navArgs: KernelFlashScreenDestinationNavArgs): Direction = with(navArgs) {
        invoke(kernelUri, selectedSlot)
    }
     
    public operator fun invoke(
		kernelUri: Uri,
		selectedSlot: String? = null,
    ): Direction {
        return Direction(
            route = "$baseRoute" + 
					"/${uriNavType.serializeValue(kernelUri)}" + 
					"?selectedSlot=${stringNavType.serializeValue("selectedSlot", selectedSlot)}"
        )
    }
    
    override val baseRoute: String = "kernel_flash_screen"

    override val route: String = "$baseRoute/{kernelUri}?selectedSlot={selectedSlot}"
    
	override val arguments: List<NamedNavArgument> get() = listOf(
		navArgument("kernelUri") {
			type = uriNavType
		},
		navArgument("selectedSlot") {
			type = stringNavType
			nullable = true
			defaultValue = null
		}
	)

    @Composable
    override fun DestinationScope<KernelFlashScreenDestinationNavArgs>.Content() {
		val (kernelUri, selectedSlot) = navArgs
		KernelFlashScreen(
			navigator = destinationsNavigator, 
			kernelUri = kernelUri, 
			selectedSlot = selectedSlot
		)
    }
                    
	override fun argsFrom(bundle: Bundle?): KernelFlashScreenDestinationNavArgs {
	    return KernelFlashScreenDestinationNavArgs(
			kernelUri = uriNavType.safeGet(bundle, "kernelUri") ?: throw RuntimeException("'kernelUri' argument is mandatory, but was not present!"),
			selectedSlot = stringNavType.safeGet(bundle, "selectedSlot"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): KernelFlashScreenDestinationNavArgs {
	    return KernelFlashScreenDestinationNavArgs(
			kernelUri = uriNavType.get(savedStateHandle, "kernelUri") ?: throw RuntimeException("'kernelUri' argument is mandatory, but was not present!"),
			selectedSlot = stringNavType.get(savedStateHandle, "selectedSlot"),
	    )
	}
}