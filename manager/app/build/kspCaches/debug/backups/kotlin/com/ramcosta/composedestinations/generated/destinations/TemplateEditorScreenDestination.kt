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
import com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestinationNavArgs
import com.ramcosta.composedestinations.generated.navtype.templateViewModelTemplateInfoNavType
import com.ramcosta.composedestinations.navargs.primitives.booleanNavType
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.require
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.scope.resultBackNavigator
import com.ramcosta.composedestinations.spec.*
import com.sukisu.ultra.ui.screen.TemplateEditorScreen
import com.sukisu.ultra.ui.viewmodel.TemplateViewModel

public data class TemplateEditorScreenDestinationNavArgs(
	val initialTemplate: TemplateViewModel.TemplateInfo,
	val readOnly: Boolean = true,
)

/**
 * Generated from [TemplateEditorScreen] 
 */
public data object TemplateEditorScreenDestination : BaseRoute(), TypedDestinationSpec<TemplateEditorScreenDestinationNavArgs> {
    
    override fun invoke(navArgs: TemplateEditorScreenDestinationNavArgs): Direction = with(navArgs) {
        invoke(initialTemplate, readOnly)
    }
     
    public operator fun invoke(
		initialTemplate: TemplateViewModel.TemplateInfo,
		readOnly: Boolean = true,
    ): Direction {
        return Direction(
            route = "$baseRoute" + 
					"/${templateViewModelTemplateInfoNavType.serializeValue(initialTemplate)}" + 
					"?readOnly=${booleanNavType.serializeValue(readOnly)}"
        )
    }
    
    override val baseRoute: String = "template_editor_screen"

    override val route: String = "$baseRoute/{initialTemplate}?readOnly={readOnly}"
    
	override val arguments: List<NamedNavArgument> get() = listOf(
		navArgument("initialTemplate") {
			type = templateViewModelTemplateInfoNavType
		},
		navArgument("readOnly") {
			type = booleanNavType
			val defValue: Boolean = true
			defaultValue = defValue
		}
	)

    @Composable
    override fun DestinationScope<TemplateEditorScreenDestinationNavArgs>.Content() {
		val (initialTemplate, readOnly) = navArgs
		TemplateEditorScreen(
			navigator = resultBackNavigator(booleanNavType), 
			initialTemplate = initialTemplate, 
			readOnly = readOnly
		)
    }
                    
	override fun argsFrom(bundle: Bundle?): TemplateEditorScreenDestinationNavArgs {
	    return TemplateEditorScreenDestinationNavArgs(
			initialTemplate = templateViewModelTemplateInfoNavType.safeGet(bundle, "initialTemplate") ?: throw RuntimeException("'initialTemplate' argument is mandatory, but was not present!"),
			readOnly = booleanNavType.safeGet(bundle, "readOnly") ?: throw RuntimeException("'readOnly' argument is not mandatory and not nullable but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): TemplateEditorScreenDestinationNavArgs {
	    return TemplateEditorScreenDestinationNavArgs(
			initialTemplate = templateViewModelTemplateInfoNavType.get(savedStateHandle, "initialTemplate") ?: throw RuntimeException("'initialTemplate' argument is mandatory, but was not present!"),
			readOnly = booleanNavType.get(savedStateHandle, "readOnly") ?: throw RuntimeException("'readOnly' argument is not mandatory and not nullable but was not present!"),
	    )
	}
}