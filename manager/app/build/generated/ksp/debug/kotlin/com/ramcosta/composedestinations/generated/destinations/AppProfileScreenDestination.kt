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
import com.ramcosta.composedestinations.generated.destinations.AppProfileScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.navtype.superUserViewModelAppInfoNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.AppProfileScreen
import com.sukisu.ultra.ui.viewmodel.SuperUserViewModel

public data class AppProfileScreenDestinationNavArgs(
	val appInfo: SuperUserViewModel.AppInfo,
)

/**
 * Generated from [AppProfileScreen] 
 */
public data object AppProfileScreenDestination : BaseRoute(), TypedDestinationSpec<AppProfileScreenDestinationNavArgs> {
    
    override fun invoke(navArgs: AppProfileScreenDestinationNavArgs): Direction = with(navArgs) {
        invoke(appInfo)
    }
     
    public operator fun invoke(
		appInfo: SuperUserViewModel.AppInfo,
    ): Direction {
        return Direction(
            route = "$baseRoute" + 
					"/${superUserViewModelAppInfoNavType.serializeValue(appInfo)}"
        )
    }
    
    override val baseRoute: String = "app_profile_screen"

    override val route: String = "$baseRoute/{appInfo}"
    
	override val arguments: List<NamedNavArgument> get() = listOf(
		navArgument("appInfo") {
			type = superUserViewModelAppInfoNavType
		}
	)

    @Composable
    override fun DestinationScope<AppProfileScreenDestinationNavArgs>.Content() {
		val (appInfo) = navArgs
		AppProfileScreen(
			navigator = destinationsNavigator, 
			appInfo = appInfo
		)
    }
                    
	override fun argsFrom(bundle: Bundle?): AppProfileScreenDestinationNavArgs {
	    return AppProfileScreenDestinationNavArgs(
			appInfo = superUserViewModelAppInfoNavType.safeGet(bundle, "appInfo") ?: throw RuntimeException("'appInfo' argument is mandatory, but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): AppProfileScreenDestinationNavArgs {
	    return AppProfileScreenDestinationNavArgs(
			appInfo = superUserViewModelAppInfoNavType.get(savedStateHandle, "appInfo") ?: throw RuntimeException("'appInfo' argument is mandatory, but was not present!"),
	    )
	}
}