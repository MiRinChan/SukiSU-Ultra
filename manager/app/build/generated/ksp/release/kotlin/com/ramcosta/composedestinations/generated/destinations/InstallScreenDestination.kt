package com.ramcosta.composedestinations.generated.destinations

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.InstallScreen

/**
 * Generated from [InstallScreen] 
 */
public data object InstallScreenDestination : BaseRoute(), DirectionDestinationSpec {
    
    public operator fun invoke(): Direction = this
    
    override val baseRoute: String = "install_screen"

    override val route: String = baseRoute
    
    @Composable
    override fun DestinationScope<Unit>.Content() {
		InstallScreen(
			navigator = destinationsNavigator
		)
    }
    
}