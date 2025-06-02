package com.ramcosta.composedestinations.generated

import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.generated.destinations.*
import com.ramcosta.composedestinations.generated.navgraphs.*
import com.ramcosta.composedestinations.spec.*
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
 * Class generated if any Composable is annotated with `@Destination`.
 * It aggregates all [DestinationSpec]s in their [NavGraphSpec]s.
 *
 * -------------------------------------------------------
 * **Legend:**                                           
 * * 🗺️: Navigation graph                              
 * * 📍: Destination                                   
 * * 🏁: Marks 🗺️/📍as the start of the parent graph   
 * * 🧩: Means 🗺️/📍is generated on external module          
 * -------------------------------------------------------
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
 * * ∙∙∙∙∙∙∙∙↳📍[SettingScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[SuperUserScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[AppProfileTemplateScreen]
 * * ∙∙∙∙∙∙∙∙↳📍[TemplateEditorScreen]
 */
internal object NavGraphs {

    val root = RootNavGraph
}