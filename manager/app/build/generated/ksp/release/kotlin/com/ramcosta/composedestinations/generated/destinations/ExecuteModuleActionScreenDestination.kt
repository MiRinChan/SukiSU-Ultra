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
import com.ramcosta.composedestinations.generated.destinations.ExecuteModuleActionScreenDestinationNavArgs
import com.ramcosta.composedestinations.navargs.primitives.stringNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.ExecuteModuleActionScreen

public data class ExecuteModuleActionScreenDestinationNavArgs(
	val moduleId: String,
)

/**
 * Generated from [ExecuteModuleActionScreen] 
 */
public data object ExecuteModuleActionScreenDestination : BaseRoute(), TypedDestinationSpec<ExecuteModuleActionScreenDestinationNavArgs> {
    
    override fun invoke(navArgs: ExecuteModuleActionScreenDestinationNavArgs): Direction = with(navArgs) {
        invoke(moduleId)
    }
     
    public operator fun invoke(
		moduleId: String,
    ): Direction {
        return Direction(
            route = "$baseRoute" + 
					"/${stringNavType.serializeValue("moduleId", moduleId)}"
        )
    }
    
    override val baseRoute: String = "execute_module_action_screen"

    override val route: String = "$baseRoute/{moduleId}"
    
	override val arguments: List<NamedNavArgument> get() = listOf(
		navArgument("moduleId") {
			type = stringNavType
		}
	)

    @Composable
    override fun DestinationScope<ExecuteModuleActionScreenDestinationNavArgs>.Content() {
		val (moduleId) = navArgs
		ExecuteModuleActionScreen(
			navigator = destinationsNavigator, 
			moduleId = moduleId
		)
    }
                    
	override fun argsFrom(bundle: Bundle?): ExecuteModuleActionScreenDestinationNavArgs {
	    return ExecuteModuleActionScreenDestinationNavArgs(
			moduleId = stringNavType.safeGet(bundle, "moduleId") ?: throw RuntimeException("'moduleId' argument is mandatory, but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): ExecuteModuleActionScreenDestinationNavArgs {
	    return ExecuteModuleActionScreenDestinationNavArgs(
			moduleId = stringNavType.get(savedStateHandle, "moduleId") ?: throw RuntimeException("'moduleId' argument is mandatory, but was not present!"),
	    )
	}
}