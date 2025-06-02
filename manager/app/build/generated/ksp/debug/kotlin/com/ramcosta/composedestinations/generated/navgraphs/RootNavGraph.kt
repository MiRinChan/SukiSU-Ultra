@file:OptIn(com.ramcosta.composedestinations.annotation.internal.InternalDestinationsApi::class)

package com.ramcosta.composedestinations.generated.navgraphs

import androidx.annotation.Keep
import com.ramcosta.composedestinations.animations.NavHostAnimatedDestinationStyle
import com.ramcosta.composedestinations.animations.defaults.NoTransitions
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.generated.destinations.*
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.generated.navgraphs.*
import com.ramcosta.composedestinations.spec.*
import com.ramcosta.composedestinations.spec.DirectionNavHostGraphSpec
import com.sukisu.ultra.ui.screen.AppProfileScreen
import com.sukisu.ultra.ui.screen.AppProfileTemplateScreen
import com.sukisu.ultra.ui.screen.ExecuteModuleActionScreen
import com.sukisu.ultra.ui.screen.FlashScreen
import com.sukisu.ultra.ui.screen.HomeScreen
import com.sukisu.ultra.ui.screen.InstallScreen
import com.sukisu.ultra.ui.screen.KernelFlashScreen
import com.sukisu.ultra.ui.screen.KpmScreen
import com.sukisu.ultra.ui.screen.ModuleScreen
import com.sukisu.ultra.ui.screen.MoreSettingsScreen
import com.sukisu.ultra.ui.screen.SettingScreen
import com.sukisu.ultra.ui.screen.SuperUserScreen
import com.sukisu.ultra.ui.screen.TemplateEditorScreen

/**
 * Generated from [RootGraph]
 *
 * * 🗺️[RootGraph]
 * * ∙∙∙∙∙∙∙∙↳📍🏁[HomeScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[AppProfileScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[ExecuteModuleActionScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[FlashScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[InstallScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[KernelFlashScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[KpmScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[ModuleScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[MoreSettingsScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[SuperUserScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[AppProfileTemplateScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[TemplateEditorScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[SettingScreen]
 */
@Keep
public data object RootNavGraph : BaseRoute(), DirectionNavHostGraphSpec {
    
    override val startRoute: TypedRoute<Unit> = HomeScreenDestination

    override val defaultStartDirection: Direction = defaultStartDirection()
    
    override val destinations: List<DestinationSpec> get() = listOf(
		AppProfileScreenDestination,
		ExecuteModuleActionScreenDestination,
		FlashScreenDestination,
		InstallScreenDestination,
		KernelFlashScreenDestination,
		KpmScreenDestination,
		ModuleScreenDestination,
		MoreSettingsScreenDestination,
		SuperUserScreenDestination,
		AppProfileTemplateScreenDestination,
		TemplateEditorScreenDestination,
		HomeScreenDestination,
		SettingScreenDestination
    )

	override val defaultTransitions: NavHostAnimatedDestinationStyle = NoTransitions
    
	override val route: String = "root"



}
