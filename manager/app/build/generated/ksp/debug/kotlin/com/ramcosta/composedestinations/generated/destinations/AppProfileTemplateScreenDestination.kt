package com.ramcosta.composedestinations.generated.destinations

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import com.ramcosta.composedestinations.navargs.primitives.booleanNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.scope.resultRecipient
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.AppProfileTemplateScreen

/**
 * Generated from [AppProfileTemplateScreen] 
 */
public data object AppProfileTemplateScreenDestination : BaseRoute(), DirectionDestinationSpec {
    
    public operator fun invoke(): Direction = this
    
    override val baseRoute: String = "app_profile_template_screen"

    override val route: String = baseRoute
    
    @Composable
    override fun DestinationScope<Unit>.Content() {
		AppProfileTemplateScreen(
			navigator = destinationsNavigator, 
			resultRecipient = resultRecipient(booleanNavType)
		)
    }
    
}