package com.ramcosta.composedestinations.generated.destinations

import android.os.Bundle
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.generated.destinations.FlashScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.navtype.flashItNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.FlashIt
import com.sukisu.ultra.ui.screen.FlashScreen

public data class FlashScreenDestinationNavArgs(
	val flashIt: FlashIt,
)

/**
 * Generated from [FlashScreen] 
 */
public data object FlashScreenDestination : BaseRoute(), TypedDestinationSpec<FlashScreenDestinationNavArgs> {
    
    override fun invoke(navArgs: FlashScreenDestinationNavArgs): Direction = with(navArgs) {
        invoke(flashIt)
    }
     
    public operator fun invoke(
		flashIt: FlashIt,
    ): Direction {
        return Direction(
            route = "$baseRoute" + 
					"/${flashItNavType.serializeValue(flashIt)}"
        )
    }
    
    override val baseRoute: String = "flash_screen"

    override val route: String = "$baseRoute/{flashIt}"
    
	override val arguments: List<NamedNavArgument> get() = listOf(
		navArgument("flashIt") {
			type = flashItNavType
		}
	)

    @Composable
    override fun DestinationScope<FlashScreenDestinationNavArgs>.Content() {
		val (flashIt) = navArgs
		FlashScreen(
			navigator = destinationsNavigator, 
			flashIt = flashIt
		)
    }
                    
	override fun argsFrom(bundle: Bundle?): FlashScreenDestinationNavArgs {
	    return FlashScreenDestinationNavArgs(
			flashIt = flashItNavType.safeGet(bundle, "flashIt") ?: throw RuntimeException("'flashIt' argument is mandatory, but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): FlashScreenDestinationNavArgs {
	    return FlashScreenDestinationNavArgs(
			flashIt = flashItNavType.get(savedStateHandle, "flashIt") ?: throw RuntimeException("'flashIt' argument is mandatory, but was not present!"),
	    )
	}
}