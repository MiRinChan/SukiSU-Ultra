package _generated._ramcosta._composedestinations._moduleregistry

import com.ramcosta.composedestinations.spec.DestinationSpec

public annotation class _Info_d3299119_dde5_4025_ac7d_dc89295ffd32(
    val moduleName: String,
    val packageName: String,
    val hasNavArgsPackage: Boolean,
    val typeResults: Array<_Destination_Result_Info_d3299119_dde5_4025_ac7d_dc89295ffd32> = emptyArray(),
    val topLevelGraphs: Array<String> = emptyArray()
)

public annotation class _Destination_Result_Info_d3299119_dde5_4025_ac7d_dc89295ffd32(
    val destination: String,
    val resultType: String,
    val resultNavType: String,
    val isResultNullable: Boolean
)

@_Info_d3299119_dde5_4025_ac7d_dc89295ffd32(
    moduleName = "",
    packageName = "com.ramcosta.composedestinations.generated",
    hasNavArgsPackage = true,
    typeResults = [
       _Destination_Result_Info_d3299119_dde5_4025_ac7d_dc89295ffd32(
           destination = "com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestination",
           resultType = "kotlin.Boolean",
           resultNavType = "com.ramcosta.composedestinations.navargs.primitives.booleanNavType",
           isResultNullable = false
       )
    ],
    topLevelGraphs = [
		"RootNavGraph"
    ]
)
public object _ModuleRegistry_d3299119_dde5_4025_ac7d_dc89295ffd32